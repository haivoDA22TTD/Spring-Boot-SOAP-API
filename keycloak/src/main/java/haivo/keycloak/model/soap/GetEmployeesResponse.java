package haivo.keycloak.model.soap;

import jakarta.xml.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@XmlRootElement(name = "getEmployeesResponse", namespace = "http://haivo.com/employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class GetEmployeesResponse {

    @XmlElement(name = "employee")
    private List<EmployeeDto> employees = new ArrayList<>();

    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }
}
