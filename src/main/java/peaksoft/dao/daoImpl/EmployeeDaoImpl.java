package peaksoft.dao.daoImpl;

import peaksoft.dao.EmployeeDao;
import peaksoft.database.Database;
import peaksoft.model.Employee;
import peaksoft.model.Pharmacy;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public String saveEmployee(Employee employee) {
        Database.employees.add(employee);
        return "Success";
    }

    @Override
    public String assignEmployeeToPharmacy(Long pharmacyId, Long employeeId) {
        for (Pharmacy pharmacy: Database.pharmacies) {
            if (pharmacy.getId().equals(pharmacyId)){
                for (Employee employee: Database.employees) {
                    if (employee.getId().equals(employeeId)){
                        pharmacy.getEmployees().add(employee);
                    }
                }
            }
        }
        return "successfully assigned!";
    }
}
