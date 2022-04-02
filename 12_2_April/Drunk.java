import java.util.ArrayList;
import java.util.Random;

//I want to create a drunk man who has a parameter of much drunk he is (percentage)
// and who has a function called walk which randomly steps between (0 to 10) and has a random parameter
//create an arraylist called index and fill it with -50 and 50
//lets create someth'ng called drunkIndex to see our mans index
//create a method simulate(10) and make the program simulate until the index of the drunk man is 10

public class Drunk{

    //attributes
    public String name;
    private int drunkPerc;
    private ArrayList <Integer> indexArray = new ArrayList<Integer>();
    private int index;
    private int steps;
    //constructor
    public Drunk(int dP,String n){
        this.drunkPerc=dP;
        this.name=n;
    }
    //behaviours
    //lets populate our array
    public void populateArrayList(){
        //iterate between -50 and 50 and fill the arraylist
        for (int i = -200; i <= 200; i++) {
            //lets fill our indexes
            this.indexArray.add(i);
        }
    }

    public void walk(Random x){
        //if the drunk percentage is higher than fifty percent takes steps of 5-10,
        if (this.drunkPerc>50) {
            this.steps=x.nextInt(6)+5;
             //if its lower than fifty take steps of 1 to 5
        }else{
            this.steps=x.nextInt(5)+1;
        }
       
        //lets randomize the adding and substracting part
        // I want to create a random value between 0 and 1
        // and if its bigger than 0.5 then make the steps positive 
        //if its smaller make the steps negative
        double number =x.nextDouble();

        if (number>0.5) {
            //lets update our index, increment it by steps
            this.index+=this.steps;
        }else{
             //lets update our index, decrement it by steps count
             this.index-=this.steps;
        }
    }
    //to see our index
    public int getIndex(){
       return this.index;
    }
    //lets randomize our first index
    public void randomizeIndex(Random x){
        //I need a random value between -50 to 50
        this.index=indexArray.get(x.nextInt(101));
        
       
    }
    
}