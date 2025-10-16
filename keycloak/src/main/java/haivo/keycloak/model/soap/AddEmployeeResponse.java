package haivo.keycloak.model.soap;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addEmployeeResponse", namespace = "http://haivo.com/employee")
public class AddEmployeeResponse {
    private String status;
    public AddEmployeeResponse(){}
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
