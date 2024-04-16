/**
 */
package prims;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prims.PO#getPOid <em>POid</em>}</li>
 *   <li>{@link prims.PO#getScheduledDelivery <em>Scheduled Delivery</em>}</li>
 *   <li>{@link prims.PO#getActualDelivery <em>Actual Delivery</em>}</li>
 * </ul>
 *
 * @see prims.PrimsPackage#getPO()
 * @model
 * @generated
 */
public interface PO extends EObject {
	/**
	 * Returns the value of the '<em><b>POid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>POid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>POid</em>' attribute.
	 * @see #setPOid(String)
	 * @see prims.PrimsPackage#getPO_POid()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPOid();

	/**
	 * Sets the value of the '{@link prims.PO#getPOid <em>POid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>POid</em>' attribute.
	 * @see #getPOid()
	 * @generated
	 */
	void setPOid(String value);

	/**
	 * Returns the value of the '<em><b>Scheduled Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Delivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Delivery</em>' attribute.
	 * @see #setScheduledDelivery(String)
	 * @see prims.PrimsPackage#getPO_ScheduledDelivery()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getScheduledDelivery();

	/**
	 * Sets the value of the '{@link prims.PO#getScheduledDelivery <em>Scheduled Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduled Delivery</em>' attribute.
	 * @see #getScheduledDelivery()
	 * @generated
	 */
	void setScheduledDelivery(String value);

	/**
	 * Returns the value of the '<em><b>Actual Delivery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Delivery</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Delivery</em>' attribute.
	 * @see #setActualDelivery(String)
	 * @see prims.PrimsPackage#getPO_ActualDelivery()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getActualDelivery();

	/**
	 * Sets the value of the '{@link prims.PO#getActualDelivery <em>Actual Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Delivery</em>' attribute.
	 * @see #getActualDelivery()
	 * @generated
	 */
	void setActualDelivery(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createIN(String POid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDeliveryDate(String POid);

} // PO
