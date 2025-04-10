package org.example;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class Course {
    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
