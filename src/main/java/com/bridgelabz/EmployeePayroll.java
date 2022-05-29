package com.bridgelabz;

public class EmployeePayroll {
    private int id;
    private String name;
    private int salary;

    // compiler will keep this default constructor if user is not defining default constructor

    // always have a habit of taking a default constructor
    // if not when i try to access that EmployeePayroll it will give me an error because the default constructor is not present
    public EmployeePayroll() {
    }

    public EmployeePayroll(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeePayroll{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
