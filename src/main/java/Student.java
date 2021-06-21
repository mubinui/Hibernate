import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//(name = "student_details")
@Table//(name="mystudents")
//Can be used in class level
//Default table name = default Entity name
//Default Entity name = class name
public class Student {
    //@Id for marking the primary key
    @Id
    private int sid ;

    private String name;
    private String city;

    public Student() {
    }

    public Student(int sid, String name, String city) {
        this.sid = sid;
        this.name = name;
        this.city = city;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
