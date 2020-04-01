package main;
/**
 * 
 * @author Dillon
 * A design pattern is used as a composite pattern to make a whole group of objects to be the same. That group of objects is the students and they are treated 
 * respectively the same. This program sorts the students and takes from a list of students from all 4 years of college (excluding graduates students) and sorts the new students by
 * printing them off in the console. 
 */
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name; //creating the class students using the strings name, year and major to define a student
    private String year;
    private String major;
    private List<Student> Classmates; // has a list of students, students will be used as a single object.
    
    public Student(String name, String year, String major) {
        this.name = name;   
        this.year = year;
        this.major = major;
        Classmates = new ArrayList<Student>();
    }
    
    public void addClassmate(Student student) { //add classmates for a student
        Classmates.add(student);
    }
    
    public void removeClassmate(Student student) { //remove classmates if we need to from the list
        Classmates.remove(student);
    }
    
    public List<Student> getClassmates() { //retrieves list. 
        return Classmates;
    }
    
    public String toString() { // prints out a students name, year, and major they are in. 
        return "Student's Name: " + name + " | Year: " + year + " | Major: "
             + major;
    }
}