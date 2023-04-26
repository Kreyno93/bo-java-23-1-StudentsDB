package de.neuefische.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class StudentDBTest {

    Student student1 = new Student("Test1",22);
    Student student2 = new Student("Test2",23);
    Student[] students = {student1,student2};
    Student[] students2 = {student1,student2};
    StudentDB studentDb = new StudentDB(students);


    @Test
    void whenGetAllStudents_returnArrayOfStudents() {
        Student[] actual = studentDb.getStudents();
        Assertions.assertEquals(students,actual);
    }

    @Test
    void getCorrectString_whenCallingToStringMethod(){

        String actual = student2.toString();
        String expected = "Student{name='Test2', id=23, Address='TestAddress2', identityCardNumer=14}";

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void isHashCodeEquals_returnsCorrectHashcode(){
        int expected = students.hashCode();
        int actual = studentDb.getStudents().hashCode();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void ArrayListEquals(){
        List<Student> studentList = List.of(student1,student2);
        Assertions.assertEquals(studentDb,studentList);
    }



}