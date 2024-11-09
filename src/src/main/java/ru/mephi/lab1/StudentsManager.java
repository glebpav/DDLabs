package ru.mephi.lab1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentsManager {

    private List<Student> students;

    public StudentsManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void promoteAndFilterStudents() {
        students = students.stream()
                .filter(student -> student.getAverageGrade() >= 3.0)
                .peek(student -> student.setCourse(student.getCourse() + 1))
                .toList();
    }

    public void printStudents(int course) {
        System.out.println("Students in course " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

}
