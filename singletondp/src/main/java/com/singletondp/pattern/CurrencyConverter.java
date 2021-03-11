package com.singletondp.pattern;

public class CurrencyConverter {
	private static CurrencyConverter instance;

	private CurrencyConverter() {
		// no-op
	}

	// unless static other classes cannot call this to get the object of our class
	public static CurrencyConverter getInstance() {
		if (instance == null) {
			instance = new CurrencyConverter();
		}
		return instance;
	}

	public double usdToInr(double dollarAmount, double exchangeAmount, double exchangeCharges) {
		return this.hashCode();
	}
}
