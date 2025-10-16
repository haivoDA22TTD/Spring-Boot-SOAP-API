package haivo.keycloak.model.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee")
public class EmployeeDto {
    private String id;
    private String name;
    private String position;
    private double salary;

    public EmployeeDto() {}

    public EmployeeDto(String id, String name, String position, double salary) {
        this.id = id; this.name = name; this.position = position; this.salary = salary;
    }

    // getters/setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}
