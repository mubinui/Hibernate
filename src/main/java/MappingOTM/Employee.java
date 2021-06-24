package MappingOTM;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int eid;
    @Column(name ="employee_name")
    private String name;
    private EmployeeAddress employeeAddress;
    @ManyToMany
    private List<Project> projects;

    public Employee(int eid, String name, EmployeeAddress employeeAddress, List<Project> projects) {
        this.eid = eid;
        this.name = name;
        this.employeeAddress = employeeAddress;
        this.projects = projects;
    }

    public Employee() {

    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}

