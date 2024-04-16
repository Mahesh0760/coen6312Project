/**
 */
package prims;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inspection Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prims.InspectionNote#getInspectionId <em>Inspection Id</em>}</li>
 *   <li>{@link prims.InspectionNote#getInspectedDate <em>Inspected Date</em>}</li>
 *   <li>{@link prims.InspectionNote#isStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see prims.PrimsPackage#getInspectionNote()
 * @model
 * @generated
 */
public interface InspectionNote extends EObject {
	/**
	 * Returns the value of the '<em><b>Inspection Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inspection Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspection Id</em>' attribute.
	 * @see #setInspectionId(String)
	 * @see prims.PrimsPackage#getInspectionNote_InspectionId()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInspectionId();

	/**
	 * Sets the value of the '{@link prims.InspectionNote#getInspectionId <em>Inspection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inspection Id</em>' attribute.
	 * @see #getInspectionId()
	 * @generated
	 */
	void setInspectionId(String value);

	/**
	 * Returns the value of the '<em><b>Inspected Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inspected Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inspected Date</em>' attribute.
	 * @see #setInspectedDate(String)
	 * @see prims.PrimsPackage#getInspectionNote_InspectedDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getInspectedDate();

	/**
	 * Sets the value of the '{@link prims.InspectionNote#getInspectedDate <em>Inspected Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inspected Date</em>' attribute.
	 * @see #getInspectedDate()
	 * @generated
	 */
	void setInspectedDate(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see prims.PrimsPackage#getInspectionNote_Status()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link prims.InspectionNote#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getStatusOfIN(String InspectionID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setStatusOfIN(String inspectionId, Boolean status);

} // InspectionNote
