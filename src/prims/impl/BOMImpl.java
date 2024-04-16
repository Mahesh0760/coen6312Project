/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prims.BOM;
import prims.PrimsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BOM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prims.impl.BOMImpl#getBOMid <em>BO Mid</em>}</li>
 *   <li>{@link prims.impl.BOMImpl#getDateCreated <em>Date Created</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BOMImpl extends MinimalEObjectImpl.Container implements BOM {
	/**
	 * The default value of the '{@link #getBOMid() <em>BO Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOMid()
	 * @generated
	 * @ordered
	 */
	protected static final String BO_MID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBOMid() <em>BO Mid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBOMid()
	 * @generated
	 * @ordered
	 */
	protected String boMid = BO_MID_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BOMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.BOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBOMid() {
		return boMid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBOMid(String newBOMid) {
		String oldBOMid = boMid;
		boMid = newBOMid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.BOM__BO_MID, oldBOMid, boMid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.BOM__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void attachSpare(String BOMid, String spareCode) 
	{
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void createBOM(String equipmentId) 
	{
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void displayBOM(String BOMidS) 
	{
		BOMImpl bom = BOMImpl.this;
		
		if(bom.getBOMid().equals(BOMidS))
		{
			System.out.println(bom.getBOMid() + bom.getDateCreated());
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
			case PrimsPackage.BOM__BO_MID:
				return getBOMid();
			case PrimsPackage.BOM__DATE_CREATED:
				return getDateCreated();
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
			case PrimsPackage.BOM__BO_MID:
				setBOMid((String)newValue);
				return;
			case PrimsPackage.BOM__DATE_CREATED:
				setDateCreated((String)newValue);
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
			case PrimsPackage.BOM__BO_MID:
				setBOMid(BO_MID_EDEFAULT);
				return;
			case PrimsPackage.BOM__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
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
			case PrimsPackage.BOM__BO_MID:
				return BO_MID_EDEFAULT == null ? boMid != null : !BO_MID_EDEFAULT.equals(boMid);
			case PrimsPackage.BOM__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
		}
		return super.eIsSet(featureID);
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
//		switch (operationID) {
//			case PrimsPackage.BOM___ATTACH_SPARE:
//				attachSpare();
//				return null;
//			case PrimsPackage.BOM___CREATE_BOM:
//				createBOM();
//				return null;
//			case PrimsPackage.BOM___DISPLAY_BOM:
//				displayBOM();
//				return null;
//		}
//		return super.eInvoke(operationID, arguments);
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (BOMid: ");
		result.append(boMid);
		result.append(", DateCreated: ");
		result.append(dateCreated);
		result.append(')');
		return result.toString();
	}

} //BOMImpl
