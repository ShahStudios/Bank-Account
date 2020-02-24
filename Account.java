package bankaccountprogram;

// can't create objects from this class but can create classes from classes that inherit this class
// whatever code is inside IBaseRate will be inside account abstract class and be inherited by the children classes
public abstract class Account implements IBaseRate {

	// list of common properties for children classes
	private String name, ssn;
	private double balance;
	private static int index = 10000;
	protected double rate;
	protected String accountNumber;
	
	
	
	// common properties for children accounts to inherit
	public Account(String name, String ssn, double initDeposit) {
		this.name = name;
		this.ssn = ssn;
		this.balance = initDeposit;
		// System.out.println("\nName: " + name + "\nSSN: " + ssn + "\nBalance: $" + balance);
		
		// call setAccountNumber method
		index++;
		this.accountNumber = setAccountNumber();
		// System.out.println("Account Number: " + this.accountNumber);
		
		// call rate depending on if it is for checking or saving
		setRate();
	}
	
	// can't create objects with this class for children to implement this method
	public abstract void setRate();
	
	
	// setup unique account number using his last two ssn, 
	// static unique number 10000 incremented and a random number generated all combined together
	private String setAccountNumber() {
		String lastTwoSSN = ssn.substring(ssn.length()-2, ssn.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNumber;
	}
	
	// compound interest for children classes
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		viewBalance();
	}
	
	// Common methods for children classes to inherit
	public void deposit(double amount) {
		balance = balance + amount;
		viewBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		viewBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		viewBalance();
	}
	public void viewBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	
	
	
	
	// Show info method 
	public void showInfo() {
		System.out.println("---------------------------------\n" + "      Bank Account Details\n" 
				+ "---------------------------------\n" + 
		"Name: " + name + "\nAccount Number: " + accountNumber + "\nBalance: " + balance);
	}
	
	
	
}