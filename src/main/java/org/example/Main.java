package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // Create students
        Student student1 = new Student("S1", "Max Mustermann", "Musterstraße 1", 1);
        Student student2 = new Student("S2", "Erika Musterfrau", "Beispielweg 2", 2);
        Student student3 = new Student("S3", "John Doe", "Main Street 3", 1);

        // Create teachers
        Teacher mathTeacher = new Teacher("T1", "Dr. Schmidt", "Mathematics");
        Teacher physicsTeacher = new Teacher("T2", "Prof. Müller", "Physics");

    }
}