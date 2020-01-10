/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/

package org.omg.sysml.lang.sysml.util

import org.eclipse.xtext.resource.IResourceServiceProvider
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.omg.sysml.lang.sysml.Element

class SysMLLibraryUtil {
	
	public static final String DEFAULT_MODEL_LIBRARY_DIRECTORY = "/resource/sysml.library";
	
	static String modelLibraryDirectory = DEFAULT_MODEL_LIBRARY_DIRECTORY;
	
	def static setModelLibraryDirectory(String path) {
		modelLibraryDirectory = path
	}
	
	def static isModelLibrary(Resource resource) {
		return resource !== null && resource.URI.path.startsWith(modelLibraryDirectory)
	}
	
	def static IModelLibraryProvider getInstance(Resource resource) {
		try {
			IResourceServiceProvider.Registry.INSTANCE.getResourceServiceProvider(resource?.getURI)?.get(IModelLibraryProvider)
		} catch (Exception e) {
			System.out.println("[SysMLLibraryUtil] Cannot get library provider: " + e)
			null
		}
	}
	
	def static Element getLibraryElement(Element context, EReference reference, String name) {		
		return getInstance(context.eResource)?.getElement(context, reference, name)
	}
	
}