// A BankAccount keeps track of a user's money balance and ID,
// and counts how many transactions (deposits/withdrawals) are made.
public class BankAccount {
    // attributes
    private String id;
    private double balance;
    private int transactions;

    // Constructs a BankAccount object with the given id, and
    // 0 balance and transactions.
    public BankAccount(String idx) {
        this.id = idx;
        this.balance = 0;
        this.transactions = 0;
    }

    // returns the field values
    public double getBalance() {
        return this.balance;

    }

    public String getID() {
        return this.id;

    }

    public int getTransactions() {
        return this.transactions;

    }

    // Adds the amount to the balance if it is between 0-500.
    // Also counts as 1 transaction.
    public void deposit(double amount) {
        if (amount > 0 && amount < 500) {
            this.balance += amount; // this.balance = this.balance + amount;
            this.transactions++; // this.transactions = this.transactions + 1;
            System.out.println("Deposit successfull!");
        } else {
            System.out.println("Deposit unsuccessfull.");
        }

    }

    // Subtracts the amount from the balance if the user has enough money.
    // Also counts as 1 transaction.
    public void withdraw(double amount) {
        if (!(amount > this.balance)) {
            this.balance -= amount;
            this.transactions++; // this.transactions = this.transactions + 1;
            System.out.println("Witdhdraw successfull!");
        } else {
            System.out.println("Witdhdraw unsuccessfull.");
        }
    }

    // your method would go here
    public void transfer(BankAccount x, double amount) {// 500 300 150
        // if the account doesnt have the transfer fee dont do anything
        if (this.balance < 5) {
            System.out.println("You don't have enough money.");
            return;
        }
        // if the account doesnt have enough money, transfer whatever money left,
        if (this.balance < amount) {
            // add the money to the x BankAccount
            x.balance += this.balance;
            // lets decrease the money from "this" bank account
            this.balance -= this.balance;

        } else {
            // lets dedut 5 USD from the balance
            this.balance -= 5;
            // lets decrease the money from "this" bank account
            this.balance -= amount;
            // add the money to the x BankAccount
            x.balance += amount;
            // lets increase the transaction count by one
            this.transactions++;
            x.transactions++;
        }

    }
}