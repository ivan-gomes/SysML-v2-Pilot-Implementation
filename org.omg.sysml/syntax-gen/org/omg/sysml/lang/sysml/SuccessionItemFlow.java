/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Succession Item Flow</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>SuccessionItemFlows are ItemFlows that also provide temporal ordering. They classify Transfers that must complete before the target behavior can start.</p>
 * 
 * <p>Must be typed by M1 TransferBefore or one of its specializations.<br />
 * association-&gt;is=OrSpecializationOf(TransferBefore) }</p>
 * 
 * <p>SuccessionItemFlows are ItemFlows that also provide temporal ordering. They classify Transfers that must complete before the target behavior can start.</p>
 * 
 * <p>Must be typed by M1 TransferBefore or one of its specializations.<br />
 * association-&gt;is=OrSpecializationOf(TransferBefore) }</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getSuccessionItemFlow()
 * @model
 * @generated
 */
public interface SuccessionItemFlow extends ItemFlow, Succession {
} // SuccessionItemFlow
