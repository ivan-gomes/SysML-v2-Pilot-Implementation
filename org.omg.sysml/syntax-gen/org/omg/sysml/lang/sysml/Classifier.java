/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Classifier</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> ownedSuperclassings =
 * ownedGeneralizations->intersection(superclassing) <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.Classifier#getOwnedSuperclassing
 * <em>Owned Superclassing</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends Type {

	/**
	 * Returns the value of the '<em><b>Owned Superclassing</b></em>' reference
	 * list. The list contents are of type
	 * {@link org.omg.sysml.lang.sysml.Superclassing}. It is bidirectional and its
	 * opposite is
	 * '{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier <em>Owning
	 * Classifier</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 * <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedGeneralization() <em>Owned
	 * Generalization</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Superclassing</em>' reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owned Superclassing</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClassifier_OwnedSuperclassing()
	 * @see org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier
	 * @model opposite="owningClassifier" transient="true" volatile="true"
	 *        derived="true" ordered="false" annotation="subsets"
	 * @generated
	 */
	EList<Superclassing> getOwnedSuperclassing();
} // Classifier