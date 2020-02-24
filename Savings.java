package bankaccountprogram;

public class Savings extends Account {

	// properties specific to checking class
	private int safetyDepositBoxKey, safetyDepositBoxID;
	
	// constructor to initialize settings for the saving properties
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "1" + accountNumber;
		// System.out.println("Account Number: " + this.accountNumber);
		// System.out.println("New Savings Account");
		
		setSafetyDepositBox();
		
	}
	

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	
	// create method for safetyDepositebox (generate numbers to have 3 digit box id and 4 digit key)
	public void setSafetyDepositBox() {
		// generate 3 digit number
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		// generate 4 digit number
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	
	// show info specific to checking account (polymorphism aka overriding)
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Savings");
		System.out.println(
				 "\n[ Your Saving Account Details ]" +
				"\nSafety Deposit Box ID: " + safetyDepositBoxID +
				"\nSafety Deposit Box Key: " + safetyDepositBoxKey +
				"\nRate: " + rate);
		System.out.println(
				"---------------------------------\n");
	}
	
}