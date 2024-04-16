/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prims.PO;
import prims.PrimsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prims.impl.POImpl#getPOid <em>POid</em>}</li>
 *   <li>{@link prims.impl.POImpl#getScheduledDelivery <em>Scheduled Delivery</em>}</li>
 *   <li>{@link prims.impl.POImpl#getActualDelivery <em>Actual Delivery</em>}</li>
 * </ul>
 *
 * @generated
 */
public class POImpl extends MinimalEObjectImpl.Container implements PO {
	/**
	 * The default value of the '{@link #getPOid() <em>POid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOid()
	 * @generated
	 * @ordered
	 */
	protected static final String POID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPOid() <em>POid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPOid()
	 * @generated
	 * @ordered
	 */
	protected String pOid = POID_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduledDelivery() <em>Scheduled Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDelivery()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHEDULED_DELIVERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduledDelivery() <em>Scheduled Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledDelivery()
	 * @generated
	 * @ordered
	 */
	protected String scheduledDelivery = SCHEDULED_DELIVERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getActualDelivery() <em>Actual Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDelivery()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_DELIVERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualDelivery() <em>Actual Delivery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualDelivery()
	 * @generated
	 * @ordered
	 */
	protected String actualDelivery = ACTUAL_DELIVERY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected POImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.PO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPOid() {
		return pOid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPOid(String newPOid) {
		String oldPOid = pOid;
		pOid = newPOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.PO__POID, oldPOid, pOid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getScheduledDelivery() {
		return scheduledDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setScheduledDelivery(String newScheduledDelivery) {
		String oldScheduledDelivery = scheduledDelivery;
		scheduledDelivery = newScheduledDelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.PO__SCHEDULED_DELIVERY, oldScheduledDelivery, scheduledDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActualDelivery() {
		return actualDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActualDelivery(String newActualDelivery) {
		String oldActualDelivery = actualDelivery;
		actualDelivery = newActualDelivery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.PO__ACTUAL_DELIVERY, oldActualDelivery, actualDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createIN(String POid) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addDeliveryDate(String POid) {
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
			case PrimsPackage.PO__POID:
				return getPOid();
			case PrimsPackage.PO__SCHEDULED_DELIVERY:
				return getScheduledDelivery();
			case PrimsPackage.PO__ACTUAL_DELIVERY:
				return getActualDelivery();
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
			case PrimsPackage.PO__POID:
				setPOid((String)newValue);
				return;
			case PrimsPackage.PO__SCHEDULED_DELIVERY:
				setScheduledDelivery((String)newValue);
				return;
			case PrimsPackage.PO__ACTUAL_DELIVERY:
				setActualDelivery((String)newValue);
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
			case PrimsPackage.PO__POID:
				setPOid(POID_EDEFAULT);
				return;
			case PrimsPackage.PO__SCHEDULED_DELIVERY:
				setScheduledDelivery(SCHEDULED_DELIVERY_EDEFAULT);
				return;
			case PrimsPackage.PO__ACTUAL_DELIVERY:
				setActualDelivery(ACTUAL_DELIVERY_EDEFAULT);
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
			case PrimsPackage.PO__POID:
				return POID_EDEFAULT == null ? pOid != null : !POID_EDEFAULT.equals(pOid);
			case PrimsPackage.PO__SCHEDULED_DELIVERY:
				return SCHEDULED_DELIVERY_EDEFAULT == null ? scheduledDelivery != null : !SCHEDULED_DELIVERY_EDEFAULT.equals(scheduledDelivery);
			case PrimsPackage.PO__ACTUAL_DELIVERY:
				return ACTUAL_DELIVERY_EDEFAULT == null ? actualDelivery != null : !ACTUAL_DELIVERY_EDEFAULT.equals(actualDelivery);
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
			case PrimsPackage.PO___CREATE_IN:
				createIN(pOid);
				return null;
			case PrimsPackage.PO___ADD_DELIVERY_DATE:
				addDeliveryDate(null);
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
		result.append(" (POid: ");
		result.append(pOid);
		result.append(", ScheduledDelivery: ");
		result.append(scheduledDelivery);
		result.append(", ActualDelivery: ");
		result.append(actualDelivery);
		result.append(')');
		return result.toString();
	}

} //POImpl
