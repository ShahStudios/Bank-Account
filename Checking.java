package bankaccountprogram;

public class Checking extends Account {

	// properties specific to checking class
	int debitCardNumber, debitCardPin;
	
	
	public Checking(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		System.out.println("New Checking Account");	
	}
	
	
	
	
}
