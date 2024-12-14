package com.tns.ifet.gettersetter;

public class EmployeeSalary {
    public static double calculateAnnualSalary(Employee employee) {
        return employee.getSalary() * 12;
    }

}
