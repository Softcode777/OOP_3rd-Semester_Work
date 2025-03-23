package LAB_6;

public class Activity1_Person{
    protected String name;
    protected String id;
    protected String phone;

    public Activity1_Person(){
        name = "NaginaNazar";
        id  = "sp14bcs039";
        phone = "02334242";
    }
    public Activity1_Person(String a,String b, String c) {
        name = a ;
        id = b ;
        phone = c;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void display() {
        System.out.println("Name : " + name + "\nID : " + id + "\nPhone :" + phone);
    }
}
