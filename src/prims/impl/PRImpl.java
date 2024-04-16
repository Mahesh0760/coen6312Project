/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prims.PR;
import prims.PrimsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prims.impl.PRImpl#getPRid <em>PRid</em>}</li>
 *   <li>{@link prims.impl.PRImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link prims.impl.PRImpl#getUrgency <em>Urgency</em>}</li>
 *   <li>{@link prims.impl.PRImpl#getPRQuanitity <em>PR Quanitity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PRImpl extends MinimalEObjectImpl.Container implements PR {
	/**
	 * The default value of the '{@link #getPRid() <em>PRid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRid()
	 * @generated
	 * @ordered
	 */
	protected static final String PRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPRid() <em>PRid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRid()
	 * @generated
	 * @ordered
	 */
	protected String pRid = PRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected String dateCreated = DATE_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrgency() <em>Urgency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgency()
	 * @generated
	 * @ordered
	 */
	protected static final String URGENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrgency() <em>Urgency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrgency()
	 * @generated
	 * @ordered
	 */
	protected String urgency = URGENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPRQuanitity() <em>PR Quanitity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRQuanitity()
	 * @generated
	 * @ordered
	 */
	protected static final int PR_QUANITITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPRQuanitity() <em>PR Quanitity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPRQuanitity()
	 * @generated
	 * @ordered
	 */
	protected int prQuanitity = PR_QUANITITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.PR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPRid() {
		return pRid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRid(String newPRid) {
		String oldPRid = pRid;
		pRid = newPRid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.PR__PRID, oldPRid, pRid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDateCreated() {
		return dateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateCreated(String newDateCreated) {
		String oldDateCreated = dateCreated;
		dateCreated = newDateCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.PR__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrgency() {
		return urgency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrgency(String newUrgency) {
		String oldUrgency = urgency;
		urgency = newUrgency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.PR__URGENCY, oldUrgency, urgency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPRQuanitity() {
		return prQuanitity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPRQuanitity(int newPRQuanitity) {
		int oldPRQuanitity = prQuanitity;
		prQuanitity = newPRQuanitity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.PR__PR_QUANITITY, oldPRQuanitity, prQuanitity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PRImpl createPR() 
	{
		PersonImpl engineer = new EngineerImpl();
		PRImpl pr = new PRImpl();
		if(engineer.getDepType().equalsIgnoreCase("Maintenance"))
		{
			pr.setPRid(pRid);
			pr.setPRQuanitity(prQuanitity);
			pr.setDateCreated(dateCreated);
			pr.setUrgency(URGENCY_EDEFAULT);
			System.out.println("PR created " + pr.getPRid());
		}	
		return pr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrimsPackage.PR__PRID:
				return getPRid();
			case PrimsPackage.PR__DATE_CREATED:
				return getDateCreated();
			case PrimsPackage.PR__URGENCY:
				return getUrgency();
			case PrimsPackage.PR__PR_QUANITITY:
				return getPRQuanitity();
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
			case PrimsPackage.PR__PRID:
				setPRid((String)newValue);
				return;
			case PrimsPackage.PR__DATE_CREATED:
				setDateCreated((String)newValue);
				return;
			case PrimsPackage.PR__URGENCY:
				setUrgency((String)newValue);
				return;
			case PrimsPackage.PR__PR_QUANITITY:
				setPRQuanitity((Integer)newValue);
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
			case PrimsPackage.PR__PRID:
				setPRid(PRID_EDEFAULT);
				return;
			case PrimsPackage.PR__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case PrimsPackage.PR__URGENCY:
				setUrgency(URGENCY_EDEFAULT);
				return;
			case PrimsPackage.PR__PR_QUANITITY:
				setPRQuanitity(PR_QUANITITY_EDEFAULT);
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
			case PrimsPackage.PR__PRID:
				return PRID_EDEFAULT == null ? pRid != null : !PRID_EDEFAULT.equals(pRid);
			case PrimsPackage.PR__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case PrimsPackage.PR__URGENCY:
				return URGENCY_EDEFAULT == null ? urgency != null : !URGENCY_EDEFAULT.equals(urgency);
			case PrimsPackage.PR__PR_QUANITITY:
				return prQuanitity != PR_QUANITITY_EDEFAULT;
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
			case PrimsPackage.PR___CREATE_PR:
				createPR();
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
		result.append(" (PRid: ");
		result.append(pRid);
		result.append(", DateCreated: ");
		result.append(dateCreated);
		result.append(", Urgency: ");
		result.append(urgency);
		result.append(", PRQuanitity: ");
		result.append(prQuanitity);
		result.append(')');
		return result.toString();
	}

} //PRImpl
