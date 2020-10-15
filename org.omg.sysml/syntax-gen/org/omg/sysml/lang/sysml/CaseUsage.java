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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A CaseUsage is a Usage of a CaseDefinition.</p>
 * 
 * <p>A CaseUsage must subset, directly or indirectly, either the base CaseUsage <code>cases</code> from the Systems model library, if it is not owned by a CaseDefinition or CaseUsage, or the CaseUsage <code>subcases</code> inherited from its owner, otherwise.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.CaseUsage#getObjectiveRequirement <em>Objective Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.CaseUsage#getCaseDefinition <em>Case Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.CaseUsage#getSubjectParameter <em>Subject Parameter</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseUsage()
 * @model
 * @generated
 */
public interface CaseUsage extends CalculationUsage {
	/**
	 * Returns the value of the '<em><b>Objective Requirement</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <p>ownedFeature</p> of this CaseUsage that is owned via an ObjectiveMembership, and that must redefine, directly or indirectly, the <code>objective</code> RequirementUsage of the base CaseDefinition Case from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objective Requirement</em>' reference.
	 * @see #setObjectiveRequirement(RequirementUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseUsage_ObjectiveRequirement()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='objectiveOwningCase'"
	 *        annotation="subsets"
	 * @generated
	 */
	RequirementUsage getObjectiveRequirement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CaseUsage#getObjectiveRequirement <em>Objective Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objective Requirement</em>' reference.
	 * @see #getObjectiveRequirement()
	 * @generated
	 */
	void setObjectiveRequirement(RequirementUsage value);

	/**
	 * Returns the value of the '<em><b>Subject Parameter</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Behavior#getParameter() <em>Parameter</em>}'</li>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>parameter</cpde> of this CaseUsage that is owned via a SubjectMembership, which must redefine, directly or indirectly, the <code>subject</code> parameter of the base CaseDefinition Case from the Systems model library.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Parameter</em>' reference.
	 * @see #setSubjectParameter(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseUsage_SubjectParameter()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='subjectOwningCase'"
	 *        annotation="subsets"
	 * @generated
	 */
	Usage getSubjectParameter();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CaseUsage#getSubjectParameter <em>Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Parameter</em>' reference.
	 * @see #getSubjectParameter()
	 * @generated
	 */
	void setSubjectParameter(Usage value);

	/**
	 * Returns the value of the '<em><b>Case Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.CalculationUsage#getCalculationDefinition() <em>Calculation Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The CaseDefinition that is the type of this CaseUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Definition</em>' reference.
	 * @see #setCaseDefinition(CaseDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getCaseUsage_CaseDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedCase'"
	 *        annotation="redefines"
	 * @generated
	 */
	CaseDefinition getCaseDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.CaseUsage#getCaseDefinition <em>Case Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Definition</em>' reference.
	 * @see #getCaseDefinition()
	 * @generated
	 */
	void setCaseDefinition(CaseDefinition value);

} // CaseUsage
