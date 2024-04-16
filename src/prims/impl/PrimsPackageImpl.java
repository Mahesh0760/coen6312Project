/**
 */
package prims.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;


//import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

import prims.Admin;
import prims.Department;
import prims.Engineer;
import prims.Equipment;
import prims.InspectionNote;
import prims.Manager;
import prims.Person;
import prims.Plant;
import prims.PrimsFactory;
import prims.PrimsPackage;
import prims.Spare;
import prims.Staff;
import prims.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PrimsPackageImpl extends EPackageImpl implements PrimsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass engineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equipmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rfqEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inspectionNoteEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see prims.PrimsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PrimsPackageImpl() {
		super(eNS_URI, PrimsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PrimsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PrimsPackage init() {
		if (isInited) return (PrimsPackage)EPackage.Registry.INSTANCE.getEPackage(PrimsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPrimsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PrimsPackageImpl thePrimsPackage = registeredPrimsPackage instanceof PrimsPackageImpl ? (PrimsPackageImpl)registeredPrimsPackage : new PrimsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypesPackageImpl.eNS_URI);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(registeredPackage instanceof TypesPackageImpl ? registeredPackage : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		thePrimsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		thePrimsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrimsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PrimsPackage.eNS_URI, thePrimsPackage);
		return thePrimsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlant() {
		return plantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlant_Name() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPlant_Address() {
		return (EAttribute)plantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlant_Department() {
		return (EReference)plantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Name() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepartment_Permission() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Id() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPerson_Password() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPerson__GetDepartment() {
		return personEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManager__GenerateSIRreport() {
		return managerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getManager__GeneratePOreport() {
		return managerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEngineer() {
		return engineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__SearchSpareByTitle() {
		return engineerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__SearchSpareByCode() {
		return engineerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__AddSpareToSIR() {
		return engineerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__AddSpareToPR() {
		return engineerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__InspectSpare() {
		return engineerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__UpdatePR() {
		return engineerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__SearchByBOM() {
		return engineerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__AddEquipment() {
		return engineerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__UpdateEquipment() {
		return engineerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__UpdatePR_1() {
		return engineerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEngineer__UpdateSIR() {
		return engineerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStaff__IssueSpare() {
		return staffEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStaff__UpdateQuantity() {
		return staffEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStaff__AddRFQtoPR() {
		return staffEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdmin() {
		return adminEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdmin__AddPerson() {
		return adminEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEquipment() {
		return equipmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipment_Tag() {
		return (EAttribute)equipmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipment_Area() {
		return (EAttribute)equipmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEquipment_Type() {
		return (EAttribute)equipmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEquipment__CreateEquipment() {
		return equipmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBOM() {
		return bomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBOM_BOMid() {
		return (EAttribute)bomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBOM_DateCreated() {
		return (EAttribute)bomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBOM__AttachSpare() {
		return bomEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBOM__CreateBOM() {
		return bomEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBOM__DisplayBOM() {
		return bomEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpare() {
		return spareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpare_Code() {
		return (EAttribute)spareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpare_Title() {
		return (EAttribute)spareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpare_AvQuantity() {
		return (EAttribute)spareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpare_Location() {
		return (EAttribute)spareEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpare__AddQuantity() {
		return spareEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpare__CreateSpare() {
		return spareEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSpare__ReturnSpare() {
		return spareEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSIR() {
		return sirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSIR_SIRid() {
		return (EAttribute)sirEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSIR_DateCreated() {
		return (EAttribute)sirEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSIR_DateIssued() {
		return (EAttribute)sirEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSIR_SIRQuantity() {
		return (EAttribute)sirEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSIR__CreateSIR() {
		return sirEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPR() {
		return prEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPR_PRid() {
		return (EAttribute)prEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPR_DateCreated() {
		return (EAttribute)prEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPR_Urgency() {
		return (EAttribute)prEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPR_PRQuanitity() {
		return (EAttribute)prEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPR__CreatePR() {
		return prEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRFQ() {
		return rfqEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRFQ_RFQid() {
		return (EAttribute)rfqEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRFQ_DueDate() {
		return (EAttribute)rfqEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRFQ_SupplierQuotation() {
		return (EAttribute)rfqEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRFQ_UnitPrice() {
		return (EAttribute)rfqEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRFQ__AttachQuotation() {
		return rfqEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRFQ__GetPrice() {
		return rfqEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRFQ__CreateRFQ() {
		return rfqEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRFQ__CreatePO() {
		return rfqEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPO() {
		return poEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPO_POid() {
		return (EAttribute)poEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPO_ScheduledDelivery() {
		return (EAttribute)poEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPO_ActualDelivery() {
		return (EAttribute)poEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPO__CreateIN() {
		return poEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPO__AddDeliveryDate() {
		return poEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSupplier() {
		return supplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplier_Name() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSupplier_Contact() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSupplier__AddQuotations() {
		return supplierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInspectionNote() {
		return inspectionNoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInspectionNote_InspectionId() {
		return (EAttribute)inspectionNoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInspectionNote_InspectedDate() {
		return (EAttribute)inspectionNoteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInspectionNote_Status() {
		return (EAttribute)inspectionNoteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInspectionNote__GetStatusOfIN() {
		return inspectionNoteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInspectionNote__SetStatusOfIN() {
		return inspectionNoteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimsFactory getPrimsFactory() {
		return (PrimsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		plantEClass = createEClass(PLANT);
		createEAttribute(plantEClass, PLANT__NAME);
		createEAttribute(plantEClass, PLANT__ADDRESS);
		createEReference(plantEClass, PLANT__DEPARTMENT);

		departmentEClass = createEClass(DEPARTMENT);
		createEAttribute(departmentEClass, DEPARTMENT__NAME);
		createEAttribute(departmentEClass, DEPARTMENT__PERMISSION);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__NAME);
		createEAttribute(personEClass, PERSON__ID);
		createEAttribute(personEClass, PERSON__PASSWORD);
		createEOperation(personEClass, PERSON___GET_DEPARTMENT);

		managerEClass = createEClass(MANAGER);
		createEOperation(managerEClass, MANAGER___GENERATE_SI_RREPORT);
		createEOperation(managerEClass, MANAGER___GENERATE_POREPORT);

		engineerEClass = createEClass(ENGINEER);
		createEOperation(engineerEClass, ENGINEER___SEARCH_SPARE_BY_TITLE);
		createEOperation(engineerEClass, ENGINEER___SEARCH_SPARE_BY_CODE);
		createEOperation(engineerEClass, ENGINEER___ADD_SPARE_TO_SIR);
		createEOperation(engineerEClass, ENGINEER___ADD_SPARE_TO_PR);
		createEOperation(engineerEClass, ENGINEER___INSPECT_SPARE);
		createEOperation(engineerEClass, ENGINEER___UPDATE_PR);
		createEOperation(engineerEClass, ENGINEER___SEARCH_BY_BOM);
		createEOperation(engineerEClass, ENGINEER___ADD_EQUIPMENT);
		createEOperation(engineerEClass, ENGINEER___UPDATE_EQUIPMENT);
		createEOperation(engineerEClass, ENGINEER___UPDATE_PR);
		createEOperation(engineerEClass, ENGINEER___UPDATE_SIR);

		staffEClass = createEClass(STAFF);
		createEOperation(staffEClass, STAFF___ISSUE_SPARE);
		createEOperation(staffEClass, STAFF___UPDATE_QUANTITY);
		createEOperation(staffEClass, STAFF___ADD_RF_QTO_PR);

		adminEClass = createEClass(ADMIN);
		createEOperation(adminEClass, ADMIN___ADD_PERSON);

		equipmentEClass = createEClass(EQUIPMENT);
		createEAttribute(equipmentEClass, EQUIPMENT__TAG);
		createEAttribute(equipmentEClass, EQUIPMENT__AREA);
		createEAttribute(equipmentEClass, EQUIPMENT__TYPE);
		createEOperation(equipmentEClass, EQUIPMENT___CREATE_EQUIPMENT);

		bomEClass = createEClass(BOM);
		createEAttribute(bomEClass, BOM__BO_MID);
		createEAttribute(bomEClass, BOM__DATE_CREATED);
		createEOperation(bomEClass, BOM___ATTACH_SPARE);
		createEOperation(bomEClass, BOM___CREATE_BOM);
		createEOperation(bomEClass, BOM___DISPLAY_BOM);

		spareEClass = createEClass(SPARE);
		createEAttribute(spareEClass, SPARE__CODE);
		createEAttribute(spareEClass, SPARE__TITLE);
		createEAttribute(spareEClass, SPARE__AV_QUANTITY);
		createEAttribute(spareEClass, SPARE__LOCATION);
		createEOperation(spareEClass, SPARE___ADD_QUANTITY);
		createEOperation(spareEClass, SPARE___CREATE_SPARE);
		createEOperation(spareEClass, SPARE___RETURN_SPARE);

		sirEClass = createEClass(SIR);
		createEAttribute(sirEClass, SIR__SI_RID);
		createEAttribute(sirEClass, SIR__DATE_CREATED);
		createEAttribute(sirEClass, SIR__DATE_ISSUED);
		createEAttribute(sirEClass, SIR__SIR_QUANTITY);
		createEOperation(sirEClass, SIR___CREATE_SIR);

		prEClass = createEClass(PR);
		createEAttribute(prEClass, PR__PRID);
		createEAttribute(prEClass, PR__DATE_CREATED);
		createEAttribute(prEClass, PR__URGENCY);
		createEAttribute(prEClass, PR__PR_QUANITITY);
		createEOperation(prEClass, PR___CREATE_PR);

		rfqEClass = createEClass(RFQ);
		createEAttribute(rfqEClass, RFQ__RF_QID);
		createEAttribute(rfqEClass, RFQ__DUE_DATE);
		createEAttribute(rfqEClass, RFQ__SUPPLIER_QUOTATION);
		createEAttribute(rfqEClass, RFQ__UNIT_PRICE);
		createEOperation(rfqEClass, RFQ___ATTACH_QUOTATION);
		createEOperation(rfqEClass, RFQ___GET_PRICE);
		createEOperation(rfqEClass, RFQ___CREATE_RFQ);
		createEOperation(rfqEClass, RFQ___CREATE_PO);

		poEClass = createEClass(PO);
		createEAttribute(poEClass, PO__POID);
		createEAttribute(poEClass, PO__SCHEDULED_DELIVERY);
		createEAttribute(poEClass, PO__ACTUAL_DELIVERY);
		createEOperation(poEClass, PO___CREATE_IN);
		createEOperation(poEClass, PO___ADD_DELIVERY_DATE);

		supplierEClass = createEClass(SUPPLIER);
		createEAttribute(supplierEClass, SUPPLIER__NAME);
		createEAttribute(supplierEClass, SUPPLIER__CONTACT);
		createEOperation(supplierEClass, SUPPLIER___ADD_QUOTATIONS);

		inspectionNoteEClass = createEClass(INSPECTION_NOTE);
		createEAttribute(inspectionNoteEClass, INSPECTION_NOTE__INSPECTION_ID);
		createEAttribute(inspectionNoteEClass, INSPECTION_NOTE__INSPECTED_DATE);
		createEAttribute(inspectionNoteEClass, INSPECTION_NOTE__STATUS);
		createEOperation(inspectionNoteEClass, INSPECTION_NOTE___GET_STATUS_OF_IN);
		createEOperation(inspectionNoteEClass, INSPECTION_NOTE___SET_STATUS_OF_IN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		managerEClass.getESuperTypes().add(this.getPerson());
		engineerEClass.getESuperTypes().add(this.getPerson());
		staffEClass.getESuperTypes().add(this.getPerson());
		adminEClass.getESuperTypes().add(this.getPerson());

		// Initialize classes, features, and operations; add parameters
		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlant_Name(), theTypesPackage.getString(), "Name", null, 1, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPlant_Address(), theTypesPackage.getString(), "Address", null, 1, 1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPlant_Department(), this.getDepartment(), null, "department", null, 1, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDepartment_Name(), theTypesPackage.getString(), "Name", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDepartment_Permission(), theTypesPackage.getString(), "Permission", null, 1, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_Name(), theTypesPackage.getString(), "Name", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Id(), theTypesPackage.getInteger(), "Id", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPerson_Password(), theTypesPackage.getString(), "password", null, 1, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPerson__GetDepartment(), null, "getDepartment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getManager__GenerateSIRreport(), null, "generateSIRreport", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getManager__GeneratePOreport(), null, "generatePOreport", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(engineerEClass, Engineer.class, "Engineer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getEngineer__SearchSpareByTitle(), null, "searchSpareByTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__SearchSpareByCode(), null, "searchSpareByCode", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__AddSpareToSIR(), null, "addSpareToSIR", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__AddSpareToPR(), null, "addSpareToPR", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__InspectSpare(), null, "inspectSpare", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__UpdatePR(), null, "updatePR", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__SearchByBOM(), null, "searchByBOM", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__AddEquipment(), null, "addEquipment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__UpdateEquipment(), null, "UpdateEquipment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__UpdatePR_1(), null, "UpdatePR", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEngineer__UpdateSIR(), null, "updateSIR", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getStaff__IssueSpare(), null, "issueSpare", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaff__UpdateQuantity(), null, "updateQuantity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStaff__AddRFQtoPR(), null, "addRFQtoPR", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(adminEClass, Admin.class, "Admin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAdmin__AddPerson(), null, "addPerson", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(equipmentEClass, Equipment.class, "Equipment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEquipment_Tag(), theTypesPackage.getString(), "Tag", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEquipment_Area(), theTypesPackage.getString(), "Area", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEquipment_Type(), theTypesPackage.getString(), "Type", null, 1, 1, Equipment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEquipment__CreateEquipment(), null, "createEquipment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bomEClass, prims.BOM.class, "BOM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBOM_BOMid(), theTypesPackage.getString(), "BOMid", null, 1, 1, prims.BOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBOM_DateCreated(), theTypesPackage.getString(), "DateCreated", null, 1, 1, prims.BOM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBOM__AttachSpare(), null, "attachSpare", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBOM__CreateBOM(), null, "createBOM", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBOM__DisplayBOM(), null, "displayBOM", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(spareEClass, Spare.class, "Spare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpare_Code(), theTypesPackage.getString(), "Code", null, 1, 1, Spare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpare_Title(), theTypesPackage.getString(), "Title", null, 1, 1, Spare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpare_AvQuantity(), theTypesPackage.getInteger(), "AvQuantity", null, 1, 1, Spare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpare_Location(), theTypesPackage.getString(), "Location", null, 1, 1, Spare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSpare__AddQuantity(), null, "addQuantity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpare__CreateSpare(), null, "createSpare", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getSpare__ReturnSpare(), null, "returnSpare", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sirEClass, prims.SIR.class, "SIR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSIR_SIRid(), theTypesPackage.getString(), "SIRid", null, 1, 1, prims.SIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSIR_DateCreated(), theTypesPackage.getString(), "DateCreated", null, 1, 1, prims.SIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSIR_DateIssued(), theTypesPackage.getString(), "DateIssued", null, 1, 1, prims.SIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSIR_SIRQuantity(), theTypesPackage.getInteger(), "SIRQuantity", null, 1, 1, prims.SIR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSIR__CreateSIR(), null, "createSIR", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(prEClass, prims.PR.class, "PR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPR_PRid(), theTypesPackage.getString(), "PRid", null, 1, 1, prims.PR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPR_DateCreated(), theTypesPackage.getString(), "DateCreated", null, 1, 1, prims.PR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPR_Urgency(), theTypesPackage.getString(), "Urgency", null, 1, 1, prims.PR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPR_PRQuanitity(), theTypesPackage.getInteger(), "PRQuanitity", null, 1, 1, prims.PR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPR__CreatePR(), null, "createPR", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(rfqEClass, prims.RFQ.class, "RFQ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRFQ_RFQid(), theTypesPackage.getString(), "RFQid", null, 1, 1, prims.RFQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRFQ_DueDate(), theTypesPackage.getString(), "DueDate", null, 1, 1, prims.RFQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRFQ_SupplierQuotation(), theTypesPackage.getString(), "SupplierQuotation", null, 1, 1, prims.RFQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRFQ_UnitPrice(), theTypesPackage.getInteger(), "UnitPrice", null, 1, 1, prims.RFQ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRFQ__AttachQuotation(), null, "AttachQuotation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRFQ__GetPrice(), null, "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRFQ__CreateRFQ(), null, "createRFQ", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRFQ__CreatePO(), null, "createPO", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(poEClass, prims.PO.class, "PO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPO_POid(), theTypesPackage.getString(), "POid", null, 1, 1, prims.PO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPO_ScheduledDelivery(), theTypesPackage.getString(), "ScheduledDelivery", null, 1, 1, prims.PO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPO_ActualDelivery(), theTypesPackage.getString(), "ActualDelivery", null, 1, 1, prims.PO.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getPO__CreateIN(), null, "createIN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPO__AddDeliveryDate(), null, "addDeliveryDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(supplierEClass, Supplier.class, "Supplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplier_Name(), theTypesPackage.getString(), "Name", null, 1, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSupplier_Contact(), theTypesPackage.getString(), "Contact", null, 1, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSupplier__AddQuotations(), null, "addQuotations", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(inspectionNoteEClass, InspectionNote.class, "InspectionNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInspectionNote_InspectionId(), theTypesPackage.getString(), "InspectionId", null, 1, 1, InspectionNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInspectionNote_InspectedDate(), theTypesPackage.getString(), "InspectedDate", null, 1, 1, InspectionNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInspectionNote_Status(), theTypesPackage.getBoolean(), "Status", null, 1, 1, InspectionNote.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getInspectionNote__GetStatusOfIN(), null, "getStatusOfIN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getInspectionNote__SetStatusOfIN(), null, "setStatusOfIN", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PrimsPackageImpl
