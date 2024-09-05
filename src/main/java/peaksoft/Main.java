package peaksoft;

import peaksoft.database.GenerateId;
import peaksoft.enums.Gender;
import peaksoft.enums.Position;
import peaksoft.model.Employee;
import peaksoft.model.Medicine;
import peaksoft.model.Pharmacy;
import peaksoft.service.EmployeeService;
import peaksoft.service.MedicineService;
import peaksoft.service.PharmacyService;
import peaksoft.service.serviceImpl.EmployeeServiceImpl;
import peaksoft.service.serviceImpl.MedicineServiceImpl;
import peaksoft.service.serviceImpl.PharmacyServiceImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        PharmacyService pharmacyService = new PharmacyServiceImpl();
        Pharmacy pharmacy1 = new Pharmacy(GenerateId.genPharmacy(),"Neman","Vostok5");
        Pharmacy pharmacy2 = new Pharmacy(GenerateId.genPharmacy(),"Neman1","Vostok51");
        System.out.print("Save Pharmacy->");
        System.out.println(pharmacyService.savePharmacy(pharmacy1));
        System.out.println(pharmacyService.savePharmacy(pharmacy2));
        System.out.print("Get All->");
        System.out.println(pharmacyService.getAllPharmacy());
        System.out.print("Get by id->");
        System.out.println(pharmacyService.getById(2L));
//        System.out.print("Update->");
//        Pharmacy newPharmacy = new Pharmacy("Neman Update","Vostok51");
//        pharmacyService.updatePharmacy(2L,newPharmacy);
//        System.out.print("Get All->");
//        System.out.println(pharmacyService.getAllPharmacy());
//        System.out.print("Delete->");
//        pharmacyService.deletePharmacy(2L);
//        System.out.print("Get All->");
//        System.out.println(pharmacyService.getAllPharmacy());


        System.out.println("~~~~~~~~~~~~~Medicine~~~~~~~~~~~~");
        MedicineService medicineService = new MedicineServiceImpl();
        medicineService.saveMedicine(1L,new Medicine(GenerateId.genMedicine(),"mukaltin","Mukaltin",50,
                LocalDate.of(2024,5,5)));
        System.out.println(medicineService.getAllMedicineByPharmacyId(1L));

        System.out.println(pharmacyService.getAllPharmacy());

        System.out.println(medicineService.getById(1L));

        System.out.println("~~~~~~~~~~~~~Employee~~~~~~~~~~~~");
        EmployeeService employeeService = new EmployeeServiceImpl();
        employeeService.saveEmployee(new Employee(GenerateId.genEmployee(),"Atay","atay@gmail.com","34567890",1.5,
                Position.ADMIN, Gender.MALE));
        employeeService.assignEmployeeToPharmacy(1L,1L);

        System.out.println(pharmacyService.getAllPharmacy());




    }
}