package com.mortgage;

public class MortgageMain {

	public static void main(String[] args) {
		
		System.out.println("---------------Mortgage Calculator---------");
        
		int principle = (int) ConsoleInput.readNumber("enter principle" , 1000, 100000);
        float annualInterest = (float) ConsoleInput.readNumber("enter annual interest " , 1, 30);
        int years = (int) ConsoleInput.readNumber("enter the year" , 1, 30);
        
        MortgageCalculator calculator= new MortgageCalculator(principle, annualInterest, years);
        mortgageReport report = new mortgageReport(calculator);
        report.mortgageReport();
        report.paymentSchedule();
	}
 }

