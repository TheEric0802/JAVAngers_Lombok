package org.example;

import lombok.Value;
import lombok.Builder;
import lombok.With;
import java.util.List;

@Value
@Builder
@With
public class Course {
    String id;
    String name;
    Teacher teacher;
    List<Student> students;
}
