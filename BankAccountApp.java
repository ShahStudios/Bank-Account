package bankaccountprogram;

import java.util.ArrayList;
import java.util.List;

public class BankAccountApp {

	public static void main(String [] args) {
		
		List<Account> accounts = new ArrayList<Account>();
		String file = "C:\\Users\\KAZITRON\\Downloads\\Shah-Bank-AccountsInfo.csv";
		List<String[]> newAccountHolders = CSV.read(file);
		
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String ssn = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			
			if (accountType.equals("Savings")) {
				accounts.add(new Savings(name, ssn, initDeposit));
			} else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, ssn, initDeposit));
			} else {
				System.out.println("Error Reading Account Type");
			}
		}
		
		for (Account acc : accounts) {
			acc.showInfo();
			// test other cases for methods to show all the data of each user in the database
			// acc.compound();
			// acc.deposit(220);
			// acc.withdraw(20);
		}
		
		// test showinfo method
		accounts.get((int) Math.random() * accounts.size()).showInfo();;
		// test interest method 
		accounts.get((int) Math.random() * accounts.size()).compound();
		// test deposit method
		accounts.get((int) Math.random() * accounts.size()).deposit(2000);
		// test withdraw method
		accounts.get((int) Math.random() * accounts.size()).withdraw(500);
		// test withdraw method
		accounts.get((int) Math.random() * accounts.size()).transfer("Car-Saving", 25);
	}
}