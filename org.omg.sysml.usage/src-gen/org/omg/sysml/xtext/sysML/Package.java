/**
 * generated by Xtext 2.12.0
 */
package org.omg.sysml.xtext.sysML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.xtext.sysML.Package#getImport <em>Import</em>}</li>
 *   <li>{@link org.omg.sysml.xtext.sysML.Package#getMember <em>Member</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.xtext.sysML.SysMLPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Container
{
  /**
   * Returns the value of the '<em><b>Import</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.xtext.sysML.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import</em>' containment reference list.
   * @see org.omg.sysml.xtext.sysML.SysMLPackage#getPackage_Import()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImport();

  /**
   * Returns the value of the '<em><b>Member</b></em>' containment reference list.
   * The list contents are of type {@link org.omg.sysml.xtext.sysML.PackageMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member</em>' containment reference list.
   * @see org.omg.sysml.xtext.sysML.SysMLPackage#getPackage_Member()
   * @model containment="true"
   * @generated
   */
  EList<PackageMember> getMember();

} // Package
