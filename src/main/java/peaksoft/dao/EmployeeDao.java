package peaksoft.dao;

import peaksoft.model.Employee;

public interface EmployeeDao {
    String saveEmployee(Employee employee);
    String assignEmployeeToPharmacy(Long pharmacyId,Long employeeId);

//    get all Employee
//    get all by Pharmacy id
//    get by id
//    update
//    delete employee by pharmacy id
//    delete by id
//    all delete method
}
