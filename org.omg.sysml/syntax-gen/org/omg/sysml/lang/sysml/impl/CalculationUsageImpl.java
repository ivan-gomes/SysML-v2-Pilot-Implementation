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
package org.omg.sysml.lang.sysml.impl;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CalculationUsageImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CalculationUsageImpl#getCalculationDefinition <em>Calculation Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculationUsageImpl extends ActionUsageImpl implements CalculationUsage {

	public static final String CALCULATION_SUBSETTING_BASE_DEFAULT = "Calculations::calculations";
	public static final String CALCULATION_SUBSETTING_SUBCALCULATION_DEFAULT = "Calculations::Calculation::subcalculations";
	
	/**
	 * The cached value of the BindingConnector from the result of the last
	 * sub-Expression to the result of this FunctionUsage.
	 */
	protected BindingConnector resultConnector = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CalculationUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CALCULATION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getResult() {
		Feature result = basicGetResult();
		return result != null && result.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)result) : result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetResult() {
		return getResultParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setResult(Feature newResult) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getCalculationDefinition() {
		Function calculationDefinition = basicGetCalculationDefinition();
		return calculationDefinition != null && calculationDefinition.eIsProxy() ? (Function)eResolveProxy((InternalEObject)calculationDefinition) : calculationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Function basicGetCalculationDefinition() {
		return (Function)super.getActionDefinition().stream().
				filter(Function.class::isInstance).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setCalculationDefinition(Function newCalculationDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCalculationDefinition() {
		return basicGetCalculationDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getBehavior() {
		return getActionDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return getCalculationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return basicGetCalculationDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		setCalculationDefinition(newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunction() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Behavior> getActionDefinition() {
		EList<Behavior> actionDefinition = new UniqueEList<Behavior>();
		Function calculationDefinition = getCalculationDefinition();
		if (calculationDefinition != null) {
			actionDefinition.add(calculationDefinition);
		}
		return new UnionEObjectEList<Behavior>(this, SysMLPackage.Literals.ACTION_USAGE__ACTION_DEFINITION, actionDefinition.size(), actionDefinition.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionDefinition() {
  		return false;
	}

	@Override
	protected String getDefaultSupertype() {
		return isSubperformance()? 
					CALCULATION_SUBSETTING_SUBCALCULATION_DEFAULT:
					CALCULATION_SUBSETTING_BASE_DEFAULT;
	}
	
	public BindingConnector getResultConnector() {
		return resultConnector = BlockExpressionImpl.getResultConnectorFor(this, resultConnector, getResult());
	}
	
	// Other methods
	
	@Override
	public List<Feature> getOwnedParameters() {
		CalculationDefinitionImpl.addResultParameter(this);
		return super.getOwnedParameters();
	}
	
	@Override
	public void transform() {
		super.transform();
		CalculationDefinitionImpl.addResultParameter(this);
		getResultConnector();
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CALCULATION_USAGE__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SysMLPackage.CALCULATION_USAGE__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.CALCULATION_USAGE__CALCULATION_DEFINITION:
				if (resolve) return getCalculationDefinition();
				return basicGetCalculationDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.CALCULATION_USAGE__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SysMLPackage.CALCULATION_USAGE__RESULT:
				setResult((Feature)newValue);
				return;
			case SysMLPackage.CALCULATION_USAGE__CALCULATION_DEFINITION:
				setCalculationDefinition((Function)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.CALCULATION_USAGE__FUNCTION:
				setFunction((Function)null);
				return;
			case SysMLPackage.CALCULATION_USAGE__RESULT:
				setResult((Feature)null);
				return;
			case SysMLPackage.CALCULATION_USAGE__CALCULATION_DEFINITION:
				setCalculationDefinition((Function)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.CALCULATION_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.CALCULATION_USAGE__FUNCTION:
				return isSetFunction();
			case SysMLPackage.CALCULATION_USAGE__RESULT:
				return basicGetResult() != null;
			case SysMLPackage.CALCULATION_USAGE__ACTION_DEFINITION:
				return isSetActionDefinition();
			case SysMLPackage.CALCULATION_USAGE__CALCULATION_DEFINITION:
				return isSetCalculationDefinition();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CALCULATION_USAGE__FUNCTION: return SysMLPackage.EXPRESSION__FUNCTION;
				case SysMLPackage.CALCULATION_USAGE__RESULT: return SysMLPackage.EXPRESSION__RESULT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case SysMLPackage.EXPRESSION__FUNCTION: return SysMLPackage.CALCULATION_USAGE__FUNCTION;
				case SysMLPackage.EXPRESSION__RESULT: return SysMLPackage.CALCULATION_USAGE__RESULT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //CalculationUsageImpl
