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
	}

	// show info specific to checking account (polymorphism aka overriding)
	public void showInfo() {
		System.out.println(
				"---------------------------------");
		System.out.println("Account Type: Checking");
		super.showInfo();
		System.out.println(
				"---------------------------------\n");
	}
	
}
