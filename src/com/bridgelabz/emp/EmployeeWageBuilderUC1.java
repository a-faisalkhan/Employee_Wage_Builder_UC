package com.bridgelabz.emp;

public class EmployeeWageBuilderUC1 {
	
	public static void main(String[] args) {
		final int PRESENT =1; 
		
		int isPresent = (int) Math.floor(Math.random() * 2); //(int) typecasting required becoz we are storing
			
		System.out.println(isPresent);
			
			if (isPresent == PRESENT) {
				System.out.println("Employee is present");
			} else {
				System.out.println("Employee is absent");
			}
	}

}
