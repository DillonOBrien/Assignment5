package main;
/**
 * 
 * @author Dillon
 * A design pattern is used as a composite pattern to make a whole group of objects to be the same. That group of objects is the students and they are treated 
 * respectively the same. This program sorts the students and takes from a list of students from all 4 years of college (excluding graduates students) and sorts the new students by
 * printing them off in the console. A sophomore is added since he shares the same
 */
public class studentDesignPattern {
    public static void main(String[] args) { //creating the students added to the list. 
        Student student1 = new Student(" Tatyana Macaraeg ", "Freshman", "Computer Science");
        Student student2 = new Student(" Dale Seyal ", "Sophomore", "Computer Science");
        Student student3 = new Student(" Walton Ruoff ", "Junior", "Mathematics");
        Student student4 = new Student(" Armand Lorenz ", "Senior", "Physics");
        Student student5 = new Student(" Jeremy Khan", "Junior", "English");
        Student student6 = new Student(" Lindy Haubert ", "Freshman", "Philosphy");
        Student student7 = new Student(" Starla Winner ", "Senior", "Art");
        Student student8 = new Student(" Torri Seitz ", "Senior", "Science");
        Student student9 = new Student(" Erick Amaral ", "Freshman", "Engineering");
        Student student10 = new Student(" Anton Cowden ", "Sophomore", "Political Science");
 
        student1.addClassmate(student6); //putting each student into their respective classes and year that they are in
        student1.addClassmate(student9);
        student1.addClassmate(student2); //a sophomore is added due to sharing the same major as student 1 and also to display other classmates how they are connected. 
        
        student2.addClassmate(student10); //Sophomore class
        
        student3.addClassmate(student5); // Junior year

        student4.addClassmate(student7); // Senior year
        student4.addClassmate(student8);

        System.out.println(student1); //prints out all the freshman in the list or new students. 
        for (Student newStudent : student1.getClassmates()) {
            System.out.println(newStudent);
            
            for(Student student : newStudent.getClassmates()) { // this will also print out students that are classmates with one another
                System.out.println(student);
            }
        }
    }
}