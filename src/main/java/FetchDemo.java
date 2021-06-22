import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        //GET / Load operation
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        //get  [We know the primary key here pk is id ] for grabbing single object
        Student student = session.get(Student.class,1002);
        System.out.println(student);
        Student studenta = session.get(Student.class,1002);
        System.out.println(studenta);
        //get returns null when object is not found
        //Use get when you are not sure the object exists or not
        //Performance is not good compare to "Load" involve several database call

        //Load same as get but (returns except when object not found )
        //If you are sure the the object exists
        //Works faster -> Can access proxy lazy initialization
        Address ad = (Address)session.load(Address.class,2);
        System.out.println(ad.getStreet());
        Address ada = (Address)session.load(Address.class,2);
        System.out.println(ada.getStreet());




        session.close();
        factory.close();
    }
}

