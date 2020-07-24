package day41_Inheritance.Task02;

public class CheckingAccount extends BankAccount {
   /*
create sub class of BankAccount and name it checkingAccount
			variables: accountNumber, accountHolder, balance
			methods: deposit, withDraw, showBalance

    accountNumber (Inherited)
    accountHolder (Inherited)
    balance (Inherited)
    deposit (Inherited)
    withDraw (declared)
    showBalance (Inherited)
    ToString (Inherited)
     */

        public void withdraw(int amount){
            balance -= amount;
        }


    }
