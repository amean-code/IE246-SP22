import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

// lets read the csv file and create car objects with them
public class Main{

    static String fName="cars.csv";
    static ArrayList <Car> cars;

    public static void main(String[] args) {
        int [][] temp = readFromCSV(fName);

        Car car = new Car(temp[0][0],temp[1][0], temp[2][0]);
        //Car thirdcar= new Car(temp[0][3],temp[1][3], temp[2][3]);
        // System.out.println("Price "+car.getPrice()+"\nComfort "+car.getComfort()+"\nPerf: "+car.getPerformance());

         //I need to create an arraylist and put the cars inside
        cars = new ArrayList <Car>();

        //create car objects using the temp array
        for (int index = 0; index < temp[0].length; index++) {
            Car tempCar = new Car(temp[0][index],temp[1][index], temp[2][index]);
            //add the cars to the arraylist
            cars.add(tempCar);
        }

        for (Car x : solveKnapsack(250000, cars)) {
            System.out.println("Best Car to buy: "+x.getPrice());
        }
        //Print the car's price to the console from the bestCar() method, 
        //System.out.println(car.bestCar(cars).getPrice());

        // {{60000,   70000,   67000,   75000},
        //  {   7   ,   4   ,   3   ,   6.5 },
        //  {   7   ,   9   ,   8   ,   8.6 }}



        // //to see if our method works
        // for (int[] row : temp) {
        //     for (int value : row) {
        //         System.out.println(value);
        //     }  
        //     System.out.println(); 
        // }
    }

    //we need a method to solve the knapsack problem
    //create a method called solveKnapsack which takes a parameter money (capacity)
    //and returns the best cars to buy with our money
    static ArrayList <Car> temp = new ArrayList <Car>();
    public static ArrayList<Car> solveKnapsack(int money,  ArrayList <Car> cars){
        ArrayList <Car> copyOfCar = cars;
        Car x=new Car(0,0,0);
        while (money>=0 && !copyOfCar.isEmpty()) {
        //im gonna call bestcar method to fidn the best car
            x=x.bestCar(copyOfCar);
            if (money>x.getPrice()) {
            //an put it into my return list
                temp.add(x);
            //then im gonna extract the best car 
                copyOfCar.remove(x);
            //update our money 
                money-=x.getPrice();
            //and im gonna call bestcar again
                
            }else{
              //remove the car that I cant afford  
                copyOfCar.remove(x);
            }
       
        }
    return temp;
    }




    //lets create method to read our csv file
    //and return its components as an 2D Array
    public static int [][] readFromCSV(String fileName){
        //file
        //filereader
        //bufferedreader
        //create an int array to return
        int [][] values=null;
        try {

        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        //reading the first line
        String temp =br.readLine();
        String [] x = temp.split(";");
        //initializing our array
        values=new int[3][x.length-1];
        //creating an index to switch between lines
        int index=0;
        while(temp!=null){
            //reading the next line
            temp=br.readLine();
            //putting the variables inside
            String [] tempArray = temp.split(";");
            //I need to iterate temparray and parseint values to put in in values array
            for(int i=0;i<tempArray.length;i++){
                //I need to update the value every time while iterates
                values[index][i]=Integer.parseInt(tempArray[i]);
            }
            index++;
        }
        //closing the readers is a must!!
        //else the program wont work
        br.close();
        fr.close();

            
        } catch (Exception e) {
            System.out.println("An error occured.");
        }
        

        
        return values;
    }

    //create a method named moreValue which takes two Car objects and returns 
    //the car who has a higher performance/price ratio.
    public Car moreValue(Car a,Car b){
        if (a.getPerformance()/a.getPrice()>b.getPerformance()/b.getPrice()) {
            return a;
        }else{
            return b;
        }
    }
    

}