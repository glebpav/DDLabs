package ru.mephi.lab1;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Student {

    private String name;
    private String group;
    private int course;
    private List<Integer> grades;

    public double getAverageGrade() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

}
