/**
 */
package prims;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RFQ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prims.RFQ#getRFQid <em>RF Qid</em>}</li>
 *   <li>{@link prims.RFQ#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link prims.RFQ#getSupplierQuotation <em>Supplier Quotation</em>}</li>
 *   <li>{@link prims.RFQ#getUnitPrice <em>Unit Price</em>}</li>
 * </ul>
 *
 * @see prims.PrimsPackage#getRFQ()
 * @model
 * @generated
 */
public interface RFQ extends EObject {
	/**
	 * Returns the value of the '<em><b>RF Qid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RF Qid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RF Qid</em>' attribute.
	 * @see #setRFQid(String)
	 * @see prims.PrimsPackage#getRFQ_RFQid()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getRFQid();

	/**
	 * Sets the value of the '{@link prims.RFQ#getRFQid <em>RF Qid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RF Qid</em>' attribute.
	 * @see #getRFQid()
	 * @generated
	 */
	void setRFQid(String value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(String)
	 * @see prims.PrimsPackage#getRFQ_DueDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDueDate();

	/**
	 * Sets the value of the '{@link prims.RFQ#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(String value);

	/**
	 * Returns the value of the '<em><b>Supplier Quotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Quotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Quotation</em>' attribute.
	 * @see #setSupplierQuotation(String)
	 * @see prims.PrimsPackage#getRFQ_SupplierQuotation()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getSupplierQuotation();

	/**
	 * Sets the value of the '{@link prims.RFQ#getSupplierQuotation <em>Supplier Quotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Quotation</em>' attribute.
	 * @see #getSupplierQuotation()
	 * @generated
	 */
	void setSupplierQuotation(String value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' attribute.
	 * @see #setUnitPrice(int)
	 * @see prims.PrimsPackage#getRFQ_UnitPrice()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getUnitPrice();

	/**
	 * Sets the value of the '{@link prims.RFQ#getUnitPrice <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' attribute.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void AttachQuotation(int unitPrice, String supplierQuotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getPrice(String RFQid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createRFQ();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createPO();

} // RFQ
