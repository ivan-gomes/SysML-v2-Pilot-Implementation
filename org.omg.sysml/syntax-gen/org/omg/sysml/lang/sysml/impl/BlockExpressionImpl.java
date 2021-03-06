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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.BlockExpression;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ResultExpressionMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Block
 * Expression</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class BlockExpressionImpl extends ExpressionImpl implements BlockExpression {

	/**
	 * The cached value of the BindingConnector from the result of the last
	 * sub-Expression to the result of this BlockExpression.
	 */
	protected BindingConnector resultConnector = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BLOCK_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockExpressionImpl() {
		super();
	}

	// Additional redefinitions and subsets

	@Override
	public EList<Feature> getFeature() {
		getResultConnector();
		return super.getFeature();
	}
	
	public BindingConnector getResultConnector() {
		return resultConnector = getResultConnectorFor(this, resultConnector, this.getResult());
	}

	public static BindingConnector getResultConnectorFor(
			Type owningType, BindingConnector resultConnector, Feature result) {
		Expression resultExpression = 
				(Expression)((TypeImpl)owningType).getOwnedFeatureByMembership(ResultExpressionMembership.class);
		if (resultExpression != null) {
			resultConnector = updateBindingConnectorFor(
					owningType, resultConnector, resultExpression.getResult(), result);
		}
		return resultConnector;
	}
	
	public static BindingConnector updateBindingConnectorFor(
			Type owningType, BindingConnector connector, Feature source, Feature target) {
		if (connector == null) {
			connector = ((TypeImpl)owningType).addOwnedBindingConnector(source, target);
		} else {
			((ConnectorImpl) connector).setRelatedFeature(0, source);
			((ConnectorImpl) connector).setRelatedFeature(1, target);
		}
		return connector;
	}

} // BlockExpressionImpl
