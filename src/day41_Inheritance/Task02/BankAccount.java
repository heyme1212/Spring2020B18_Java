package day41_Inheritance.Task02;

public class BankAccount {
    /*
    Task02:
	create a class called BankAccount
			variables:  accountNumber, accountHolder, Balance
			methods: deposit, showBalance, toString
	create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
	create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance
     */
    public long accountNumber;
    public String accountHolder;
    public  double balance;

    public void deposit(int amount){
        balance += amount;
    }

    public void showBalance(){
        System.out.println("Available Balance: "+balance);
    }

    public String toString(){
        return "Name: "+accountHolder+", balance: "+balance;
    }
}
