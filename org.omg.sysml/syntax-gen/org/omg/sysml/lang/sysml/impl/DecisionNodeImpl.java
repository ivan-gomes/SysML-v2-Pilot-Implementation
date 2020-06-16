/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.DecisionNode;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DecisionNodeImpl extends ControlNodeImpl implements DecisionNode {

	public static final String DECISION_NODE_SUBSETTING_BASE_DEFAULT = "Actions::Action::decisions";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.DECISION_NODE;
	}

	@Override
	protected String getDefaultSupertype() {
		return DECISION_NODE_SUBSETTING_BASE_DEFAULT;
	}
	
} //DecisionNodeImpl
