package day41_Inheritance;

public class BankAccount {
    /*
    create custom class called BankAccount for Bank of America' bank accounts:
			public variables:  bankName, firstName, lastName
	 		private variables: accountHolder, accountNumber, balance
	 		encapsulate all the private data
	 				(DO NOT USE SHORTCUT)
	 		create a constructor that can initialize firstName and fullName
	 				(DO NOT USE SHORTCUT)
	 		action:
	 				depositing
	 				withdrawing
	 				availablebalance
	 				toString: returns the full name and balance
     */

    public static String BankAccount="Bank of America";
    public String firstName;
    public String lastName;
    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        this.accountHolder=firstName+" "+lastName;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {

        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String firstName, String lastName){
        this.accountHolder=firstName+" "+lastName;
    }

    public void depositing(int amount){
        //balance+=amount;
        setBalance(balance+amount);
    }
    public void withdrawing(int amount){
        //balance-=amount;
        if(balance<=0){
            System.out.println("Not available balance");
            return;
        }
        setBalance(balance-amount);
    }

    public void checkBalance(){
        System.out.println("Available Balance is: "+getBalance());
    }

    public String toString(){
        return "Full Name: "+ getAccountHolder()+", Balance: "+getBalance();
    }






























}
