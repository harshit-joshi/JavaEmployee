package main;

import java.util.Date;
import java.util.Scanner;

import interfaces.Operation;
import models.Employee;
import operation.EmployeeOperation;

public class Application {

	public static void showTerminal() {
		System.out.println("Enter your choice: ");
		System.out.println("1. Register kijiyega! ");
		System.out.println("2. Employee dekyegaa!");
		System.out.println("3. Nikalayega!");
	}
	
	public static void saveEmployee(String name, Double salary,Integer age, Date doj,boolean flagAll) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setSalary(salary);
		emp.setAge(age);
		emp.setDateOfJoining(doj);
		Operation operation = new EmployeeOperation();
		operation.save(emp);
	}
	public static void main(String[] args) {
		int choice=0;
		System.out.println("*************************Employee Management System*************************");
		Scanner sc = new Scanner(System.in); 
		showTerminal();
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			String name= sc.nextLine();
			Double salary= sc.nextDouble();
			Integer age = sc.nextInt();
			String _doj=sc.nextLine();
			
			break;
		case 2:
			break;
		case 3:
			break;
		default:
		}

	}

}
