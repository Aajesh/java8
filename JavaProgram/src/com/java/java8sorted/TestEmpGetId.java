package com.java.java8sorted;

import java.util.Comparator;
import java.util.List;

public class TestEmpGetId {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=EmpIment.getEmployees();
		

		/**
		 *    Sort by id name
		 */

	   //sortById(employees);
	   
		/**
		 *    Sort by fist name
		 */

	   //sortFirstName(employees);
	 //  sortLastName(employees);
	   
	   sortReverseOrder(employees);
		
	}
	private static void sortReverseOrder(List<Employee> employees) {
		// TODO Auto-generated method stub
		
		//Compare by Id
		Comparator<Employee> compareById_1 = Comparator.comparing(Employee::getLastName);
		employees.sort(compareById_1.reversed());
		System.out.println(employees);
		
		
		
		/*employees.sort(Comparator.comparing(Employee::getLastName).reversed());
		System.out.println(employees);
		*/
	}
	public static void sortById(List<Employee> employees) {
			
		//Compare by Id
		Comparator<Employee> compareById_1 = Comparator.comparing(e -> e.getId());
		employees.sort(compareById_1);
		System.out.println(employees);
	}
	
	public static void sortFirstName(List<Employee> employees) {
		System.out.println("===================Firstname========================");
		Comparator<Employee> compareById_1 = Comparator.comparing(e -> e.getFirstName());
		employees.sort(compareById_1);
		System.out.println(employees);
	}
	
	
	public static void sortLastName(List<Employee> employees) {
		System.out.println("===================LastName========================");
		Comparator<Employee> compareById_1 = Comparator.comparing(e -> e.getLastName());
		employees.sort(compareById_1);
		System.out.println(employees);
	}

}
