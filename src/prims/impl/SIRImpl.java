/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prims.PrimsPackage;
import prims.SIR;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SIR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prims.impl.SIRImpl#getSIRid <em>SI Rid</em>}</li>
 *   <li>{@link prims.impl.SIRImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link prims.impl.SIRImpl#getDateIssued <em>Date Issued</em>}</li>
 *   <li>{@link prims.impl.SIRImpl#getSIRQuantity <em>SIR Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SIRImpl extends MinimalEObjectImpl.Container implements SIR {
	/**
	 * The default value of the '{@link #getSIRid() <em>SI Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIRid()
	 * @generated
	 * @ordered
	 */
	protected static final String SI_RID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIRid() <em>SI Rid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIRid()
	 * @generated
	 * @ordered
	 */
	protected String siRid = SI_RID_EDEFAULT;

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
	 * The default value of the '{@link #getDateIssued() <em>Date Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateIssued()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_ISSUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateIssued() <em>Date Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateIssued()
	 * @generated
	 * @ordered
	 */
	protected String dateIssued = DATE_ISSUED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSIRQuantity() <em>SIR Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIRQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int SIR_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSIRQuantity() <em>SIR Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIRQuantity()
	 * @generated
	 * @ordered
	 */
	protected int sirQuantity = SIR_QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SIRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.SIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSIRid() {
		return siRid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIRid(String newSIRid) {
		String oldSIRid = siRid;
		siRid = newSIRid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.SIR__SI_RID, oldSIRid, siRid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.SIR__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDateIssued() {
		return dateIssued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateIssued(String newDateIssued) {
		String oldDateIssued = dateIssued;
		dateIssued = newDateIssued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.SIR__DATE_ISSUED, oldDateIssued, dateIssued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSIRQuantity() {
		return sirQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSIRQuantity(int newSIRQuantity) {
		int oldSIRQuantity = sirQuantity;
		sirQuantity = newSIRQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.SIR__SIR_QUANTITY, oldSIRQuantity, sirQuantity));
	}

	PersonImpl engineer = new EngineerImpl();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIRImpl createSIR(PersonImpl engineer) 
	{
		Scanner sc = new Scanner(System.in);
		//PersonImpl engineer = new EngineerImpl();
		SIRImpl sir = new SIRImpl();
		if(engineer.getDepType() == "Maintenance")
		{
			System.out.println("Enter the SIR Id: ");
			String sirId = sc.next();
			System.out.println("Enter the SIR Quantity: ");
			int qty = sc.nextInt();
			
			sir.setSIRid(sirId);
			sir.setSIRQuantity(qty);
			sir.setDateCreated("");
			sir.setDateIssued("");
			
			System.out.println("SIR created " + sir.getSIRid());
		}
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
			case PrimsPackage.SIR__SI_RID:
				return getSIRid();
			case PrimsPackage.SIR__DATE_CREATED:
				return getDateCreated();
			case PrimsPackage.SIR__DATE_ISSUED:
				return getDateIssued();
			case PrimsPackage.SIR__SIR_QUANTITY:
				return getSIRQuantity();
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
			case PrimsPackage.SIR__SI_RID:
				setSIRid((String)newValue);
				return;
			case PrimsPackage.SIR__DATE_CREATED:
				setDateCreated((String)newValue);
				return;
			case PrimsPackage.SIR__DATE_ISSUED:
				setDateIssued((String)newValue);
				return;
			case PrimsPackage.SIR__SIR_QUANTITY:
				setSIRQuantity((Integer)newValue);
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
			case PrimsPackage.SIR__SI_RID:
				setSIRid(SI_RID_EDEFAULT);
				return;
			case PrimsPackage.SIR__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case PrimsPackage.SIR__DATE_ISSUED:
				setDateIssued(DATE_ISSUED_EDEFAULT);
				return;
			case PrimsPackage.SIR__SIR_QUANTITY:
				setSIRQuantity(SIR_QUANTITY_EDEFAULT);
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
			case PrimsPackage.SIR__SI_RID:
				return SI_RID_EDEFAULT == null ? siRid != null : !SI_RID_EDEFAULT.equals(siRid);
			case PrimsPackage.SIR__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case PrimsPackage.SIR__DATE_ISSUED:
				return DATE_ISSUED_EDEFAULT == null ? dateIssued != null : !DATE_ISSUED_EDEFAULT.equals(dateIssued);
			case PrimsPackage.SIR__SIR_QUANTITY:
				return sirQuantity != SIR_QUANTITY_EDEFAULT;
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
			case PrimsPackage.SIR___CREATE_SIR:
				createSIR();
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
		result.append(" (SIRid: ");
		result.append(siRid);
		result.append(", DateCreated: ");
		result.append(dateCreated);
		result.append(", DateIssued: ");
		result.append(dateIssued);
		result.append(", SIRQuantity: ");
		result.append(sirQuantity);
		result.append(')');
		return result.toString();
	}

} //SIRImpl
