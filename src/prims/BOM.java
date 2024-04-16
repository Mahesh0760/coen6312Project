/**
 */
package prims;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prims.BOM#getBOMid <em>BO Mid</em>}</li>
 *   <li>{@link prims.BOM#getDateCreated <em>Date Created</em>}</li>
 * </ul>
 *
 * @see prims.PrimsPackage#getBOM()
 * @model
 * @generated
 */
public interface BOM extends EObject {
	/**
	 * Returns the value of the '<em><b>BO Mid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BO Mid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BO Mid</em>' attribute.
	 * @see #setBOMid(String)
	 * @see prims.PrimsPackage#getBOM_BOMid()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBOMid();

	/**
	 * Sets the value of the '{@link prims.BOM#getBOMid <em>BO Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BO Mid</em>' attribute.
	 * @see #getBOMid()
	 * @generated
	 */
	void setBOMid(String value);

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
	 * @see prims.PrimsPackage#getBOM_DateCreated()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDateCreated();

	/**
	 * Sets the value of the '{@link prims.BOM#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void attachSpare(String BOMid, String SpareCode);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createBOM(String equipmentTag);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void displayBOM(String BOMid);

} // BOM
