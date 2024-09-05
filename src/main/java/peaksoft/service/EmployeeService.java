package peaksoft.service;

import peaksoft.model.Employee;

public interface EmployeeService {
    String saveEmployee(Employee employee);
    String assignEmployeeToPharmacy(Long pharmacyId,Long employeeId);
}
