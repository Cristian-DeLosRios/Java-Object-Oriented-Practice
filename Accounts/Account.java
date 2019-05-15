import java.util.*;

public class Account {
     
	 
    int id = 0;
    double balance = 0;
    double annualInterestRate = 0;
    Date dateCreated;
     
    //no Arg Constructor
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    //Constructor with id, balance and annual interest rate
    public Account(int id, double balance, double annualInterestRate) {
       
    	this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }
    
    //Getters and setters
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAnnualInterestrate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public double getMonthlyInterestRate() {
        return (this.annualInterestRate) / 12;
    }

    
    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return this.id;
    }

    public double getAnnualInterestrate() {
        return this.annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("not enought money");
        } else {
            this.balance -= amount;
            System.out.println("After withdrawing " + amount + " balance now is $" + this.balance);
        }
    }
     //Deposit method
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(" After depositing " + amount + " balance now is $" + this.balance);
    }
    
    //toString Method
    public String toString()
    {
        String output;
        output = "\nAccount id: "+ this.getID() + "\nBalance: " + this.getBalance();
        return output;
    }
    
}
