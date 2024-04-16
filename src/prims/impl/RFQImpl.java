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
import prims.RFQ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RFQ</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link prims.impl.RFQImpl#getRFQid <em>RF Qid</em>}</li>
 *   <li>{@link prims.impl.RFQImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link prims.impl.RFQImpl#getSupplierQuotation <em>Supplier Quotation</em>}</li>
 *   <li>{@link prims.impl.RFQImpl#getUnitPrice <em>Unit Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RFQImpl extends MinimalEObjectImpl.Container implements RFQ {
	/**
	 * The default value of the '{@link #getRFQid() <em>RF Qid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFQid()
	 * @generated
	 * @ordered
	 */
	protected static final String RF_QID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRFQid() <em>RF Qid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRFQid()
	 * @generated
	 * @ordered
	 */
	protected String rfQid = RF_QID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupplierQuotation() <em>Supplier Quotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierQuotation()
	 * @generated
	 * @ordered
	 */
	protected static final String SUPPLIER_QUOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupplierQuotation() <em>Supplier Quotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierQuotation()
	 * @generated
	 * @ordered
	 */
	protected String supplierQuotation = SUPPLIER_QUOTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int UNIT_PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnitPrice() <em>Unit Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitPrice()
	 * @generated
	 * @ordered
	 */
	protected int unitPrice = UNIT_PRICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RFQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.RFQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRFQid() {
		return rfQid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRFQid(String newRFQid) {
		String oldRFQid = rfQid;
		rfQid = newRFQid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.RFQ__RF_QID, oldRFQid, rfQid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(String newDueDate) {
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.RFQ__DUE_DATE, oldDueDate, dueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSupplierQuotation() {
		return supplierQuotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSupplierQuotation(String newSupplierQuotation) {
		String oldSupplierQuotation = supplierQuotation;
		supplierQuotation = newSupplierQuotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.RFQ__SUPPLIER_QUOTATION, oldSupplierQuotation, supplierQuotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUnitPrice() {
		return unitPrice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnitPrice(int newUnitPrice) {
		int oldUnitPrice = unitPrice;
		unitPrice = newUnitPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrimsPackage.RFQ__UNIT_PRICE, oldUnitPrice, unitPrice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void AttachQuotation(int unitPrice, String supplierQuotation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getPrice(String RFQid) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createRFQ() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPO() {
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
			case PrimsPackage.RFQ__RF_QID:
				return getRFQid();
			case PrimsPackage.RFQ__DUE_DATE:
				return getDueDate();
			case PrimsPackage.RFQ__SUPPLIER_QUOTATION:
				return getSupplierQuotation();
			case PrimsPackage.RFQ__UNIT_PRICE:
				return getUnitPrice();
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
			case PrimsPackage.RFQ__RF_QID:
				setRFQid((String)newValue);
				return;
			case PrimsPackage.RFQ__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case PrimsPackage.RFQ__SUPPLIER_QUOTATION:
				setSupplierQuotation((String)newValue);
				return;
			case PrimsPackage.RFQ__UNIT_PRICE:
				setUnitPrice((Integer)newValue);
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
			case PrimsPackage.RFQ__RF_QID:
				setRFQid(RF_QID_EDEFAULT);
				return;
			case PrimsPackage.RFQ__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case PrimsPackage.RFQ__SUPPLIER_QUOTATION:
				setSupplierQuotation(SUPPLIER_QUOTATION_EDEFAULT);
				return;
			case PrimsPackage.RFQ__UNIT_PRICE:
				setUnitPrice(UNIT_PRICE_EDEFAULT);
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
			case PrimsPackage.RFQ__RF_QID:
				return RF_QID_EDEFAULT == null ? rfQid != null : !RF_QID_EDEFAULT.equals(rfQid);
			case PrimsPackage.RFQ__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case PrimsPackage.RFQ__SUPPLIER_QUOTATION:
				return SUPPLIER_QUOTATION_EDEFAULT == null ? supplierQuotation != null : !SUPPLIER_QUOTATION_EDEFAULT.equals(supplierQuotation);
			case PrimsPackage.RFQ__UNIT_PRICE:
				return unitPrice != UNIT_PRICE_EDEFAULT;
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
			case PrimsPackage.RFQ___ATTACH_QUOTATION:
				AttachQuotation(0, supplierQuotation);
				return null;
			case PrimsPackage.RFQ___GET_PRICE:
				getPrice(null);
				return null;
			case PrimsPackage.RFQ___CREATE_RFQ:
				createRFQ();
				return null;
			case PrimsPackage.RFQ___CREATE_PO:
				createPO();
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
		result.append(" (RFQid: ");
		result.append(rfQid);
		result.append(", DueDate: ");
		result.append(dueDate);
		result.append(", SupplierQuotation: ");
		result.append(supplierQuotation);
		result.append(", UnitPrice: ");
		result.append(unitPrice);
		result.append(')');
		return result.toString();
	}

} //RFQImpl
