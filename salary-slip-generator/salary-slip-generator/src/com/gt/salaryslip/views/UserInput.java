package com.gt.salaryslip.views;

import java.util.Scanner;

import com.gt.salaryslip.models.Employee;

public class UserInput {
	public Employee takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		scanner.nextLine();
		String name= scanner.nextLine();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		Employee emp = new Employee(id, name, salary);
		scanner.close();
		return emp;
	}
}
