package LAB_5;

public class Lab5_Task2_Book_Main {
    public static void main(String[] args) {

          Address adrs1 = new Address("2","10","d.i.khan",29111);
        Person author = new Person("lian",adrs1);
        Book book1 = new Book(author,"java book","Pearson");
        System.out.println("Old Adsress of author is:");
        book1.display();

//      Modifying the address of the author
      Address modifiedAddress   = new Address("10_B","5","Sahiwal" ,+ 57000);
     author.setAddress(modifiedAddress);

        System.out.println("New Address of author is:");
        book1.display();

    }
}
