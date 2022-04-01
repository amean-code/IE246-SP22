import java.util.Random;

public class Die {

    //attributes
    int value;
    Random y;
    //what is the attributes of a Dice
    //constructor
    public Die(Random x){
        this.y=x;
    }
    //behaviours
    //create a behavoiours called roll
    public int roll(){
        this.value = y.nextInt(6)+1;
        return value;
    }

    //we need an experiment method
    public int experiment(int goal,int numOfExp){
        // I need to iterate numOfExp times
        // make the count go up if the outcome of my roll is == goal
        return 0;
    }
    public static void main(String[] args) {
        Random x  = new Random();
        Die die = new Die(x);
        
        int outcome = die.roll(); // outcome becomes 1,2,3,4,5, or 6.

        int count = die.experiment(5,10000);x // count becomes how many 5's are observed among 10000 die rolls.
    }
}
