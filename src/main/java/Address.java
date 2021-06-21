import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name ="student_address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private int aid;
    @Column(name ="STREET",length = 100)
    private String street;
    @Column(length = 100)
    private String city;
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name= "added_date")
    @Temporal(TemporalType.DATE)
    private Date addDate;
    @Lob
    private byte [] image;

    public Address() {
    }

    public Address(int aid, String street, String city, boolean isOpen, double x, Date addDate, byte[] image) {
        this.aid = aid;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addDate = addDate;
        this.image = image;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
