package de.neuefische.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentDBTest {

    Student student1 = new Student("Test1",22);
    Student student2 = new Student("Test2",23);

    Map<Integer,Student> students = Map.of(
            student1.getId(),student1,
            student2.getId(),student2
    );
    StudentDB studentDb = new StudentDB(students);


    @Test
    void whenGetAllStudents_returnArrayListOfStudents() {
        Map<Integer,Student> expected = Map.of(
                student1.getId(),student1,
                student2.getId(),student2
        );
        Map<Integer,Student> actual = studentDb.getStudentList();
        assertEquals(expected,actual);
    }

    @Test
    void getCorrectString_whenCallingToStringMethod(){

        String actual = student2.toString();
        String expected = "Student{name='Test2', id=23}";

        assertEquals(expected,actual);
    }

    @Test
    void whenGetStudentById_returnStudent() {
        Student expected = student1;
        Student actual = studentDb.getStudentById(22);
        assertEquals(expected,actual);
    }

    @Test
    void whenGetStudentById_throwException() {
        Assertions.assertThrows(StudentNotFoundException.class, () -> {
            studentDb.getStudentById(24);
        });
    }

    @Test
    void whenGetStudentById_throwException_withTryAndCatch() {
        try{
            studentDb.getStudentById(24);
            Assertions.fail();
        } catch (StudentNotFoundException e){
            assertEquals("Student with id 24 not found",e.getMessage());
        };
    }

}