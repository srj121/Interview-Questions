package main;

class BankAccount{
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Person{

    private String name;
    private BankAccount bankAccount;

    public Person(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
public class Association_Implementation {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(123, 100.1d);
        BankAccount account2 = new BankAccount(456, 200.1d);

        Person person1 = new Person("suraj", account1);
        Person person2 = new Person("rahul", account2);

        double surajDeposite = 500.0;

       person1.getBankAccount().setBalance(person1.getBankAccount().getBalance() + surajDeposite);
        System.out.println(person1.getName()
                + " deposited $" + surajDeposite
                + " into the bank Account. hence new balance is = "
                +  person1.getBankAccount().getBalance());

        double rahulWithdraw = 50.0;

        person2.getBankAccount().setBalance(person2.getBankAccount().getBalance() + rahulWithdraw);
        System.out.println(person2.getName()
        + " Withdrawn " + rahulWithdraw
        + " from the bank account . hence the balance is = "
        + person2.getBankAccount().getBalance());

        //Association: Association represents a relationship between two classes,
        // where one class uses or interacts with the other class.
        // There are two types of association: unidirectional and bidirectional.
        // In unidirectional association, one class knows about the other class,
        // but the other class doesn't know about the first class.
        // In bidirectional association, both classes know about each other.

        //This is an example of a unidirectional association because
        // The Person class is aware of the BankAccount class,
        // but the BankAccount class does not depend on the Person class.


    }
}
