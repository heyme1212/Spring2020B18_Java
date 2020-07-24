package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Hilal=new BankAccount();
        Hilal.accountHolder="Hilal";
        Hilal.accountNumber=123456;

        Hilal.checkingBalance(); // $0 at the beginning
        Hilal.deposit(100);
        Hilal.checkingBalance();
        Hilal.deposit(50);

        Hilal.checkingBalance();
        Hilal.withdraw(200);
        Hilal.checkingBalance();
        Hilal.withdraw(100);
        Hilal.checkingBalance();

        System.out.println("=================================");

        System.out.println( Hilal);



    }
}
