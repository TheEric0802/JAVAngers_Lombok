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

        // Create Students with builder
        Student student4 = Student.builder()
                .id("S4")
                .name("Anna Schmidt")
                .address("Parkallee 4")
                .grade(2)
                .build();

        Student student5 = Student.builder()
                .id("S5")
                .name("Lara Musterfrau")
                .address("Hauptstraße 5")
                .grade(1)
                .build();

        // Create Teacher with builder
        Teacher chemistryTeacher = Teacher.builder()
                .id("T3")
                .name("Dr. Weber")
                .subject("Chemistry")
                .build();

        // Create Course with builder
        Course chemistryCourse = Course.builder()
                .id("C301")
                .name("Organic Chemistry")
                .teacher(chemistryTeacher)
                .students(List.of(student2, student4))
                .build();

        // Print some information
        System.out.println("\nNew Chemistry Course: " + chemistryCourse);

        // Update teacher with @with
        chemistryTeacher = chemistryTeacher.withSubject("Organic Chemistry");

        // Update course with @with
        chemistryCourse = chemistryCourse.withTeacher(chemistryTeacher);

        // Print some information
        System.out.println("\nUpdated Chemistry Course: " + chemistryCourse);

        // University examples
        University university = University.builder()
            .id("U1")
            .name("Technical University")
            .courses(List.of(mathCourse, physicsCourse, chemistryCourse))
            .build();

        System.out.println("\nUniversity: " + university);

        // Create university and add courses
        University university2 = new University("U2", "Example University", List.of(mathCourse, physicsCourse));
        
        // Example calls for UniversityService methods
        System.out.println("\nAverage grades:");
        
        // Calculate average grade for math course
        UniversityService.calculateAverageGradeForCourse(mathCourse)
            .ifPresentOrElse(
                avg -> System.out.println("Math course average grade: " + avg),
                () -> System.out.println("Math course has no students")
            );
            
        // Calculate university-wide average grade
        UniversityService.calculateUniversityAverageGrade(university2)
            .ifPresentOrElse(
                avg -> System.out.println("University-wide average grade: " + avg),
                () -> System.out.println("University has no students")
            );

        System.out.println(UniversityService.getStudentsBetterThan2(university2));
    }
}