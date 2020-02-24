package bankaccountprogram;

public class Savings extends Account {

	// properties specific to checking class
	int safetyDepositBoxKey, safetyDepositBoxID;
	
	public Savings(String name, String ssn, double initDeposit) {
		super(name, ssn, initDeposit);
		System.out.println("New Savings Account");
	}
	
	
}