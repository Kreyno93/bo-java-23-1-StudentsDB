package de.neuefische.model;

import java.util.Arrays;
import java.util.Random;

public class StudentDB {

    private Student[] students;


    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }


    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Arrays.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    public Student randomStudent() {
        Random random = new Random();
        return students[random.nextInt(students.length-1)];
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}
