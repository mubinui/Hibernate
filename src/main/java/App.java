import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Project Started..");

        // Session Factory is an interface so we cannot make object
        //We can also use steps
        //Configuration cfg = new Configuration();
        //cfg.configure("hibernate.cfg.xml");
        //SessionFactory factory = cfg.build sessionFactory();



//         Insert Operation
        //Crating student
        //Embeddable
        Certificate certi = new Certificate("How to Love","Infinite");
        Student s = new Student(1001,"Samindra Uic ","Dream city",certi);
        //Creating object of address class
        Address a = new Address();
        a.setStreet("Love Street ");
        a.setCity("Dream City");
        a.setOpen(true);
        a.setAddDate(new Date());
        a.setX(100.00);

        //Reading Image
        FileInputStream fis = new FileInputStream("src/main/java/Love.png");
        byte [] array = new byte[fis.available()];
        fis.read(array);
        a.setImage(array);

        System.out.println(s);
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session= factory.openSession(); //Step 01 getting current session
        // We need to use openSession first Causes there isnt any session opened yet
        // Than we can use get current session
        Transaction ts = session.beginTransaction();//Step 02 beginning transaction
        //Transaction is necessary for saving data


        session.save(s); //Step 03  saving student object // Inserting !!!!
        session.save(a);
        ts.commit();
        session.close();//Closing the session

    }
}
