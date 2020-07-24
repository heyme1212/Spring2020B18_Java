package X_FILES.day15_ForLoopReview1;

public class Account {
    private String accountHolder;
    private long accountNumber;
    private double balance;
    private int pinNumber;
    private double availablebalance;

    /*
    generate getter and setter
    actions: deposit, withdraw, available balance, try to use getter and setter in those actions.
     */

    public String getteraccountHolder(){
        return accountHolder;
    }
    public long getteraccountNumber(){
        return accountNumber;
    }

    public double getterbalance(){
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void setPinNumber(int pinNumber) {

        this.pinNumber = pinNumber;
    }

    public int getterpinNumber(){

        return pinNumber;
    }

    public void setteraccountHolder(String accountHolder){

        this.accountHolder=accountHolder;
    }

    public void deposit(double amount){
        availablebalance+=amount;
    }






}
