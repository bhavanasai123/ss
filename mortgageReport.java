package com.mortgage;

import java.text.NumberFormat;

public class mortgageReport {

	private MortgageCalculator calculator;
	private NumberFormat currency;

	public mortgageReport(MortgageCalculator calculator) {
		this.calculator =calculator;
		this.currency = NumberFormat.getCurrencyInstance();
		
	} 
	public void mortgageReport() {
		System.out.println("---------Mortgage details---------");
		this.calculator.displayDetails();
		double mortgage = this.calculator.calculateMortgage();
		System.out.println("Mortgage : " + this.currency.format(mortgage));
	}
	
	public void paymentSchedule() {
		System.out.println("---------payment schedule--------");
		for (double balance : this.calculator.getRemainingBalance()) {
			System.out.println(balance);
	}
		
		
	}

}
