package de.neuefische;


import de.neuefische.model.*;

import java.rmi.NoSuchObjectException;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        Student computerScienceStudent1 = new ComputerScienceStudent("Nerd",11,true);
        Student computerScienceStudent2 = new ComputerScienceStudent("Nerd2",34,true);
        Student biologyStudent = new BiologyStudent("Nerd3",66,true);

        Map<Integer,Student> students = new HashMap<>(Map.of(
                computerScienceStudent1.getId(),computerScienceStudent1,
                computerScienceStudent2.getId(),computerScienceStudent2,
                biologyStudent.getId(),biologyStudent
        ));
        StudentDB studentDB = new StudentDB(students);

        Student studentToAdd = new BiologyStudent("Nerd4",77,true);
        studentDB.addStudent(studentToAdd);

        try{
            Student student = studentDB.getStudentById(1);
            System.out.println(student);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(studentDB.getStudentList());
        System.out.println("Ich habs bis hier hin geschafft!! =^-^=");





    }
}
