package se.lexicon;

public class BankAccount {

    //Instance Fields, AccountNumber, Balance, Name, email, PhoneNumber

    private static int accountNumberSequencer = 0; // Static field is shared in all instances of BankAccounts.

    private int accountNumber;   // 1,2,3,4,5,6,7,8,9,10,11,...
    private double balance;
    private Customer customer; // Relationship

    //Constructor - for Creating an object.
    public BankAccount(double balance, Customer customer){
        this.accountNumber = ++accountNumberSequencer;
        this.balance = balance;
        this.customer = customer;
    }

    //Custom Methods

    //Adding money to our balance.
    public void deposit(double amount){
        this.balance = balance + amount;
    }

    // Remove money from balance.
    public void withdraw(double amount){

//        if(amount > balance){
//            System.out.println("Not Allowed");
//        }else {
//            balance = balance - amount;
//        }

        if(amount > balance){
           throw new IllegalArgumentException("Amount is greater the your balance. INVALID ACTION");
        }
        balance = balance - amount;
    }


    //Getters & Setters

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}
