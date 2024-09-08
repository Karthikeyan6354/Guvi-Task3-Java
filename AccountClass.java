package task3;

public class AccountClass {
	
	private long AccNumber;  
	private String AccHolderName;     //declaring variables inside the class
	private double AccBalance;
	
	AccountClass()                  //Constructor with No argument
	{          //Initializing the values
		AccNumber=11100354878l;      
		AccHolderName="Sherman Dausses";
		this.AccBalance=0.0;
	}
	
	AccountClass (long AccountNumber, String AccountHolderName) //Constructor with 2 arguments
	{
		AccNumber=AccountNumber;  
		AccHolderName=AccountHolderName;   //assigning the vales to variables through arguments
		this.AccBalance=0.0;
	}
	
	public void deposite(double amount)   //deposit method to add money to the account
	{
		AccBalance+=amount;
		System.out.println("₹ "+ amount +" Amount credited to your account");
		//System.out.println("New Balance: ₹ "+ AccBalance);
	}
	
	public void withdraw(double amount) //withdraw method to deduct the amount from the account
	{
		AccBalance-=amount;
		System.out.println("withdraw amount: ₹ "+ amount);
		//System.out.println("New Balance: ₹ "+ AccBalance);
		
	}
	
	public void checkBalance()      //this method will show the balance summary with account details
	{
		System.out.println("Account Number: " + this.AccNumber);
		System.out.println("Account Holder Name: " +this.AccHolderName);
		System.out.println("Current Balance: ₹ " + this.AccBalance);
	}
	
	public static void main(String[] args) 
	{
		// To calculate the balance of the account
		
	 AccountClass ac1=new AccountClass(); //Invoking the default constructor through the object creation
	 ac1.deposite(10000);       //calling deposit method to add money to the account
	 ac1.withdraw(500);         //Calling withdraw method
	 ac1.checkBalance();        //Calling Check balance method
	 
	 AccountClass ac2=new AccountClass(12457868689l,"Mark Antony"); //Invoking the 2 parameterized constructor
	 ac2.deposite(20000);       //calling deposit method to add money to the account
	 ac2.withdraw(7500.75);     //Calling withdraw method
	 ac2.deposite(9000);         
	 ac2.checkBalance();        //Calling Check balance method
	
	 
		
	}

}
