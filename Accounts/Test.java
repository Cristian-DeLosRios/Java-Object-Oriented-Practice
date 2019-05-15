public class Test {
    public static void main(String args[]) {

    	//Create new Account object
        Account newAcc = new Account(1122, 20000, 4.5);
        	//output id and initial balance
            System.out.println("Account id: "+ newAcc.getID());
            System.out.println("Initial account balance: "+ newAcc.getBalance());
            
            //output of withdraws and deposits
            System.out.println("Withdrawing $2500 ");
            newAcc.withdraw(2500);
            System.out.println("balance after withdrawl: "+newAcc.getBalance());
            System.out.println("Depositing $3000");
            newAcc.deposit(3000);
            
            //Final set of outputs
            System.out.println("balance in account is:  " + newAcc.getBalance());
            System.out.println("Monthly Interest  is:  " + (newAcc.getMonthlyInterestRate() * newAcc.getBalance()) / 100);
            System.out.println("Account was created on:  " + newAcc.getDateCreated());

            System.out.println(newAcc);
        

}
}
