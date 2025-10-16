package haivo.keycloak.model.soap;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "addEmployeeRequest", namespace = "http://haivo.com/employee")
@XmlAccessorType(XmlAccessType.FIELD)
public class AddEmployeeRequest {
    private String name;
    private String position;
    private double salary;

    public AddEmployeeRequest(){}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
