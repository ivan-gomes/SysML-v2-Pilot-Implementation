/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.owl.owl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ontology File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.owl.owl.OntologyFile#getDocuments <em>Documents</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.owl.owl.OwlPackage#getOntologyFile()
 * @model
 * @generated
 */
public interface OntologyFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Documents</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.owl.owl.OntologyDocument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Documents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Documents</em>' containment reference list.
   * @see org.omg.sysml.owl.owl.OwlPackage#getOntologyFile_Documents()
   * @model containment="true"
   * @generated
   */
  EList<OntologyDocument> getDocuments();

} // OntologyFile