package org.example;

class Student {

    int studentId;
    String studentName;
    String department;
    double marks;

    // Parameterized Constructor
    Student(int studentId, String studentName, String department, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.marks = marks;
    }

    // Display student details
    void displayStudent() {
        System.out.println("ID         : " + studentId);
        System.out.println("Name       : " + studentName);
        System.out.println("Department : " + department);
        System.out.println("Marks      : " + marks);
        System.out.println();
    }

    // Return marks
    double getMarks() {
        return marks;
    }

    // Return Student ID
    int getStudentId() {
        return studentId;
    }
}
