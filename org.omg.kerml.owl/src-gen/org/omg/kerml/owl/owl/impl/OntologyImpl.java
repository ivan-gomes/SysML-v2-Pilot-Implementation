/**
 * generated by Xtext 2.18.0.M3
 */
package org.omg.kerml.owl.owl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.kerml.owl.owl.Annotation;
import org.omg.kerml.owl.owl.Axiom;
import org.omg.kerml.owl.owl.Ontology;
import org.omg.kerml.owl.owl.OwlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ontology</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.kerml.owl.owl.impl.OntologyImpl#getOntologyIRI <em>Ontology IRI</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.impl.OntologyImpl#getVersionIRI <em>Version IRI</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.impl.OntologyImpl#getDirectlyImportsDocuments <em>Directly Imports Documents</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.impl.OntologyImpl#getOntologyAnnotations <em>Ontology Annotations</em>}</li>
 *   <li>{@link org.omg.kerml.owl.owl.impl.OntologyImpl#getAxioms <em>Axioms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OntologyImpl extends MinimalEObjectImpl.Container implements Ontology
{
  /**
   * The default value of the '{@link #getOntologyIRI() <em>Ontology IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyIRI()
   * @generated
   * @ordered
   */
  protected static final String ONTOLOGY_IRI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOntologyIRI() <em>Ontology IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyIRI()
   * @generated
   * @ordered
   */
  protected String ontologyIRI = ONTOLOGY_IRI_EDEFAULT;

  /**
   * The default value of the '{@link #getVersionIRI() <em>Version IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionIRI()
   * @generated
   * @ordered
   */
  protected static final String VERSION_IRI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersionIRI() <em>Version IRI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersionIRI()
   * @generated
   * @ordered
   */
  protected String versionIRI = VERSION_IRI_EDEFAULT;

  /**
   * The cached value of the '{@link #getDirectlyImportsDocuments() <em>Directly Imports Documents</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectlyImportsDocuments()
   * @generated
   * @ordered
   */
  protected EList<String> directlyImportsDocuments;

  /**
   * The cached value of the '{@link #getOntologyAnnotations() <em>Ontology Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOntologyAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> ontologyAnnotations;

  /**
   * The cached value of the '{@link #getAxioms() <em>Axioms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxioms()
   * @generated
   * @ordered
   */
  protected EList<Axiom> axioms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OntologyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OwlPackage.Literals.ONTOLOGY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOntologyIRI()
  {
    return ontologyIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOntologyIRI(String newOntologyIRI)
  {
    String oldOntologyIRI = ontologyIRI;
    ontologyIRI = newOntologyIRI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ONTOLOGY__ONTOLOGY_IRI, oldOntologyIRI, ontologyIRI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVersionIRI()
  {
    return versionIRI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVersionIRI(String newVersionIRI)
  {
    String oldVersionIRI = versionIRI;
    versionIRI = newVersionIRI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OwlPackage.ONTOLOGY__VERSION_IRI, oldVersionIRI, versionIRI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getDirectlyImportsDocuments()
  {
    if (directlyImportsDocuments == null)
    {
      directlyImportsDocuments = new EDataTypeEList<String>(String.class, this, OwlPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS);
    }
    return directlyImportsDocuments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Annotation> getOntologyAnnotations()
  {
    if (ontologyAnnotations == null)
    {
      ontologyAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS);
    }
    return ontologyAnnotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Axiom> getAxioms()
  {
    if (axioms == null)
    {
      axioms = new EObjectContainmentEList<Axiom>(Axiom.class, this, OwlPackage.ONTOLOGY__AXIOMS);
    }
    return axioms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return ((InternalEList<?>)getOntologyAnnotations()).basicRemove(otherEnd, msgs);
      case OwlPackage.ONTOLOGY__AXIOMS:
        return ((InternalEList<?>)getAxioms()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OwlPackage.ONTOLOGY__ONTOLOGY_IRI:
        return getOntologyIRI();
      case OwlPackage.ONTOLOGY__VERSION_IRI:
        return getVersionIRI();
      case OwlPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        return getDirectlyImportsDocuments();
      case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return getOntologyAnnotations();
      case OwlPackage.ONTOLOGY__AXIOMS:
        return getAxioms();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OwlPackage.ONTOLOGY__ONTOLOGY_IRI:
        setOntologyIRI((String)newValue);
        return;
      case OwlPackage.ONTOLOGY__VERSION_IRI:
        setVersionIRI((String)newValue);
        return;
      case OwlPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        getDirectlyImportsDocuments().clear();
        getDirectlyImportsDocuments().addAll((Collection<? extends String>)newValue);
        return;
      case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        getOntologyAnnotations().clear();
        getOntologyAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case OwlPackage.ONTOLOGY__AXIOMS:
        getAxioms().clear();
        getAxioms().addAll((Collection<? extends Axiom>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.ONTOLOGY__ONTOLOGY_IRI:
        setOntologyIRI(ONTOLOGY_IRI_EDEFAULT);
        return;
      case OwlPackage.ONTOLOGY__VERSION_IRI:
        setVersionIRI(VERSION_IRI_EDEFAULT);
        return;
      case OwlPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        getDirectlyImportsDocuments().clear();
        return;
      case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        getOntologyAnnotations().clear();
        return;
      case OwlPackage.ONTOLOGY__AXIOMS:
        getAxioms().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OwlPackage.ONTOLOGY__ONTOLOGY_IRI:
        return ONTOLOGY_IRI_EDEFAULT == null ? ontologyIRI != null : !ONTOLOGY_IRI_EDEFAULT.equals(ontologyIRI);
      case OwlPackage.ONTOLOGY__VERSION_IRI:
        return VERSION_IRI_EDEFAULT == null ? versionIRI != null : !VERSION_IRI_EDEFAULT.equals(versionIRI);
      case OwlPackage.ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS:
        return directlyImportsDocuments != null && !directlyImportsDocuments.isEmpty();
      case OwlPackage.ONTOLOGY__ONTOLOGY_ANNOTATIONS:
        return ontologyAnnotations != null && !ontologyAnnotations.isEmpty();
      case OwlPackage.ONTOLOGY__AXIOMS:
        return axioms != null && !axioms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (ontologyIRI: ");
    result.append(ontologyIRI);
    result.append(", versionIRI: ");
    result.append(versionIRI);
    result.append(", directlyImportsDocuments: ");
    result.append(directlyImportsDocuments);
    result.append(')');
    return result.toString();
  }

} //OntologyImpl
