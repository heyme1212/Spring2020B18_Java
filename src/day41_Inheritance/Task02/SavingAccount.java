package day41_Inheritance.Task02;

public class SavingAccount extends BankAccount {
/*
create sub class of BankAccount and name it SavingAccount
			variables: accountNumber, accountHolder, balance, interestRate
			methods: deposit, showBalance
 */
    /*
    accountNumber (Inherited)
    accountHolder (Inherited)
    balance (Inherited)
    interestRate
    deposit (Inherited)
    showBalance (Inherited)
    toString (Inherited)
     */
        public static double interestRate;

        static{
            interestRate = 0.02;
        }
    }
