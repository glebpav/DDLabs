package ru.mephi.lab1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        StudentsManager studentsManager = new StudentsManager();

        studentsManager.addStudent(Student.builder()
                .name("Dima Mihalich")
                .group("S22-501")
                .course(3)
                .grades(List.of(5, 5, 5))
                .build());

        studentsManager.addStudent(Student.builder()
                .name("Ivan Dmitrich")
                .group("B24-101")
                .course(1)
                .grades(List.of(2, 3, 2))
                .build());

        studentsManager.addStudent(Student.builder()
                .name("Nikita Pavlovich")
                .group("S22-501")
                .course(3)
                .grades(List.of(3, 4, 4))
                .build());

        studentsManager.addStudent(Student.builder()
                .name("Feophan Glebovich")
                .group("B00-501")
                .course(24)
                .grades(List.of(5, 5, 5))
                .build());

        studentsManager.promoteAndFilterStudents();

        studentsManager.printStudents(1);
        studentsManager.printStudents(2);
        studentsManager.printStudents(3);
        studentsManager.printStudents(4);
    }

}
