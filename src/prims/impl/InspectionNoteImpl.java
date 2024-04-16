/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prims.InspectionNote;
import prims.PrimsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inspection Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prims.impl.InspectionNoteImpl#getInspectionId <em>Inspection Id</em>}</li>
 *   <li>{@link prims.impl.InspectionNoteImpl#getInspectedDate <em>Inspected Date</em>}</li>
 *   <li>{@link prims.impl.InspectionNoteImpl#isStatus <em>Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InspectionNoteImpl extends MinimalEObjectImpl.Container implements InspectionNote {
	/**
	 * The default value of the '{@link #getInspectionId() <em>Inspection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectionId()
	 * @generated
	 * @ordered
	 */
	protected static final String INSPECTION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInspectionId() <em>Inspection Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectionId()
	 * @generated
	 * @ordered
	 */
	protected String inspectionId = INSPECTION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInspectedDate() <em>Inspected Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String INSPECTED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInspectedDate() <em>Inspected Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInspectedDate()
	 * @generated
	 * @ordered
	 */
	protected String inspectedDate = INSPECTED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InspectionNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.INSPECTION_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInspectionId() {
		return inspectionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInspectionId(String newInspectionId) {
		String oldInspectionId = inspectionId;
		inspectionId = newInspectionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.INSPECTION_NOTE__INSPECTION_ID, oldInspectionId, inspectionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInspectedDate() {
		return inspectedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInspectedDate(String newInspectedDate) {
		String oldInspectedDate = inspectedDate;
		inspectedDate = newInspectedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.INSPECTION_NOTE__INSPECTED_DATE, oldInspectedDate, inspectedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.INSPECTION_NOTE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStatusOfIN(String inspectionId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatusOfIN(String inspectionId, Boolean status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrimsPackage.INSPECTION_NOTE__INSPECTION_ID:
				return getInspectionId();
			case PrimsPackage.INSPECTION_NOTE__INSPECTED_DATE:
				return getInspectedDate();
			case PrimsPackage.INSPECTION_NOTE__STATUS:
				return isStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrimsPackage.INSPECTION_NOTE__INSPECTION_ID:
				setInspectionId((String)newValue);
				return;
			case PrimsPackage.INSPECTION_NOTE__INSPECTED_DATE:
				setInspectedDate((String)newValue);
				return;
			case PrimsPackage.INSPECTION_NOTE__STATUS:
				setStatus((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PrimsPackage.INSPECTION_NOTE__INSPECTION_ID:
				setInspectionId(INSPECTION_ID_EDEFAULT);
				return;
			case PrimsPackage.INSPECTION_NOTE__INSPECTED_DATE:
				setInspectedDate(INSPECTED_DATE_EDEFAULT);
				return;
			case PrimsPackage.INSPECTION_NOTE__STATUS:
				setStatus(STATUS_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PrimsPackage.INSPECTION_NOTE__INSPECTION_ID:
				return INSPECTION_ID_EDEFAULT == null ? inspectionId != null : !INSPECTION_ID_EDEFAULT.equals(inspectionId);
			case PrimsPackage.INSPECTION_NOTE__INSPECTED_DATE:
				return INSPECTED_DATE_EDEFAULT == null ? inspectedDate != null : !INSPECTED_DATE_EDEFAULT.equals(inspectedDate);
			case PrimsPackage.INSPECTION_NOTE__STATUS:
				return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PrimsPackage.INSPECTION_NOTE___GET_STATUS_OF_IN:
				getStatusOfIN(inspectionId);
				return null;
			case PrimsPackage.INSPECTION_NOTE___SET_STATUS_OF_IN:
				setStatusOfIN(inspectionId, status);
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (InspectionId: ");
		result.append(inspectionId);
		result.append(", InspectedDate: ");
		result.append(inspectedDate);
		result.append(", Status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //InspectionNoteImpl
