package com.tns.ifet.gettersetter;

public class Manager extends Employee {
	private int teamSize;

    public Manager(String name, int employeeId, double salary, int teamSize) {
        super(name, employeeId, salary);
        this.teamSize = teamSize;
    }
    public void display() {
    	super.display();
    	System.out.println("Team Size:"+teamSize);
    }

    // Getter and Setter for teamSize
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}


