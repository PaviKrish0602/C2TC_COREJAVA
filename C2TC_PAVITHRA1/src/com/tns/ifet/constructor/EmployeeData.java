package com.tns.ifet.constructor;
class Employee{
	private String empname;
	private int empid;
	//what is constructor
	Employee(){  //constructor - default constructor
		System.out.println("I am Default Constructor");
		empname = "Amudhavalli";//initialize
		empid = 13;
	}
	void Employeeinfo() {  //method
		System.out.println("Employee Name : " +empname);
		System.out.println("Employee Id : " +empid);
}
Employee(String name,int id){ //parameterized constructor
	empname =name;
	empid = id;
}
}

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("sure",1001);//parameter constructor
		//Employee e1 = new Employee();default constructor
        e1.Employeeinfo();
        
	}

}
/*//what is constructor?
//In java,every class has its constructor that is invoked automatically when object is created because class and constructor name are same	
//A constructor is similar to a method but in actual it is not method
//two rules for creating constructor
//1.constructor name must be same as name of the class
//2.A java constructor must not have a return type

if class does'nt have constructor the java compiler automatically creates a default constructor during run time

2 types:
	Default constructor -no arguments 
	parameterized constructor -with arguments
	*/
