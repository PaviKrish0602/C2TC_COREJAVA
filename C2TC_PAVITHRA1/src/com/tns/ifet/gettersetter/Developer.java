package com.tns.ifet.gettersetter;

public class Developer extends Employee {
	 private String programmingLanguage;

	    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
	        super(name, employeeId, salary);
	        this.programmingLanguage = programmingLanguage;
	    }
public void display() {
	super.display();
	System.out.println("Programming Language:" +programmingLanguage);
}
	    public String getProgrammingLanguage() {
	        return programmingLanguage;
	    }

	    public void setProgrammingLanguage(String programmingLanguage) {
	        this.programmingLanguage = programmingLanguage;
}
}

