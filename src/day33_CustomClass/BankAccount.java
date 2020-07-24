package day33_CustomClass;

import java.sql.SQLOutput;

public class BankAccount {
    /*
        create a custom class for BankAccount
        attributes/data that can have are:
        1. AccountHolder, 2. AccountNumber, 3. Balance
    Actions: showBalance, deposit, withdraw
    Requirements:
        1. user should be able to deposit money into their account
        2. user should be able to withdraw money from their account
                2.1 if the withdrawing amount is greater than available balance, 35$ penalty charge will be added
                2.2 if the balance is less than or equal to 0, user should not be able to withdraw money
        3. user should be able to see their balance
     */

String accountHolder;
long accountNumber;
double balance;

public void checkingBalance(){
    //String acct=""+accountNumber;
// String AccountNo="************"+acct.substring(12);
// System.out.println("Account Holder: "+accountHolder);
// System.out.println("Account Number: "+AccountNo);
    System.out.println("Available balance is $"+ balance);
}


public void withdraw(double amount){
    if(balance<=0){
        System.out.println("Not available balance to withdraw money");
        return;
    }
    System.out.println("Withdrawing amount is $"+ amount);
    balance -=amount;
    if(balance<0){
        balance-=35;
    }
}

public void deposit(double amount){
    System.out.println("Deposit amount is $"+ amount);
    balance +=amount;
    }

    public String toString(){
        String result = "Account Holder: "+accountHolder+"\nAccount Number: "+accountNumber+"\nAvilable Balance: "+balance;
        return result;
    }

}




