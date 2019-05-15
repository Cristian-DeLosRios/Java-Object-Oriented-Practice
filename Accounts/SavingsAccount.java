public class SavingsAccount extends Account{
	
	 //default Constructor which extends account
    public SavingsAccount() {
        super();
    }
    
	//Constructor for SavingsAccount
    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id,  balance,  annualInterestRate);
    }
  
    //to String method
    public String toString()
    {
        String output;
        output = "\nAccount type: Savings Account" + "\nAccount id: "+ this.getID() + "\nBalance: "+ this.getBalance();
        return output;
    }
}
