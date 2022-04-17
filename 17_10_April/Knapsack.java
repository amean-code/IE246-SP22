import java.util.ArrayList;
import java.util.Random;

public class Knapsack {
    // boxes
    // size, value, name
    static Random rand;
    static ArrayList<Box> boxes = new ArrayList<>();
    // lets have a variable called capacity
    static int capacity = 50;
    static int count = 30;

    public static void main(String[] args) {
        // try to maximize value by finding the best boxes and taking them
        ArrayList<Box> temp=solve(capacity);
        double result = returnValue(temp);
        System.out.println(result);
        printToConsole(temp);

    }

    // lets create boxes with size //randomly generate values
    // lets give a box size between 1 and 10 and a value between 5 and 25
    public static void createRandomBoxes(int count) {

        rand = new Random();

        for (int i = 0; i < count; i++) {

            Box b = new Box(rand.nextInt(10) + 1, rand.nextInt(21) + 5, "BOX" + (i + 1));
            // lets put these boxes arraylist
            boxes.add(b);
            
        }

    }

    // lets solve the problem
    // this method returns the best boxes to take while not crossing the capacity
    // this method has a parameter called capacity
    public static ArrayList<Box> solve(int capacity) {
        // create the boxes
        createRandomBoxes(count);

        ArrayList<Box> copyBoxes = new ArrayList<>();
        ArrayList<Box> bestBoxes = new ArrayList<>();

        copyBoxes = boxes;
        // find the bext boxes
        // the bext box is with maximum value and smallest size// trying to maximize
        // value/size
        for (int j = 0; j < count; j++) {
            // lets take the first box
            Box tempBox = copyBoxes.get(0);
            // iterate through boxes
            for (int i = 1; i < copyBoxes.size(); i++) {
                // if is bigger than first boxxes values over size// change tempbox
                if (tempBox.value / tempBox.size < copyBoxes.get(i).value / copyBoxes.get(i).size) {
                    // change the tempBox's index
                    tempBox = copyBoxes.get(i);
                }
            }
            // check the capacity
            if (capacity >= tempBox.size) {
                // hold the tempBox value
                // put the tempbox to bestBox array
                bestBoxes.add(tempBox);
                //update the capacity
                capacity-=tempBox.size;
            } else {
                //return bestBoxes;
            }
            // remove the tempBox
            copyBoxes.remove(tempBox);

        }
        // put them in order while I still have capacity left
        return bestBoxes;
    }

    // to calculate value
    // create a method and take the arraylist of boxes as parameter and returns the sum of boxes' values
    public static double returnValue( ArrayList<Box> mikail) {
        //for (eleman x : array)
        double sum=0;
        //iterate over boxes
        for(Box x : mikail){
            sum+=x.value;
        }
        return sum;

    }

    //a method to print the boxes names to the console
    public static void printToConsole(ArrayList<Box> mikail) {
        //iterating over boxes
        for(Box x : mikail){
            //printing their names
            System.out.println(x.name+" "+x.size);
        }
    }
}

class Box {

    // attributes
    int size;
    double value;
    String name;

    // Random random;
    // constructor
    public Box(int s, double v, String n) {
        this.size = s;
        this.value = v;
        this.name = n;
        // random.setSeed(10);
    }

    // behaviours

}