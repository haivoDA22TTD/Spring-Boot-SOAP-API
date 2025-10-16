package haivo.keycloak.service;

import haivo.keycloak.model.Employee;
import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    List<Employee> getAll();
}
