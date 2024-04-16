/**
 */
package prims;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see prims.PrimsPackage#getStaff()
 * @model
 * @generated
 */
public interface Staff extends Person {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void issueSpare(String SIRid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateQuantity(String spareCode, int AvlQuantity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addRFQtoPR(String dueDate, String supplierName);

} // Staff
