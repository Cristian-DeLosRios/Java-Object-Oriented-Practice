public class CheckingAccount extends Account{
	
	 //default Constructor which extends account
	 public CheckingAccount() {
	        super();
	    }
	 
	//Constructor for CheckingAccount 
    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id,  balance,  annualInterestRate);
    }
    
    //Withdraw method
    public void withdraw(double amount) {
        if (super.getBalance() < amount) {
            System.out.println("Insufficent balance in the account. You have overdraft limit.");
            this.balance -= amount;
        } else {
            this.balance -= amount;
            System.out.println("After withdrawing $" + amount + " balance in account is: $" + this.balance);
        }
    }
    
    //to String Method
    public String toString()
    {
        String output;
        output = "\nAccount type: Checking Account" +"\nAccount id: "+ this.getID() + "\nBalance: "+this.getBalance();
        return output;
    }
}
