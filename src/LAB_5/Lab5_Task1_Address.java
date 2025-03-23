package LAB_5;

//public class Lab5_Task1_Address {
//}

class Address {
    private String streetNumber;
    private String houseNumber;
    private String city;
    private int code;

//    public Address() {
//        streetNumber = "";
//        houseNumber = "";
//        city = "";
//        code = 1;
//    }

    public Address(String streetNumber, String houseNumber, String city, int code) {
        this.streetNumber = streetNumber;
        this.houseNumber = houseNumber;
        this.city = city;
        this.code = code;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public void display() {
        System.out.println("Address:" + " " + "streetNumber: " +  streetNumber + " ," + "houseNumber:"+ houseNumber + ", " + "city: "+city + ", " + " citycode"+ code);
    }
}

