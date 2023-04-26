package de.neuefische;


import de.neuefische.model.BiologyStudent;
import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.Student;
import de.neuefische.model.StudentDB;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Max",22);
        Student student2 = new Student("Moritz",25);

        Student[] students = {student1,student2};


        StudentDB studentDB = new StudentDB(students);

        Student computerScienceStudent = new ComputerScienceStudent("Nerd",11,true);
        ComputerScienceStudent computerScienceStudent1 = new ComputerScienceStudent("Nerd2",34,true);
        BiologyStudent biologyStudent = new BiologyStudent("Nerd3",66,true);



    }
}
