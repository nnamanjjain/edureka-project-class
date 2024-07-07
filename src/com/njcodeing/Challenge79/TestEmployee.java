package com.njcodeing.Challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee database\n");
        Employee emp=new Employee("Naman",30,60000);
        emp.setAge(29);
        emp.setSalary(25500.96);
        System.out.println("The details of Employee is:\n"+emp.displayEmployeeDetails());
    }
}
