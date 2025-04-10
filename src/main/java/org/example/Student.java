package org.example;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@Builder
public class Student {
    private String id;
    private String name;
    private String address;
    private int grade;
}
