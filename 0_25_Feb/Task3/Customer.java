
/*
Author  : Kagan Ozturkoglu
Date    : 25 Feb 22
GitHub  : ozturkoglukagan
*/


public class Customer {

    // Attributes
    private int ID;
    String Name;
    String Surname;
    private int birthYear;
    private long TCKN;
    private double balance;
    double debt;

    // Constructor
    public Customer(int ID, String name, String surName, double balance,double debt){
        this.ID=ID;
        this.Name=name;
        this.Surname=surName;
        this.balance=balance;
        this.debt=debt;
    }

    // Behaviours
    public double upload_money(double amount){
        this.balance=this.balance+amount;
        return this.balance;
    }

    public double withdraw_money(double amount){
        if (amount>this.balance) {
            System.out.println("-----------------------------");
            System.out.println("You don't have enough balance to perform this operation.");
            System.out.println("-----------------------------");
            return this.balance;
        }  
        this.balance=this.balance-amount;
        return this.balance;
    }

    public void show_customer(){
        System.out.println("-----------------------------");
        System.out.println("Customer ID:" + this.ID);
        System.out.println("Customer Name:" + this.Name);
        System.out.println("Customer Balance is: "+this.balance);
        System.out.println("Customer Debt is: "+this.debt);
        System.out.println("-----------------------------");

    }

    public void show_balance(){
        System.out.println("Customer"+ this.ID +"Balance is: "+this.balance);
    }

    public double take_credit(double amount){
        this.balance=this.balance+amount;
        this.debt=-amount;
        return this.balance;
    }

    // GETTER SETTERS
    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }

    public void setBirthYear(int newYear){

        if(newYear < 1910){
            System.out.println("Could it be real?");
            return;
        }else{
            this.birthYear = newYear;
        }
    }    

}