package bankaccountprogram;

// API that we can use for other classes that will cover the base rate
public interface IBaseRate {

	// return base rate
	default double getBaseRate() {
		return 2.5;
	}
	
	
}
