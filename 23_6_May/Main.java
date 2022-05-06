import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Main{

    static ArrayList<Student> students = new ArrayList<Student>();
    static HashMap<Student,Boolean> carStudent = new HashMap<>();
    public static void main(String[] args) {
        //crate 30 students and hold them in arraylist
        //I want my grade to be between 1.5 and 4, lets randomize it
        Random rand = new Random();
        //as a note
        //nextInt(x) returns an integer between 0 and x (x is not included)
        //nextDouble() returns a value between 0 and 1  
        //2.5* nextDouble() between 0 and 2.5
        
        for (int i = 0; i < 30; i++) {
            double grade = (2.5 * rand.nextDouble())+1.5;
            Student temp = new Student(i+1,"STUDENT "+(i+1), grade);
            students.add(temp);
            //if grade is lower than 2.0 the student has a car
            boolean car = false;
            if (grade<=2.0) {
                car=true;
            }
            carStudent.put(temp, car);
        }

        print();

        //lets determine if our student has a car and hold the boolean value; HashMap 

    }
    //lets create a method to print the students to the console
    public static void print() {
        // for (Student student : students) {
        //     //I want to reach the name but I dont want someone to be able to change its value
        //     System.out.println(student.getName() + " " +student.getGPA());
        // }    
        // <Key,Value>
        for (Student student : carStudent.keySet()) {
            //lets find out if the student has a car
            System.out.println(student.getName() + " " + carStudent.get(student));
        }   
        //  student 1 ,true
        //  student 2 ,true
        //  student 3 ,false

    }
}