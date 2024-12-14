package com.tns.ifet.gettersetter;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating a Manager object
		//Employee emp=new Employee("Pavi",1002,67000);
        Manager manager = new Manager("Alice", 101, 75000, 10);
        Developer developer = new Developer("Bob", 102, 60000, "Java");
        System.out.println("Manager Details:");
        manager.display();
        System.out.println("Annual Salary: " + EmployeeSalary.calculateAnnualSalary(manager));

        System.out.println("\nDeveloper Details:");
        developer.display();
        System.out.println("Annual Salary: " + EmployeeSalary.calculateAnnualSalary(developer));


	}

}
