

import java.util.Scanner;

public class ReadingInputexample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int employeeId;
		String employeeName;
		float employeeSalary;
		
		System.out.println("enter the id :");
		employeeId = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter your name : ");
		employeeName = scan.nextLine();
		System.out.print("enter your salary");
		employeeSalary = scan.nextFloat();
		
		
		System.out.println("employee id ; " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("employee salary : " + employeeSalary);

	}

}
