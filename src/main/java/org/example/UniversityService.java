package org.example;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import lombok.experimental.UtilityClass;

import java.util.List;
import java.util.OptionalDouble;

@UtilityClass
@FieldDefaults(makeFinal = true, level = AccessLevel.PUBLIC)
public class UniversityService {
    /**
     * Calculates the average grade of all students in a course
     * @param course The course for which to calculate the average
     * @return OptionalDouble containing the average or empty if the course has no students
     */
    OptionalDouble calculateAverageGradeForCourse(Course course) {
        return course.getStudents().stream()
            .mapToInt(Student::getGrade)
            .average();
    }

    /**
     * Calculates the average grade across all students in the university
     * @param university The university to analyze
     * @return OptionalDouble containing the average grade or empty if no students exist
     */
    OptionalDouble calculateUniversityAverageGrade(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .distinct()
                .mapToInt(Student::getGrade)
                .average();
    }

    /**
     * Retrieves a list of students from the university who have a grade better than 2.
     *
     * @param university The university from which to retrieve students.
     * @return List of students with a grade less than or equal to 2, without duplicates.
     */
    List<Student> getStudentsBetterThan2(University university) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .distinct()
                .filter(student -> student.getGrade() <= 2)
                .toList();
    }

}
