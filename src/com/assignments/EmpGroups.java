package com.assignments;

public class EmpGroups {

	//creation of arrays to store the employee names and ids from the employees class
	static String[] names = new String[3];
	static int[] ids = new int[3];
	
	public static void main(String[] args) {
		//created object for employees class to access its data
		Employees obj = new Employees();
		/*storing the data from parent class by id to id, we have used class name in empgroups.name because we want 
		to access the emp groups class data, we are accessing by using the class name.*/
		EmpGroups.names[0] =obj.empNames[0];
		EmpGroups.names[1] =obj.empNames[1];
		EmpGroups.names[2] =obj.empNames[2];
		
		EmpGroups.ids[0] =obj.empId[0];
		EmpGroups.ids[1] =obj.empId[1];
		EmpGroups.ids[2] =obj.empId[2];
		
		System.out.println("Employee Name : "+ names[0]+ "Employee ID : "+ ids[0]);
		System.out.println("Employee Name : "+ names[1]+ "Employee ID : "+ ids[1]);
		System.out.println("Employee Name : "+ names[2]+ "Employee ID : "+ ids[2]);
		
	}

}
