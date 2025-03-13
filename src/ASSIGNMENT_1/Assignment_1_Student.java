package ASSIGNMENT_1;
//public class Assignment_1_Student {
//}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}


