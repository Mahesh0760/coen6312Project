/**
 */
package prims;

import org.eclipse.emf.ecore.EObject;

import prims.impl.PRImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prims.PR#getPRid <em>PRid</em>}</li>
 *   <li>{@link prims.PR#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link prims.PR#getUrgency <em>Urgency</em>}</li>
 *   <li>{@link prims.PR#getPRQuanitity <em>PR Quanitity</em>}</li>
 * </ul>
 *
 * @see prims.PrimsPackage#getPR()
 * @model
 * @generated
 */
public interface PR extends EObject {
	/**
	 * Returns the value of the '<em><b>PRid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PRid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PRid</em>' attribute.
	 * @see #setPRid(String)
	 * @see prims.PrimsPackage#getPR_PRid()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPRid();

	/**
	 * Sets the value of the '{@link prims.PR#getPRid <em>PRid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PRid</em>' attribute.
	 * @see #getPRid()
	 * @generated
	 */
	void setPRid(String value);

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
	 * @see prims.PrimsPackage#getPR_DateCreated()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDateCreated();

	/**
	 * Sets the value of the '{@link prims.PR#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(String value);

	/**
	 * Returns the value of the '<em><b>Urgency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Urgency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Urgency</em>' attribute.
	 * @see #setUrgency(String)
	 * @see prims.PrimsPackage#getPR_Urgency()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUrgency();

	/**
	 * Sets the value of the '{@link prims.PR#getUrgency <em>Urgency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Urgency</em>' attribute.
	 * @see #getUrgency()
	 * @generated
	 */
	void setUrgency(String value);

	/**
	 * Returns the value of the '<em><b>PR Quanitity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PR Quanitity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PR Quanitity</em>' attribute.
	 * @see #setPRQuanitity(int)
	 * @see prims.PrimsPackage#getPR_PRQuanitity()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getPRQuanitity();

	/**
	 * Sets the value of the '{@link prims.PR#getPRQuanitity <em>PR Quanitity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PR Quanitity</em>' attribute.
	 * @see #getPRQuanitity()
	 * @generated
	 */
	void setPRQuanitity(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PRImpl createPR();

} // PR
