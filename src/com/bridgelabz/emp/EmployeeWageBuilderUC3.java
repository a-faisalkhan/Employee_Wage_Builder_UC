package com.bridgelabz.emp;

public class EmployeeWageBuilderUC3 {
	
	public static void main(String[] args) {
		final int PRESENT_NUMBER_RANGE = 3;
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int WAGE_PER_HOUR = 20; 
		final int WORKING_HOUR = 8; 
		
	int isPresent = (int) Math.floor(Math.random() * PRESENT_NUMBER_RANGE); //(int) typecasting required becoz we are storing	
	
	int empWage;
	if (isPresent == PRESENT) {
		System.out.println("Employee is present");
		empWage = WAGE_PER_HOUR * WORKING_HOUR;
	} else if (isPresent == PART_TIME) {
		System.out.println("Employee is working part time");
		empWage = WAGE_PER_HOUR * (WORKING_HOUR/2); 
	} else {
		System.out.println("Employee is absent");
		empWage = 0; 
	}
	System.out.println("Emp Wage: $" + empWage + "USD");
	}

}
