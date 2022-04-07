package Quiz;

import java.util.Random;

public class QUIZ3 {

    //(10 pts) Provide a class named Die, that takes a Random object, the number of faces in a die, and a seed number in its constructor. 
    //Depending on the number of faces, the possible outcomes change, but they always start from 1 with increments of one: for example in a 10 face die, the outcomes can be 1,2,3,4,5,6,7,8,9,10. For a 5 face die, the outcomes can be 1,2,3,4,5. The seed number sent to the constructor should be the random number generator seed number.

    //The Die class should have a method that returns the outcome for a die roll,
    // and one that returns how many rolls are required to observe a specific number on the die face. 
    // The number is assumed to be a number that exists on the faces of the die, 
    // so you do not need to specifically check if it is among the possible outcomes. I should be able to do the following: 

    //Random random = new Random();

    //int numberOfFaces = 10; 

    //int seedNumber = 13;

    //Die die = new Die(random, numberOfFaces, seedNumber);

    //int outcome = die.roll(); // outcome becomes 1,2,3,4,5,6,7,8,9, or 10 if the number of faces is 10

    // int rollNo = die.noOfRollsUntil(6); // count how many rolls were required until the outcome 6 appears. 
    // Checking if 6 is on one of the die faces is not necessary, we assume the input will always be one of the outcomes of the die.

    //Important Note: You "have to" use your roll method inside your noOfRollsUntil method.

    public static void main(String[] args) {
         Random random = new Random();

        int numberOfFaces = 10; 

        int seedNumber = 13;

        Die die = new Die(random, numberOfFaces, seedNumber);

        int outcome = die.roll(); // outcome becomes 1,2,3,4,5,6,7,8,9, or 10 if the number of faces is 10

        int rollNo = die.noOfRollsUntil(6); // count ho
    }
    
}

class Die{

    // Keep attributes
    Random random;
    int numberOfFaces;
    int seedNumber;

    // Constructor
    public Die(Random random,int numberOfFaces,int seedNumber){

        this.random = random;
        this.numberOfFaces = numberOfFaces;
        this.seedNumber = seedNumber;
        // set seed of the random object
        this.random.setSeed(this.seedNumber);

    }

    // Roll method
    public int roll(){
        // return starting from 1 to number of faces
        // 1 2 .... numberOfFaces
        return random.nextInt(this.numberOfFaces) + 1;

    }

    public int noOfRollsUntil(int targetNumer){
        // init count as 1
        // minimum 1 count is required
        int count = 1;

        // roll until getting target number
        while(targetNumer == this.roll()){
            // count the rolls
            count++;
        }
        // return the rolls
        return count;
    }

}