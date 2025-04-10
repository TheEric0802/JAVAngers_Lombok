package org.example;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
