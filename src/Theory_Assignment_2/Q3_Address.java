package Theory_Assignment_2;

public class Q3_Address {
    private String street;
    private String city;
    private String zipCode;

    // Constructor for Address
    public Q3_Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    // Getter methods
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }
}
