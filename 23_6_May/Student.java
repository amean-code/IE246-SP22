public class Student {
    //attr'butes
    private int studentNumber;
    private String name;
    private double GPA;
    //constructor
    public Student(int number, String n,double grade){
        this.studentNumber=number;
        this.name=n;
        this.GPA=grade;
    }

    //behaviours
    public String getName(){
        return this.name;
    }

    public double getGPA(){
        return this.GPA;
    }



}
