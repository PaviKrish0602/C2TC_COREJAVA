package com.tns.ifet.gettersetter;

public class Employee {
		    private String name;
		    private int employeeId;
		    private double salary;

		    public Employee(String name, int employeeId, double salary) {
		        this.name = name;
		        this.employeeId = employeeId;
		        this.salary = salary;
		    }
		        public void display() {
		        System.out.println("Name:" +name+ ", ID: "+employeeId+ ", Salary:"+salary);
		    }

		    // Getter and Setter for name
		    public String getName() {
		        return name;
		    }

		    public void setName(String name) {
		        this.name = name;
		    }

		    // Getter and Setter for employeeId
		    public int getEmployeeId() {
		        return employeeId;
		    }

		    public void setEmployeeId(int employeeId) {
		        this.employeeId = employeeId;
		    }

		    // Getter and Setter for salary
		    public double getSalary() {
		        return salary;
		    }
		    public void setSalary(double salary) {
		        this.salary = salary;
		    }
}

		    
