/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020 Mgnite Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Hisashi Miyashita, Mgnite Inc.
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml.eclipse;


import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.omg.sysml.plantuml.SysML2PlantUMLLinkProvider;
import org.omg.sysml.plantuml.SysML2PlantUMLText;

import net.sourceforge.plantuml.eclipse.utils.DiagramTextProvider2;
import net.sourceforge.plantuml.ecore.AbstractEcoreClassDiagramTextProvider;

public class SysMLDiagramTextProvider extends AbstractEcoreClassDiagramTextProvider implements DiagramTextProvider2 {
    public SysMLDiagramTextProvider() {
        super(XtextEditor.class);
    }

    @Override
    public boolean supportsSelection(final ISelection selection) {
        return selection instanceof ITextSelection;
    }
    
    @Override
    public boolean supportsPath(IPath path) {
        return "sysml".equals(path.getFileExtension());
    }

    private static class LinkProvider implements SysML2PlantUMLLinkProvider {
        @Override
        public String getLinkString(EObject eObj) {
            URI uri = SysMLDiagramLinkOpener.getEObjectLink(eObj);
            if (uri == null) return null;
            return uri.toString();
        }
    }

    private final SysML2PlantUMLText sysml2PlantUMLText = new SysML2PlantUMLText(new LinkProvider());

    private final EObjectAtOffsetHelper eObjectAtOffsetHelper = new EObjectAtOffsetHelper();

    @Override
    public String getDiagramText(IEditorPart editorPart, ISelection selection, Map<String, Object> markerAttributes) {
        XtextEditor xe = (XtextEditor) editorPart;
        XtextResource res = xe.getDocument().readOnly(new IUnitOfWork<XtextResource, XtextResource>() {
            @Override
            public XtextResource exec(XtextResource st) {
                return st;
            }
        });

        if (selection instanceof ITextSelection) {
            ITextSelection its = (ITextSelection) selection;
            int offset = its.getOffset();
            EObject eObj = eObjectAtOffsetHelper.resolveElementAt(res, offset);
            List<? extends EObject> eObjs = sysml2PlantUMLText.setupVisualizationEObjects(eObj);
            if (eObjs != null) {
                return sysml2PlantUMLText.sysML2PUML(eObjs);
            }
        }

        return sysml2PlantUMLText.sysML2PUML(res.getContents());
    }

    @Override
    public String getDiagramText(IPath path) {
        URI uri = URI.createPlatformResourceURI(path.toString(), true);
        ResourceSet resourceSet = new ResourceSetImpl();
        Resource res = resourceSet.getResource(uri, true);
        return sysml2PlantUMLText.sysML2PUML(res.getContents());
    }
}
