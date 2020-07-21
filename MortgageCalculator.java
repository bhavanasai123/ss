package com.mortgage;

public class MortgageCalculator {
	
	private static byte MONTH_IN_YEAR = 12;
	private static byte PERCENT = 100;
	private int principle;
	private float annualInterest;
	private int years;
	
	
	public MortgageCalculator(int principle, float annualInterest, int years) {
		this.principle = principle;
		this.annualInterest =annualInterest;
		this.years =years;
		
	}
	
	public double calculateMortgage() {
		float monthlyInterest = this.annualInterest/PERCENT/MONTH_IN_YEAR;
		float numberOfPayments = this.years * MONTH_IN_YEAR;
		
		double mortgage = principle
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return mortgage;
	}
	public double calculateBalance(short numberOfPaymentsMade) {
		
		float monthlyInterest =  getMonthlyInterest();
		float numberOfPayments = this.years * MONTH_IN_YEAR;
		
		double balance = principle * (Math.pow(1 + monthlyInterest, numberOfPayments)-Math.pow(1 + monthlyInterest,  numberOfPaymentsMade))/(Math.pow(1 + monthlyInterest,  numberOfPayments)-1);
		return balance;
	}
	
	public double[] getRemainingBalance() {
		int numberOfPayments = getNumberOfPayments();
		double[] balances = new double[numberOfPayments];
		for (short month =1 ; month < balances.length; month++) {
			balances[month-1] = calculateBalance(month);
			
		}
		return balances;
	}
	private float getMonthlyInterest() {
		return this.annualInterest / PERCENT / MONTH_IN_YEAR;
		
	}
	private int getNumberOfPayments() {
    return this.years* MONTH_IN_YEAR;
	}

	public void displayDetails() {
		System.out.println("principle : " + this.principle);
		System.out.println("annual interest rate : " + this.annualInterest);
		System.out.println("period years : " + this.years);
	}


}
