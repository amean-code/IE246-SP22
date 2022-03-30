import java.util.ArrayList;
import java.util.Random;

// Question
// Q1 (50 pts) Create a Coin class, that has a public boolean member variable named isTail. 
// In the constructor that takes a Random object, randomly generate a coin outcome, by assigning false for isTail with probability 0.5,
// and true with probability 0.5. 
// Next, create a class that has the same name with your first name, and include a main method in that class. 

// I should be able to do the following to create a Coin object from the main method.

// Random random = new Random();

// Coin coin = new Coin(random);

// In the main method, create a set of Coin objects until there are a given number of tails, and store them in an arraylist. Finally, return the size of the arraylist. I should be able to do the following:

// int howManyNeeded = coin.untilTails(5); // howManyNeeded becomes how many coin tosses are needed until there are 5 tails.

public class RandomQuestion1 {

    public static void main(String[] args) {

        Random random = new Random();

        Coin coin = new Coin(random);

        // In the main method, create a set of Coin objects until there are a given number of tails, and store them in an arraylist. Finally, return the size of the arraylist. I should be able to do the following:


        int howManyNeeded = coin.untilTails(5); // howManyNeeded becomes how many coin tosses are needed until there are 5 tails.
        
    }
    
}

// Create a Coin class
class Coin{

    public boolean isTail; // true & false

    public Coin(Random rand){

        // Probablity 0.5
        if(rand.nextInt(100) < 50){ // 0 1 2 3 4 5 6 7 8 9
            // isTail true
            isTail = true;
        }else{
            // isTail false
            isTail = false;
        }

    }

    public int untilTails(int tailCount){

        // Define an Arraylist - items = Coin
        ArrayList<Coin> coins; // VARIABLE coins = 23423445;

        coins = new ArrayList<Coin>();

        boolean isThereEnoughTails = false;
        int numberOfTails = 0;

        // Until there is enough coins iterate it
        while(!isThereEnoughTails){

            // create a coin
            Coin newCoin = new Coin(new Random());
            coins.add(newCoin);

            // check if it is tail
            if(newCoin.isTail){
                numberOfTails ++;
            }

            // if there is enough tails
            if(numberOfTails == tailCount){
                isThereEnoughTails = true;
            }

        }


        // return the size of the arraylist
        return coins.size();

    }


}

class Emin{

    public static void main(String[] args) {

        Random random = new Random();

        Coin coin = new Coin(random);

        // In the main method, create a set of Coin objects until there are a given number of tails, and store them in an arraylist. Finally, return the size of the arraylist. I should be able to do the following:


        int howManyNeeded = coin.untilTails(5); // howManyNeeded becomes how many coin tosses are needed until there are 5 tails.
        
    }

}



