package ArrayLists_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExamples {

    public static void main(String[] args) {
        
        // Define 2 students in ArrayList

        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Emin","S014877"));
        students.add(new Student("Ada","S063322"));
        students.add(new Student("Mohammad","S02342233"));
        students.add(new Student("Beril","S034634423"));

        // Hash Maps (key -> value)
        // key -> studentID
        // value -> Student
        HashMap<String,Student> id2student; // default value is NULL

        id2student = new HashMap<String,Student>();

        // Add students
        id2student.put("S014877", students.get(0));
        id2student.put("S063322", students.get(1));
        id2student.put("S02342233", students.get(2));
        id2student.put("S034634423", students.get(2));

        // get the student by only checking the id
        String randomID = "S014877";
        id2student.get(randomID).introduceYourself();;

    }
    
}

class Student{

    // Atributes
    String studentID;
    String name;
    ArrayList<Student> friends;

    // Constructor
    public Student(String n,String ID){

        this.name = n;
        this.studentID = ID;
        this.friends = new ArrayList<Student>();

    }


    // Behaviour
    public void introduceYourself(){

        String content = "My name is " + this.name + ", and my student id is " + this.studentID;
        System.out.println(content);

    }


}
