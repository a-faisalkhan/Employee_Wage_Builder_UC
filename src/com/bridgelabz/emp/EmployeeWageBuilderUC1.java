package com.bridgelabz.emp;

public class EmployeeWageBuilderUC1 {
	
	/*public static void main(String[] args) {
		final int PRESENT =1; 
		
		int isPresent = (int) Math.floor(Math.random() * 2); //(int) typecasting required becoz we are storing
			
		System.out.println(isPresent);
			
			if (isPresent == PRESENT) {
				System.out.println("Employee is present");
			} else {
				System.out.println("Employee is absent");
			}
	}*/
	
	//UC2 (Calculate employee wage
	public static void main(String[] args) {
		final int PRESENT_NUMBER_RANGE = 2;
		final int PRESENT = 1;
		final int WAGE_PER_HOUR = 20;
		final int WORKING_HOUR = 8;
	
	int isPresent = (int) Math.floor(Math.random() * PRESENT_NUMBER_RANGE); //(int) typecasting required becoz we are storing	
	
	int empWage;
	if (isPresent == PRESENT) {
		System.out.println("Employee is present");
		empWage = WAGE_PER_HOUR * WORKING_HOUR;
	} else {
		System.out.println("Employee is absent");
		empWage = 0; 
	}
	System.out.println("Emp Wage: $" + empWage +" USD");
	}

}
