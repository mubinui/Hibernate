package MappingOTM;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeAddress {
    private String street;
    private String city;
    private String house;
    private String country;

    public EmployeeAddress() {
    }

    public EmployeeAddress(String street, String city, String house, String country) {
        this.street = street;
        this.city = city;
        this.house = house;
        this.country = country;
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

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
