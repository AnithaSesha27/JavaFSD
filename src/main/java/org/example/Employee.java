package org.example;

// Parent Class
class Employee {

    int employeeId;
    String employeeName;
    double basicSalary;

    // Constructor
    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    // Display employee details
    void displayDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Basic Salary  : " + basicSalary);
    }

    // Method to calculate salary
    double calculateSalary() {
        return basicSalary;
    }
}