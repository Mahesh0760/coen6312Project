/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import prims.PrimsPackage;
import prims.Staff;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StaffImpl extends PersonImpl implements Staff {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.STAFF;
	}

	HashMap<String, PersonImpl> persons;
	HashMap<String, SIRImpl> SIRs;
	HashMap<String, SpareImpl> spares;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void issueSpare(String SIRid, String staffId, String SpareId) 
	{
		// persons, SIRs, spares are the hash maps of those objects
		PersonImpl staff = persons.get(staffId); 
		SIRImpl sir = SIRs.get(SIRid);
		SpareImpl spare = spares.get(SpareId);
		int qty = sir.getSIRQuantity();
		int spareqty = spare.avQuantity;
		
		if(staff.getDepType().equalsIgnoreCase("Warehouse"))
		{
			if(sir.getSIRid().equalsIgnoreCase(SIRid) && qty<=spareqty)
			{
				spareqty = spareqty-qty;
				System.out.println("Issued spare for SIR " + sir.getSIRid());
			}
			else
			{
				System.out.println("The available quantity is less than the SIR Quantity, Please raise a PR");
			}
		}
		else
		{
			System.out.println("Person is not authorized to issue spare");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateQuantity(String spareCode, int AvlQuantity) 
	{
		SpareImpl spare = new SpareImpl();
		if(spare.getCode() == spareCode)
		{
			spare.avQuantity = AvlQuantity;
			System.out.println("Updated the spare quantity");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRFQtoPR(String dueDate, String supplierName) 
	{
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PrimsPackage.STAFF___ISSUE_SPARE:
				issueSpare(null);
				return null;
			case PrimsPackage.STAFF___UPDATE_QUANTITY:
				updateQuantity(null, 0);
				return null;
			case PrimsPackage.STAFF___ADD_RF_QTO_PR:
				addRFQtoPR(null, null);
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffImpl
