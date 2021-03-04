package com.interfaces;

import java.util.Arrays;

public class EmployeeSortTest {

	public static void main(String[] args) {
		
		Employee[] staff = new Employee[3];

	      staff[0] = new Employee("Harry Hacker", 35000);
	      staff[1] = new Employee("Carl Cracker", 75000);
	      staff[2] = new Employee("Tony Tester", 38000);

	      Arrays.sort(staff);
	      System.out.println("Staff Array of Object [0]:" + "\n" +staff[0].getName()+ ",  " + staff[0].getSalary());

	      // print out information about all Employee objects
	      for (Employee e : staff)
	         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
	      
	      System.out.println("CompareTo object Method: " + staff[0].compareTo(staff[2]));
	}

}
