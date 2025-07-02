package entities;

public class CurrencyConverter {
	
	
	public static double pricing(double price, double boughtAmount) {
		return price*boughtAmount*1.06;
	}
}
