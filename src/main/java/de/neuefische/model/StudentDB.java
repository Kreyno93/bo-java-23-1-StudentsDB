package de.neuefische.model;

import java.rmi.NoSuchObjectException;
import java.util.*;

public class StudentDB {

    private Map<Integer,Student> studentList = new HashMap<>();


    public StudentDB(Map<Integer, Student> studentList) {
        this.studentList = studentList;
    }

    public Map<Integer, Student> getStudentList() {
        return studentList;
    }

    public Student getStudentById(int id){
        if(studentList.containsKey(id)){
            return studentList.get(id);
        }
        throw new StudentNotFoundException("Student with id " + id + " not found");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Objects.equals(studentList, studentDB.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentList);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentList=" + studentList +
                '}';
    }

    public void addStudent(Student student){
        studentList.put(student.getId(),student);
    }


}
