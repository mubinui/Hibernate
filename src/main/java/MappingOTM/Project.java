package MappingOTM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Project {
    @Id
    private int pid;
    @Column(name="project_name")
    private String projectName;

}
