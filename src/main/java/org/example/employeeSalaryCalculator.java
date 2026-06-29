package org.example;

import java.util.Scanner;

public class employeeSalaryCalculator {

    // Method to calculate HRA
    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.20;
    }

    // Method to calculate DA
    public static double calculateDA(double basicSalary) {
        return basicSalary * 0.15;
    }

    // Method to calculate Gross Salary
    public static double calculateGrossSalary(double basicSalary, double hra, double da) {
        return basicSalary + hra + da;
    }

    // Method to display employee details
    public static void displayEmployeeDetails(int empId, String empName,
                                              double basicSalary, double hra,
                                              double da, double grossSalary) {

        System.out.println("\nEmployee Salary Report");
        System.out.println("----------------------");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept user input
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Calculate salary components
        double hra = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double grossSalary = calculateGrossSalary(basicSalary, hra, da);

        // Display employee details
        displayEmployeeDetails(empId, empName, basicSalary, hra, da, grossSalary);

        sc.close();
    }
}