package LAB_5;

//public class Lab5_Task1_Person {
//}

class Person {
private Address address;
private String name;

//    parametrized Constructor

public Person(String name, Address address) {
    this.name  = name ;
    this.address = address;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public void display(){
        System.out.println("Person:" + name );
        address.display();
    }
}
