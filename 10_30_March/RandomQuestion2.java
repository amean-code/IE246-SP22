import java.util.Random;

// Question
// Q2 (50 pts) Provide a class named Die, that uses a Random object and has two methods: one that returns the outcome for a die roll, 
// and one that returns how many given values are observed among a given number of rolls. 
// I should be able to do the following: 

// Random random = new Random();

// Die die = new Die(random);

// int outcome = die.roll(); // outcome becomes 1,2,3,4,5, or 6.

// int count = die.experiment(5,10000) // count becomes how many 5's are observed among 10000 die rolls.

public class RandomQuestion2 {

    public static void main(String[] args) {


        Random random = new Random();

        Die die = new Die(random);

        int outcome = die.roll(); // outcome becomes 1,2,3,4,5, or 6.

        int count = die.experiment(5,10000); // count becomes how many 5's are observed among 10000 die rolls.

        System.out.println("Outcome: " + outcome);
        System.out.println("Count: " + count);
        System.out.println("Expected Count: "+ (10000.0 * (1.0/6.0)));
        
    }
    
}

class Die{

    Random rand;

    public Die(Random random){

        this.rand = random;

    }

    public int roll(){

        int randNumber = rand.nextInt(6) + 1; //  ( 0 1 2 3 4 5 ) + 1

        // Return outcome
        return randNumber;
    }

    public int experiment(int value, int rollCount){

        // initialize
        int expCount = 0;

        // roll rollCount times
        for(int i = 0 ; i < rollCount ; i++){

            int newOutput = roll();

            // check if it's value
            if(newOutput == value){
                expCount ++;
            }

        }

        return expCount;

    }


}
