/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A TransitionUsage is an ActionUsage that is a behavioral Step representing a transition between ActionUsages or StateUsages.</p>
 * 
 * <p>A TransitionUsage must subset, directly or indirectly, the base TransitionUsage <tt>transitionActions</tt>, if it is not a composite feature, or the TransitionUsage <tt>subtransitions</tt> inherited from its owner, if it is a composite feature.</p>
 * 
 * <p>A TransitionUsage may by related to some of its <tt>ownedFeatures</tt> using TransitionFeatureMembership Relationships,  corresponding to the triggers, guards and effects of the TransitionUsage.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTransitionOwningUsage <em>Transition Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getTriggerAction <em>Trigger Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getGuardExpression <em>Guard Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getEffectAction <em>Effect Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.TransitionUsage#getSuccession <em>Succession</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage()
 * @model
 * @generated
 */
public interface TransitionUsage extends ActionUsage {

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The source ActionUsage of this TransitionUsage, derived as the <tt>source</tt> of the <tt>succession</tt> for the TransitionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Source()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='outgoingTransition'"
	 * @generated
	 */
	ActionUsage getSource();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The target ActionUsage of this TransitionUsage, derived as the <tt>target</tt> of the <tt>succession</tt> for the TransitionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Target()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='incomingTransition'"
	 * @generated
	 */
	ActionUsage getTarget();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActionUsage value);

	/**
	 * Returns the value of the '<em><b>Trigger Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.AcceptActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The AcceptActionUsages that define the triggers of this TransitionUsage, derived as the <tt>ownedFeatures</tt> of this TransitionUsage related to it by a TransitionFeatureMembership with <tt>kind</tt> = <tt>trigger</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trigger Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_TriggerAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='triggeredTransition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<AcceptActionUsage> getTriggerAction();

	/**
	 * Returns the value of the '<em><b>Guard Expression</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Expressions that define the guards of this TransitionUsage, derived as the <tt>ownedFeatures</tt> of this TransitionUsage related to it by a TransitionFeatureMembership with <tt>kind</tt> = <tt>guard</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guard Expression</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_GuardExpression()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='guardedTransition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Expression> getGuardExpression();

	/**
	 * Returns the value of the '<em><b>Effect Action</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.ActionUsage}.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getFeature() <em>Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsages that define the effects of this TransitionUsage, derived as the <tt>ownedFeatures</tt> of this TransitionUsage related to it by a TransitionFeatureMembership with <tt>kind</tt> = <tt>effect</tt>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect Action</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_EffectAction()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='activeTransition'"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<ActionUsage> getEffectAction();

	/**
	 * Returns the value of the '<em><b>Succession</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Succession that is the <tt>ownedFeature</tt> of this TransitionUsage that redefines <tt>TransitionPerformance::transitionLink</tt>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Succession</em>' reference.
	 * @see #setSuccession(Succession)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_Succession()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='linkedTransition'"
	 *        annotation="subsets"
	 * @generated
	 */
	Succession getSuccession();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getSuccession <em>Succession</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succession</em>' reference.
	 * @see #getSuccession()
	 * @generated
	 */
	void setSuccession(Succession value);

	/**
	 * Returns the value of the '<em><b>Transition Owning Usage</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Usage#getNestedTransition <em>Nested Transition</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Usage#getOwningUsage() <em>Owning Usage</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Owning Usage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The Usage in which this TransitionUsage is nested.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition Owning Usage</em>' reference.
	 * @see #setTransitionOwningUsage(Usage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getTransitionUsage_TransitionOwningUsage()
	 * @see org.omg.sysml.lang.sysml.Usage#getNestedTransition
	 * @model opposite="nestedTransition" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 * @generated
	 */
	Usage getTransitionOwningUsage();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.TransitionUsage#getTransitionOwningUsage <em>Transition Owning Usage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition Owning Usage</em>' reference.
	 * @see #getTransitionOwningUsage()
	 * @generated
	 */
	void setTransitionOwningUsage(Usage value);
} // TransitionStep
