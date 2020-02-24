package bankaccountprogram;

public class BankAccountApp {

	public static void main(String [] args) {
		
		Checking checkingAccount1 = new Checking("Shahzada Shah", "412738341", 4200);
		Savings savingAccount1 = new Savings("Tanzeel Saeed", "215632173", 3400);
		
		checkingAccount1.showInfo();
		savingAccount1.showInfo();
		
		checkingAccount1.compound();
		savingAccount1.compound();
		
		
		
	}
		
}