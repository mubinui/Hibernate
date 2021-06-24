package MappingOTM;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory sf = configuration.buildSessionFactory();
        // Creating the objects
        // Addresses
        EmployeeAddress e1 = new EmployeeAddress("12/12","Dhaka","3/5","Bangladesh");
        EmployeeAddress e2 = new EmployeeAddress("10/12","Dream","12/34","DreamLand");
        EmployeeAddress e3 = new EmployeeAddress("12/23","Illusion","12/345","XeroCity");
        // Lists
        List <Employee> employees = new LinkedList<>();
        List <Project> projects = new LinkedList<>();
        // Employees


        // Projects
        Project p1 = new Project();
        p1.setPid(5001);
        p1.setProjectName("Defect detection");
        p1.setEmployees(employees);

        Project p2 = new Project();
        p2.setPid(5002);
        p2.setProjectName("Love");
        p2.setEmployees(employees);


        Project p3 = new Project();
        p3.setPid(5003);
        p3.setProjectName("Love is Awesome");
        p3.setEmployees(employees);

        Employee em1 = new Employee();
        em1.setEid(1001);
        em1.setName("Mubin UIC");
        em1.setEmployeeAddress(e1);
        em1.setProjects(projects);

        Employee em2 = new Employee();
        em2.setEid(1002);
        em2.setName("Samindra UIC");
        em2.setEmployeeAddress(e2);
        em2.setProjects(projects);

        Employee em3 = new Employee();
        em3.setEid(1003);
        em3.setName("Maxbix UIC");
        em3.setEmployeeAddress(e3);
        em3.setProjects(projects);

        employees.add(em1);
        employees.add(em2);
        employees.add(em3);
        projects.add(p1);
        projects.add(p2);
        projects.add(p3);


        Session s  = sf.openSession();
        Transaction txn = s.beginTransaction();
        s.save(em1);
        s.save(em2);
        s.save(em3);
        s.save(p1);
        s.save(p2);
        s.save(p3);
        txn.commit();
        s.close();
        sf.close();


    }
}
