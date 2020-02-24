package bankaccountprogram;

// can't create objects from this class but can create classes from classes that inherit this class
// whatever code is inside IBaseRate will be inside account abstract class and be inherited by the children classes
public abstract class Account implements IBaseRate {

	// common properties for children accounts to inherit
	public Account(String name) {
		System.out.println("Name: " + name);
		System.out.print("New Account: ");
	}
	
	
	
	
	
}
