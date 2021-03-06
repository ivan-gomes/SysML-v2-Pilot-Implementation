/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ViewDefinition is a PartDefinition that specifies how a view artifact is constructed to satisfy a <code>viewpoint</code>. It specifies a <code>modelQuery</code> to define the model content to be presented and a <code>rendering</code> to define how the model content is presented.</p>
 * 
 * </p>A ViewDefinition must subclass, directly or indirectly, the base ViewDefinition View from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getView <em>View</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getSatisfiedViewpoint <em>Satisfied Viewpoint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getModelQuery <em>Model Query</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewDefinition#getRendering <em>Rendering</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition()
 * @model
 * @generated
 */
public interface ViewDefinition extends PartDefinition {
	/**
	 * Returns the value of the '<em><b>View</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getUsage() <em>Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>usages</code> of this ViewDefinition that are ViewUsages.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>View</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_View()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='featuringView'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ViewUsage> getView();

	/**
	 * Returns the value of the '<em><b>Satisfied Viewpoint</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ViewpointUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ownedUsages</code> of this ViewDefinition that are ViewpointUsages for viewpoints satisfied by the ViewDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satisfied Viewpoint</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_SatisfiedViewpoint()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointSatisfyingViewDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ViewpointUsage> getSatisfiedViewpoint();

	/**
	 * Returns the value of the '<em><b>Model Query</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>A static query to be run against the <code>exposedPackage</code> of a ViewIUsage of this ViewDefinition in order to determine the model elements to be included in a view, derived as the single ModelQuery that is a <code>member</code> of the ViewDefinition.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Query</em>' reference.
	 * @see #setModelQuery(ModelQuery)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_ModelQuery()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='queryingViewDefinition'"
	 * @generated
	 */
	ModelQuery getModelQuery();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewDefinition#getModelQuery <em>Model Query</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Query</em>' reference.
	 * @see #getModelQuery()
	 * @generated
	 */
	void setModelQuery(ModelQuery value);

	/**
	 * Returns the value of the '<em><b>Rendering</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Definition#getOwnedUsage() <em>Owned Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The RenderingUsage to be used to render views defined by this ViewDefinition.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rendering</em>' reference.
	 * @see #setRendering(RenderingUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewDefinition_Rendering()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='renderingOwningViewDefinition'"
	 *        annotation="subsets"
	 * @generated
	 */
	RenderingUsage getRendering();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewDefinition#getRendering <em>Rendering</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rendering</em>' reference.
	 * @see #getRendering()
	 * @generated
	 */
	void setRendering(RenderingUsage value);

} // ViewDefinition
