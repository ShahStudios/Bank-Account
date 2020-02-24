package bankaccountprogram;

public class Checking extends Account {

	// properties specific to checking class
	int debitCardNumber, debitCardPin;
	
	// constructor to initialize settings for the checking properties
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		accountNumber = "2" + accountNumber;
		// System.out.println("Account Number: " + this.accountNumber);
		// System.out.println("New Checking Account");	
		
		setDebitCard();
	}


	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// setDebitCard method
	private void setDebitCard() {
		// generate 12 digit number
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		// generate 4 digit number
		debitCardPin = (int)(Math.random() * Math.pow(10, 4));
	}
	
	
	
	// show info specific to checking account (polymorphism aka overriding)
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Checking");
		System.out.println(
				 "\n[ Your Checking Account Details ]" +
				"\nDebit Card Number: " + debitCardNumber +
				"\nDebit Card PIN: " + debitCardPin + 
				"\nRate: " + rate);
		System.out.println(
				"---------------------------------\n");
	}
	
}
