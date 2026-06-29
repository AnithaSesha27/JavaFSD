package org.example;

// Child Class - Developer
class Developer extends Employee {

    double projectAllowance;

    // Constructor
    Developer(int employeeId, String employeeName, double basicSalary, double projectAllowance) {
        super(employeeId, employeeName, basicSalary);
        this.projectAllowance = projectAllowance;
    }

    // Method Overriding
    @Override
    double calculateSalary() {
        return basicSalary + projectAllowance;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Project Allowance : " + projectAllowance);
        System.out.println("Total Salary      : " + calculateSalary());
    }
}
