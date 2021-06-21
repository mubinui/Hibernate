import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        System.out.println("Project Started..");

        // Session Factory is an interface so we cannot make object
        //We can also use steps
        //Configuration cfg = new Configuration();
        //cfg.configure("hibernate.cfg.xml");
        //SessionFactory factory = cfg.build sessionFactory();


        //Crating student
        Student s = new Student(1003,"Mehadi Hassan ","Comilla");
        System.out.println(s);
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session= factory.openSession(); //Step 01 getting current session
        // We need to use openSession first Causes there isnt any session opened yet
        // Than we can use get current session
        Transaction ts = session.beginTransaction();//Step 02 beginning transaction


        session.save(s); //Step 03  saving student object // Inserting !!!!
        ts.commit();





        session.close();//Closing the session

    }
}
