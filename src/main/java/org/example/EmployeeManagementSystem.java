package org.example;

// Main Class
public class EmployeeManagementSystem {

    public static void main(String[] args) {

        // Create Manager object
        Manager manager = new Manager(101, "Rahul", 60000, 12000);

        // Create Developer object
        Developer developer = new Developer(102, "Priya", 50000, 8000);

        System.out.println("----------- Manager Details -----------");
        manager.displayDetails();

        System.out.println("\n----------- Developer Details -----------");
        developer.displayDetails();
    }
}