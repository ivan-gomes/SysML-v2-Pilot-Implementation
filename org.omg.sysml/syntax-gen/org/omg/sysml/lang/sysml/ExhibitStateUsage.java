/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exhibit State Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An ExhibitStateUsage is a StateUsage that represents the exhibiting of another StateUsage. The StateUsage to be exhibited is related to the ExhibitStateUsage by a Subsetting relationship. 
 * 
 * If the ExhibitStateUsage is owned by a Part, then it also subsets the exhibitedStates property of that Part (as defined in the library model for Part), otherwise it subsets either "states" or "subsubstates", as required for a regular StateUsage.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ExhibitStateUsage#getExhibitedState <em>Exhibited State</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExhibitStateUsage()
 * @model
 * @generated
 */
public interface ExhibitStateUsage extends StateUsage {
	/**
	 * Returns the value of the '<em><b>Exhibited State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exhibited State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exhibited State</em>' reference.
	 * @see #setExhibitedState(StateUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getExhibitStateUsage_ExhibitedState()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='exhibitStateUsage'"
	 * @generated
	 */
	StateUsage getExhibitedState();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ExhibitStateUsage#getExhibitedState <em>Exhibited State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exhibited State</em>' reference.
	 * @see #getExhibitedState()
	 * @generated
	 */
	void setExhibitedState(StateUsage value);

} // ExhibitStateUsage
