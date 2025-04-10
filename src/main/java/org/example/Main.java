package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S1", "Max Mustermann", "Musterstraße 1", 1);
        Student student2 = new Student("S2", "Erika Musterfrau", "Beispielweg 2", 2);
        Student student3 = new Student("S3", "John Doe", "Main Street 3", 1);

        // Create teachers
        Teacher mathTeacher = new Teacher("T1", "Dr. Schmidt", "Mathematics");
        Teacher physicsTeacher = new Teacher("T2", "Prof. Müller", "Physics");

        // Create courses
        Course mathCourse = new Course(
            "M101", 
            "Advanced Mathematics", 
            mathTeacher, 
            List.of(student1, student2)
        );

        Course physicsCourse = new Course(
            "P201",
            "Quantum Physics",
            physicsTeacher,
            List.of(student1, student3)
        );

        // Print some information
        System.out.println("Math Course: " + mathCourse);
        System.out.println("Physics Course: " + physicsCourse);

        // Access some data
        System.out.println("\nStudents in Math course:");
        mathCourse.getStudents().forEach(student -> 
            System.out.println(" - " + student.getName())
        );
    }
}