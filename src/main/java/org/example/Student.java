package org.example;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Student {
    private String id;
    private String name;
    private String address;
    private int grade;
}
