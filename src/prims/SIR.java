/**
 */
package prims;

import org.eclipse.emf.ecore.EObject;

import prims.impl.SIRImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SIR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prims.SIR#getSIRid <em>SI Rid</em>}</li>
 *   <li>{@link prims.SIR#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link prims.SIR#getDateIssued <em>Date Issued</em>}</li>
 *   <li>{@link prims.SIR#getSIRQuantity <em>SIR Quantity</em>}</li>
 * </ul>
 *
 * @see prims.PrimsPackage#getSIR()
 * @model
 * @generated
 */
public interface SIR extends EObject {
	/**
	 * Returns the value of the '<em><b>SI Rid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SI Rid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SI Rid</em>' attribute.
	 * @see #setSIRid(String)
	 * @see prims.PrimsPackage#getSIR_SIRid()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSIRid();

	/**
	 * Sets the value of the '{@link prims.SIR#getSIRid <em>SI Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SI Rid</em>' attribute.
	 * @see #getSIRid()
	 * @generated
	 */
	void setSIRid(String value);

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(String)
	 * @see prims.PrimsPackage#getSIR_DateCreated()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDateCreated();

	/**
	 * Sets the value of the '{@link prims.SIR#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(String value);

	/**
	 * Returns the value of the '<em><b>Date Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Issued</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Issued</em>' attribute.
	 * @see #setDateIssued(String)
	 * @see prims.PrimsPackage#getSIR_DateIssued()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDateIssued();

	/**
	 * Sets the value of the '{@link prims.SIR#getDateIssued <em>Date Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Issued</em>' attribute.
	 * @see #getDateIssued()
	 * @generated
	 */
	void setDateIssued(String value);

	/**
	 * Returns the value of the '<em><b>SIR Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SIR Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SIR Quantity</em>' attribute.
	 * @see #setSIRQuantity(int)
	 * @see prims.PrimsPackage#getSIR_SIRQuantity()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getSIRQuantity();

	/**
	 * Sets the value of the '{@link prims.SIR#getSIRQuantity <em>SIR Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIR Quantity</em>' attribute.
	 * @see #getSIRQuantity()
	 * @generated
	 */
	void setSIRQuantity(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @model
	 * @generated
	 */
	SIRImpl createSIR();

} // SIR
