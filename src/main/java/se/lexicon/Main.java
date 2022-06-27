package se.lexicon;

public class Main {
    public static void main(String[] args) {

        BankAccount simonsFirstAccount = new BankAccount(
                1_000_000,
                "Simon Elbrink","simon@lexicon.se", "1234567890");

        simonsFirstAccount.withdraw(300_000);

        System.out.println(simonsFirstAccount.getBalance());

        simonsFirstAccount.deposit(900_000);
//        System.out.println(simonsFirstAccount.getBalance());




//        simonsFirstAccount.accountNumber;
//        simonsFirstAccount.getAccountNumber(); // Access info in Field of AccountNumber

//        simonsFirstAccount.accountNumber = 10;
//        simonsFirstAccount.setAccountNumber(10); // Updates / set the Account number to a new value.


        BankAccount simonsSecondAccount = new BankAccount( 0,
                "Simon Elbrink","simon@lexicon.se", "1234567890");


        System.out.println(simonsFirstAccount.getAccountNumber());      //1
        System.out.println(simonsSecondAccount.getAccountNumber());     //2


        System.out.println(simonsFirstAccount);
//        System.out.println(simonsFirstAccount.toString());




    }
}