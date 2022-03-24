package Quiz;

public class QUIZ2 {

    //You cannot use scanner. You cannot import any packages before the main method.

    //(10 pts) Write a method named divisible that takes an integer array (say anArray) and an integer (say d), 
    //and prints out the elements in anArray that are divisible by d.

    //Make sure the original input variables are not altered/changed.

    //If anArray=[3 4 6] and d=2, the method should print out 4 6.

    public static void main(String[] args) {
        // input array
        int[] anArray = {3,4,6};
        int d = 2;

        divisible( anArray, d);

    }

    // divisible method
    public static void divisible(int[] anArray, int d){

        // iterate the elements
        for(int i = 0 ; i < anArray.length ; i++){
            // check if divisible by d
            if(anArray[i] % d == 0){
                // print if true
                System.out.print(anArray[i]+ " ");
            }   

        }

    }


    
}
