/**
 */
package prims.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;


import org.eclipse.emf.ecore.EClass;

import prims.Engineer;
import prims.PrimsPackage;
import prims.SIR;
import prims.Spare;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engineer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EngineerImpl extends PersonImpl implements Engineer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EngineerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrimsPackage.Literals.ENGINEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void searchSpareByTitle(String title) 
	{ 
		SpareImpl obj = new SpareImpl();
		obj.setTitle("sp1");
		obj.setCode("ab12");
		obj.setAvQuantity(6);
		obj.setLocation("equip1");
		
		if(title.equalsIgnoreCase(obj.getTitle()))
		{
			System.out.println("Found the spare in the inventory" + obj.getAvQuantity());
		}
		
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void searchSpareByCode(String code) 
	{
		SpareImpl obj = new SpareImpl();
		obj.setTitle("sp1");
		obj.setCode("ab12");
		obj.setAvQuantity(6);
		obj.setLocation("equip1");
		
		if(code.equalsIgnoreCase(obj.getCode()))
		{
			System.out.println("Found the spare in the inventory" + obj.getAvQuantity());
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addSpareToSIR(String title, int Quantity) 
	{
		SIRImpl sir = new SIRImpl();
		SpareImpl spare = new SpareImpl();
		
		sir = sir.createSIR();
		int qty = sir.getSIRQuantity();
		if(qty <= spare.getAvQuantity())
		{
			qty = qty+Quantity;
			System.out.println("Spares added to SIR" + sir.getSIRid());
		}
		else
		{
			System.out.println("Cannot be more than Available quantity");
		}
		
		
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addSpareToPR(String title) 
	{
		PRImpl pr = new PRImpl();
		SpareImpl spare = new SpareImpl();
		
		pr = pr.createPR();
		int qty = pr.getPRQuanitity();
		if(spare.getTitle() == title)
		{
			if(qty <= spare.getAvQuantity())
			{
				System.out.println("Spares added to SIR" + pr.getPRid());
			}
			else
			{
				System.out.println("Cannot be more than Available quantity");
			}
		}
		
		throw new UnsupportedOperationException();
	}

	HashMap<String, InspectionNoteImpl> listOfIns;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void inspectSpare(String inspectionId) 
	{
		InspectionNoteImpl insNote = listOfIns.get(inspectionId);
		
		boolean stat = insNote.status;
		if(insNote.getInspectionId().equalsIgnoreCase(inspectionId))
		{
			if(stat)
			{
				insNote.setStatus(stat);
				System.out.println("Inspected the spare");
			}
			insNote.setStatus(false);
			System.out.println("Not Inspected send to Staff");
			
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePR(String PRid, int PRQuantity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchByBOM(String BOMid) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEquipment(String tag, String area, String type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void UpdateEquipment(String tag, String area, String type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	

	
	HashMap<String, SIRImpl> listOfSIR;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void updateSIR(String SIRid, int SIRquantity) 
	{
		SIRImpl sir = listOfSIR.get(SIRid);
		int qty = sir.getSIRQuantity();
		if(qty != SIRquantity)
		{
			sir.setSIRQuantity(SIRquantity);
			System.out.println("Spares updated to SIR" + sir.getSIRid());
		}
		else
		{
			System.out.println("Cannot be equal Available quantity");
		}
		throw new UnsupportedOperationException();
	}

//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated
//	 */
//	@Override
//	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
//		switch (operationID) {
//			case PrimsPackage.ENGINEER___SEARCH_SPARE_BY_TITLE:
//				searchSpareByTitle();
//				return null;
//			case PrimsPackage.ENGINEER___SEARCH_SPARE_BY_CODE:
//				searchSpareByCode(code);
//				return null;
//			case PrimsPackage.ENGINEER___ADD_SPARE_TO_SIR:
//				addSpareToSIR();
//				return null;
//			case PrimsPackage.ENGINEER___ADD_SPARE_TO_PR:
//				addSpareToPR();
//				return null;
//			case PrimsPackage.ENGINEER___INSPECT_SPARE:
//				inspectSpare();
//				return null;
//			case PrimsPackage.ENGINEER___UPDATE_PR:
//				updatePR();
//				return null;
//			case PrimsPackage.ENGINEER___SEARCH_BY_BOM:
//				searchByBOM();
//				return null;
//			case PrimsPackage.ENGINEER___ADD_EQUIPMENT:
//				addEquipment();
//				return null;
//			case PrimsPackage.ENGINEER___UPDATE_EQUIPMENT:
//				UpdateEquipment();
//				return null;
//			case PrimsPackage.ENGINEER___UPDATE_SIR:
//				updateSIR();
//				return null;
//		}
//		return super.eInvoke(operationID, arguments);
//	}

} //EngineerImpl
