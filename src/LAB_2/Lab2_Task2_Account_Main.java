package LAB_2;
public class Lab2_Task2_Account_Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayBalance();

        Account acc2 = new Account(1000);
        acc2.deposit(300);
        acc2.withdraw(500);
        acc2.displayBalance();
    }
}