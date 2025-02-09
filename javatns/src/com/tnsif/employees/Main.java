package com.tnsif.employees;
import com.tnsif.employees.Developer;
import com.tnsif.employees.Manager;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager("vinny", 101, 85000.0, "HR");
        Developer developer = new Developer("nikki", 102, 75000.0, "Java");
        
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.getName());
        System.out.println("Employee ID: " + manager.getEmployeeId());
        System.out.println("Salary: " + manager.getSalary());
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        System.out.println("Name: " + developer.getName());
        System.out.println("Employee ID: " + developer.getEmployeeId());
        System.out.println("Salary: " + developer.getSalary());
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());

		
	}

}
