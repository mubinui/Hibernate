package MappingOTM;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int eid;
    private String name;
    @OneToMany
    private List<Project> projects;

}
