package haivo.keycloak.model.soap;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "getEmployeesRequest", namespace = "http://haivo.com/employee")
public class GetEmployeesRequest {
    // empty - just trigger
}
