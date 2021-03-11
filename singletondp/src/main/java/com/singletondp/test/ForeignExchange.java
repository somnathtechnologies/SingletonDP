package com.singletondp.test;

import com.singletondp.pattern.CurrencyConverter;

public class ForeignExchange {
	public static void main(String[] args) {
		CurrencyConverter currencyConverter1 = CurrencyConverter.getInstance();
		CurrencyConverter currencyConverter2 = CurrencyConverter.getInstance();

		double hc1 = currencyConverter1.usdToInr(0, 0, 0);
		double hc2 = currencyConverter2.usdToInr(0, 0, 0);
		System.out.println("hc1 : " + hc1 + " hc2 : " + hc2);
	}
}
