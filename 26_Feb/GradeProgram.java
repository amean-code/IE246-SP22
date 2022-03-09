import java.util.Scanner;

public class GradeProgram{
    
    //creating an array to hold 3 exams grades
    // 0 -> Mid1
    // 1 -> Mid2
    // 2 -> Final
    static int[] grades = new int[3];

    public static void takeInputs() {
        Scanner input = new Scanner(System.in);
        try {
            do {

                System.out.println("Enter your midterm 1 grade:");
                grades[0]=input.nextInt();
                
            } while (!checkFeasible(grades[0]));

            do {
                System.out.println("Enter your midterm 2 grade:");
                grades[1]=input.nextInt();
                
            } while (!checkFeasible(grades[1]));
            do {
                System.out.println("Enter your midterm 3 grade:");
                grades[2]=input.nextInt();
                
            } while (!checkFeasible(grades[2]));
            
        } catch (Exception e) {
           System.out.println("An error occured, Please try again.");
           takeInputs();
           
        }

    }

    public static void main(String[] args) {
        takeInputs();
        seeGrades();
       
    }

    public static char letterGrade(double average) {
        
        char letter;

        if (average>=90) {
            letter = 'A';
        } else  if (average>=80) {
            letter = 'B';
        } else  if (average>=70) {
            letter = 'C';
        } else  if (average>=60) {
            letter = 'D';
        } else {
            letter = 'F';
        }
        return letter;
    }

    public static double calculateAverage() {
        return (grades[0]+grades[1]+grades[2])/3.0;
        
    }

    public static void seeGrades() {
        int count = 1;
        String output = "";
        for (int x : grades ) {

            output += "Grade "+ count +" is: " + x + "\n";
            count++;
        }
        output += "The Average is : "+calculateAverage() + "\n";
        output += "The Letter Grade is: "+letterGrade(calculateAverage()) + "\n";

        System.out.println(output);
    }

    public static boolean checkFeasible(int grade) {
        if (grade > 100) {
            System.out.println("Grade Cannot Exceed 100!");
            return false;
        }
        if (grade <0) {
            System.out.println("Grade Cannot be below 0!");
            return false;
        }
        return true;
    }

    

}