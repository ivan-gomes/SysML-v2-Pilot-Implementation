/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.Entity#getEntityIRI <em>Entity IRI</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity IRI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity IRI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity IRI</em>' attribute.
   * @see #setEntityIRI(String)
   * @see org.omg.sysml.owl.owl.OwlPackage#getEntity_EntityIRI()
   * @model
   * @generated
   */
  String getEntityIRI();

  /**
   * Sets the value of the '{@link org.omg.sysml.owl.owl.Entity#getEntityIRI <em>Entity IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity IRI</em>' attribute.
   * @see #getEntityIRI()
   * @generated
   */
  void setEntityIRI(String value);

} // Entity