package com.bridgelabz;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID, Name and Salary: ");
        int id = input.nextInt();
        String name = input.next();
        int salary = input.nextInt();
        EmployeePayroll employeePayroll = new EmployeePayroll(id, name, salary);
        System.out.println(employeePayroll.getId());
        System.out.println(employeePayroll.getName());
        System.out.println(employeePayroll.getSalary());
    }
}
