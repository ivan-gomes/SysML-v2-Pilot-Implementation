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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getRelatedFeature <em>Related Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedAssociationType <em>Owned Association Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getConnectorEnd <em>Connector End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends FeatureImpl implements Connector {
	
	public static final String CONNECTOR_SUBSETTING_DEFAULT = "Objects::links";
	public static final String BINARY_CONNECTOR_SUBSETTING_DEFAULT = "Objects::binaryLinks";
	
	/**
	 * The cached value of the '{@link #getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedRelatedElement_comp;
	/**
	 * The default value of the '{@link #isDirected() <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirected() <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected boolean isDirected = IS_DIRECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getRelatedElement() {
		@SuppressWarnings("unchecked")
		EList<Element> relatedFeature = (EList<Element>)((EList<?>)getRelatedFeature());
		return relatedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElement() {
  		return false;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> association = (EList<Type>)((EList<?>)getAssociation());
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getOwnedType() {
		@SuppressWarnings("unchecked")
		EList<Type> ownedAssociationType = (EList<Type>)((EList<?>)getOwnedAssociationType());
		return ownedAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		EList<Element> ownedRelatedElements = new EObjectEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT);
		ownedRelatedElements.addAll(getOwnedRelatedElement_comp());
		return ownedRelatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelatedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelatedElement != null)
				msgs = ((InternalEObject)newOwningRelatedElement).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		@SuppressWarnings("unchecked")
		EList<Element> targetFeature = (EList<Element>)((EList<?>)getTargetFeature());
		return targetFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Feature sourceFeature = getSourceFeature();
		if (sourceFeature != null) {
			source.add(sourceFeature);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__SOURCE, source.size(), source.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getRelatedFeature() {
		EList<Feature> relatedFeatures = new BasicInternalEList<Feature>(Feature.class);
		new ArrayList<Feature>(getConnectorEnd()).stream().forEach(end->
			((FeatureImpl)end).getFirstSubsettedFeature().
			ifPresent(relatedFeatures::add));
		return relatedFeatures;
	}
	
	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedFeature() <em>Related Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedFeature()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_FEATURE_ESUBSETS = new int[] {SysMLPackage.CONNECTOR__SOURCE_FEATURE, SysMLPackage.CONNECTOR__TARGET_FEATURE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedFeature() {
		return !getRelatedFeature().isEmpty();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.CONNECTOR__TARGET, SysMLPackage.CONNECTOR__SOURCE, SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT, SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Association> getAssociation() {
		EList<Association> associations = 
				new EObjectEList<Association>(Association.class, this, SysMLPackage.CONNECTOR__ASSOCIATION);
		super.getType().stream().
			filter(type->type instanceof Association).
			map(type->(Association)type).
			forEachOrdered(associations::add);
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociation() {
		return !getAssociation().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDirected() {
		return isDirected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDirected(boolean newIsDirected) {
		boolean oldIsDirected = isDirected;
		isDirected = newIsDirected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_DIRECTED, oldIsDirected, isDirected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getConnectorEnd() {
		return new DerivedConnectorEndList(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSourceFeature() {
		Feature sourceFeature = basicGetSourceFeature();
		return sourceFeature != null && sourceFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)sourceFeature) : sourceFeature;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetSourceFeature() {
		return getSourceFeatureOf(this);
	}
	
	public static Feature getSourceFeatureOf(Connector connector) {
		EList<Feature> relatedFeatures = connector.getRelatedFeature();
		return relatedFeatures.size() == 2? relatedFeatures.get(0): null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSourceFeature(Feature newSourceFeature) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceFeature() {
		return basicGetSourceFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getTargetFeature() {
		EList<Feature> targetFeatures = new EObjectEList<>(Feature.class, this, SysMLPackage.CONNECTOR__TARGET_FEATURE);
		addTargetFeatures(this, targetFeatures);
		return targetFeatures;
	}
	
	public static void addTargetFeatures(Connector connector, EList<Feature> targetFeatures) {
		EList<Feature> relatedFeatures = connector.getRelatedFeature();
		if (relatedFeatures.size() == 2) {
			targetFeatures.add(relatedFeatures.get(1));
		} else {
			targetFeatures.addAll(relatedFeatures);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetFeature() {
		return !getTargetFeature().isEmpty();
	}

	public static class DerivedConnectorEndList extends DerivedEObjectEList<Feature> {
		public DerivedConnectorEndList(InternalEObject owner) {
			super(Feature.class, owner, SysMLPackage.CONNECTOR__CONNECTOR_END, 
				  new int[]{SysMLPackage.ELEMENT__OWNED_RELATIONSHIP});
		}
		
		@Override
		protected boolean isIncluded(EStructuralFeature feature) {
			return false;
		}
		
		@Override
		protected boolean isIncluded(Object object) {
			return object instanceof EndFeatureMembership;
		}
		
		@Override
		protected Feature derive(Object object) {
			return object instanceof EndFeatureMembership? ((EndFeatureMembership)object).getMemberFeature(): null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Association> getOwnedAssociationType() {
		EList<Association> associations = new EObjectEList<Association>(Association.class, this, SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE);
		getAssociation().stream().filter(a->a.getOwner() == this).forEachOrdered(associations::add);
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedAssociationType() {
		return !getOwnedAssociationType().isEmpty();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> path(Feature relatedFeature) {
		EList<Feature> path = new BasicInternalEList<Feature>(Feature.class);
		getPath(path, getOwningNamespace(), relatedFeature);
		return path;
	}

	public static void getPath(EList<Feature> path, org.omg.sysml.lang.sysml.Package start, Feature feature) {
		if (feature != null) {
			org.omg.sysml.lang.sysml.Package owningNamespace = feature.getOwningNamespace();
			if (owningNamespace instanceof Feature && owningNamespace != start) {
				getPath(path, start, (Feature)owningNamespace);
			}
			path.add(feature);
		}
	}

	@Override
	protected String getDefaultSupertype() {
		return getConnectorEnd().size() > 2? 
				CONNECTOR_SUBSETTING_DEFAULT:
				BINARY_CONNECTOR_SUBSETTING_DEFAULT;
	}
	
	// Utility Methods
	
	public Feature addConnectorEnd(Feature relatedFeature) {
		Feature endFeature = SysMLFactory.eINSTANCE.createFeature();
		Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
		subsetting.setSubsettedFeature(relatedFeature);
		subsetting.setSubsettingFeature(endFeature);
		endFeature.getOwnedRelationship_comp().add(subsetting);
		FeatureMembership membership = SysMLFactory.eINSTANCE.createEndFeatureMembership();
		membership.setOwnedMemberFeature_comp(endFeature);
		getOwnedFeatureMembership_comp().add(membership);
		return endFeature;
	}
	
	public void setRelatedFeature(int index, Feature relatedFeature) {
		EList<Feature> connectorEnds = getConnectorEnd();
		if (index < connectorEnds.size()) {
			setRelatedFeature(connectorEnds.get(index), relatedFeature);
		}
	}

	public static void setRelatedFeature(Feature connectorEnd, Feature relatedFeature) {
		((FeatureImpl)connectorEnd).getFirstSubsetting().
			orElseGet(()->((FeatureImpl)connectorEnd).createSubsetting()).
			setSubsettedFeature(relatedFeature);
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONNECTOR__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.CONNECTOR__TARGET:
				return getTarget();
			case SysMLPackage.CONNECTOR__SOURCE:
				return getSource();
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP:
				return getOwnedRelatedElement_comp();
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
			case SysMLPackage.CONNECTOR__RELATED_FEATURE:
				return getRelatedFeature();
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				return getAssociation();
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				return getOwnedAssociationType();
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return isDirected();
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return getConnectorEnd();
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				return getTargetFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.CONNECTOR__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP:
				getOwnedRelatedElement_comp().clear();
				getOwnedRelatedElement_comp().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				getOwnedRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				getOwnedAssociationType().clear();
				getOwnedAssociationType().addAll((Collection<? extends Association>)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				setIsDirected((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				getConnectorEnd().clear();
				getConnectorEnd().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				setSourceFeature((Feature)newValue);
				return;
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				getTargetFeature().clear();
				getTargetFeature().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.CONNECTOR__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.CONNECTOR__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)null);
				return;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP:
				getOwnedRelatedElement_comp().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				return;
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				getAssociation().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				getOwnedAssociationType().clear();
				return;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				setIsDirected(IS_DIRECTED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				getConnectorEnd().clear();
				return;
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				setSourceFeature((Feature)null);
				return;
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				getTargetFeature().clear();
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
			case SysMLPackage.CONNECTOR__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.CONNECTOR__TARGET:
				return isSetTarget();
			case SysMLPackage.CONNECTOR__SOURCE:
				return isSetSource();
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				return !getOwnedRelatedElement().isEmpty();
			case SysMLPackage.CONNECTOR__RELATED_FEATURE:
				return isSetRelatedFeature();
			case SysMLPackage.CONNECTOR__TYPE:
				return isSetType();
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				return isSetOwnedType();
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				return isSetAssociation();
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				return isSetOwnedAssociationType();
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return isDirected != IS_DIRECTED_EDEFAULT;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return !getConnectorEnd().isEmpty();
			case SysMLPackage.CONNECTOR__SOURCE_FEATURE:
				return isSetSourceFeature();
			case SysMLPackage.CONNECTOR__TARGET_FEATURE:
				return isSetTargetFeature();
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
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				case SysMLPackage.CONNECTOR__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP;
				case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.CONNECTOR__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.CONNECTOR__TARGET;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.CONNECTOR__SOURCE;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP: return SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT_COMP;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDirected: ");
		result.append(isDirected);
		result.append(')');
		return result.toString();
	}

} //ConnectorImpl
