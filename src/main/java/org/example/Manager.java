package org.example;

// Child Class - Manager
class Manager extends Employee {

    double hra;

    // Constructor
    Manager(int employeeId, String employeeName, double basicSalary, double hra) {
        super(employeeId, employeeName, basicSalary);
        this.hra = hra;
    }

    // Method Overriding
    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("HRA           : " + hra);
        System.out.println("Total Salary  : " + calculateSalary());
    }
}
