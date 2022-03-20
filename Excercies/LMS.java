package Excercies;

public class LMS {

    // Main
    public static void main(String[] args) {
        Student s1 = new Student();
        // name = Beril // id = S11111 // GPA = 4.0
        s1.name = "Beril";
        s1.studentID = "S11111";
        s1.GPA = 4.0;

        Student s2 = new Student();
        // name = Beril // id = S11111 // GPA = 4.0
        s2.name = "Ecesu";
        s2.studentID = "S222222";
        s2.GPA = 4.2;

        Student s3 = new Student();
        // name = Beril // id = S11111 // GPA = 4.0
        s3.name = "Mohammad";
        s3.studentID = "S33333";
        s3.GPA = 3.7;

        // s1.showID();
        // s2.showID();

        // Define Courses
        Course c1 = new Course("IE246",6,"Industrial Engineering Department");
        c1.showCourse();

        Course c2 = new Course("IE201",6,"Industrial Engineering Department");
        c2.showCourse();

        Course c3 = new Course("IE203",6,"Industrial Engineering Department");
        c3.showCourse();

        s3.courses[0] = c2;
        s3.showID(true);



    }
    
}

class Student{

    // CONSTANT
    int CREDIT_LIMIT = 30;
    int MAX_COURSE_COUNT = 10;

    // Attributes
    String name;
    String studentID;
    double GPA;
    int creditLimit = CREDIT_LIMIT;
    Course[] courses;

    // Constructor
    public Student(){
        this.courses = new Course[MAX_COURSE_COUNT];
    }

    // Behaviours
    public void showID(boolean showCourses){

        // Define a content string variable
        String content = "Student\n---------------------------------" + "\n"
        + "| Name : " + this.name + "\n"
        + "| Student ID : " + this.studentID + "\n"
        + "| GPA: " + this.GPA + "\n"
        + "---------------------------------";
        System.out.println(content);

        // Show courses
        if(showCourses){
            // Iterate all Courses
            for(int i = 0 ; i < this.courses.length ; i++){
                if(this.courses[i] != null){
                    this.courses[i].showCourse();
                }
            }
            
        }

        
    }



}

class Course{

    // Attributes
    int credit;
    String title;
    String department;
    Student[] students;

    // Constructor
    public Course(int credit){
        this.credit = credit;
    }

    public Course(String title,int credit,String department){
        this.title = title;
        this.credit = credit;
        this.department = department;
    }

    public Course(String title){
        this.title = title;
        this.credit = 6;
    }

    // Behavour
    public void showCourse(){

        // Define a content string variable
        String content = "Course\n---------------------------------" + "\n"
        + "| Title : " + this.title + "\n"
        + "| Department : " + this.department + "\n"
        + "| Credit: " + this.credit + "\n"
        + "---------------------------------";

        System.out.println(content);
    }

}

