/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prims.PrimsPackage;
import prims.Spare;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spare</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prims.impl.SpareImpl#getCode <em>Code</em>}</li>
 *   <li>{@link prims.impl.SpareImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link prims.impl.SpareImpl#getAvQuantity <em>Av Quantity</em>}</li>
 *   <li>{@link prims.impl.SpareImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpareImpl extends MinimalEObjectImpl.Container implements Spare {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvQuantity() <em>Av Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int AV_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAvQuantity() <em>Av Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvQuantity()
	 * @generated
	 * @ordered
	 */
	protected int avQuantity = AV_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.SPARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.SPARE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.SPARE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAvQuantity() {
		return avQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvQuantity(int newAvQuantity) {
		int oldAvQuantity = avQuantity;
		avQuantity = newAvQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.SPARE__AV_QUANTITY, oldAvQuantity, avQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.SPARE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addQuantity(String spareCode, int quantity) 
	{
		SpareImpl spare = SpareImpl.this;
		if(spare.getCode() == spareCode)
		{
			spare.avQuantity = spare.avQuantity+quantity;
			System.out.println("Added the spare quantity");
		}
		
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createSpare(String spareCode) 
	{
		SpareImpl spare = SpareImpl.this;
		if(!spareCode.isEmpty())
		{
			spare.setCode(spareCode);
			spare.setTitle("newtitle");
			spare.setLocation("newLoc");
			spare.setAvQuantity(0);
			System.out.println("created spare" + spare.getTitle());
		}
		else
		{
			System.out.println("Enter a valid spare code");
		}
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void returnSpare(String spareCode, int quantity) {
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
			case PrimsPackage.SPARE__CODE:
				return getCode();
			case PrimsPackage.SPARE__TITLE:
				return getTitle();
			case PrimsPackage.SPARE__AV_QUANTITY:
				return getAvQuantity();
			case PrimsPackage.SPARE__LOCATION:
				return getLocation();
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
			case PrimsPackage.SPARE__CODE:
				setCode((String)newValue);
				return;
			case PrimsPackage.SPARE__TITLE:
				setTitle((String)newValue);
				return;
			case PrimsPackage.SPARE__AV_QUANTITY:
				setAvQuantity((Integer)newValue);
				return;
			case PrimsPackage.SPARE__LOCATION:
				setLocation((String)newValue);
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
			case PrimsPackage.SPARE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case PrimsPackage.SPARE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case PrimsPackage.SPARE__AV_QUANTITY:
				setAvQuantity(AV_QUANTITY_EDEFAULT);
				return;
			case PrimsPackage.SPARE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case PrimsPackage.SPARE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case PrimsPackage.SPARE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case PrimsPackage.SPARE__AV_QUANTITY:
				return avQuantity != AV_QUANTITY_EDEFAULT;
			case PrimsPackage.SPARE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
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
			case PrimsPackage.SPARE___ADD_QUANTITY:
				addQuantity(title, 0);
				return null;
			case PrimsPackage.SPARE___CREATE_SPARE:
				createSpare(null);
				return null;
			case PrimsPackage.SPARE___RETURN_SPARE:
				returnSpare(title, 0);
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
		result.append(" (Code: ");
		result.append(code);
		result.append(", Title: ");
		result.append(title);
		result.append(", AvQuantity: ");
		result.append(avQuantity);
		result.append(", Location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //SpareImpl
