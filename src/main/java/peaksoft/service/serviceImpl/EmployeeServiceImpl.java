package peaksoft.service.serviceImpl;

import peaksoft.dao.EmployeeDao;
import peaksoft.dao.daoImpl.EmployeeDaoImpl;
import peaksoft.model.Employee;
import peaksoft.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDao employeeDao =new EmployeeDaoImpl();
    @Override
    public String saveEmployee(Employee employee) {
        return employeeDao.saveEmployee(employee);
    }

    @Override
    public String assignEmployeeToPharmacy(Long pharmacyId, Long employeeId) {
        return employeeDao.assignEmployeeToPharmacy(pharmacyId, employeeId);
    }
}
