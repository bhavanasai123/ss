package com.mortgage;

import java.util.Scanner;

public class ConsoleInput {

	private static Scanner scanner = new Scanner(System.in);
	
	public static double readNumber(String prompt, double min, double max) {
		double value;
		while (true) {
			System.out.println(prompt);
			value = scanner.nextDouble();
			if (value >= min && value <= max)
				break;
			System.out.println("enter the value between" + min + "and" + max );
				
		}
        return value;
	}

}
