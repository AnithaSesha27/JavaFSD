package org.example;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        // Accept student details
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(id, name, dept, marks);
        }

        // Display all students
        System.out.println("\n----------- Student Records -----------\n");

        for (Student s : students) {
            s.displayStudent();
        }

        // Find highest scorer
        Student highest = students[0];
        double total = 0;

        for (Student s : students) {
            total += s.getMarks();

            if (s.getMarks() > highest.getMarks()) {
                highest = s;
            }
        }

        // Average marks
        double average = total / n;

        System.out.println("----------------------------------------");

        System.out.println("\nHighest Scorer");
        System.out.println("---------------");
        System.out.println("Name  : " + highest.studentName);
        System.out.println("Marks : " + highest.getMarks());

        System.out.println("\nAverage Marks : " + average);

        // Search by Student ID
        System.out.print("\nEnter Student ID to search: ");
        int searchId = sc.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.getStudentId() == searchId) {

                System.out.println("\nSearch Result");
                System.out.println("-------------");
                System.out.println("Student Found\n");

                s.displayStudent();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nSearch Result");
            System.out.println("-------------");
            System.out.println("Student Not Found");
        }

        sc.close();
    }
}
