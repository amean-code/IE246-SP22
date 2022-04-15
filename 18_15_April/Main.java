import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

// lets read the csv file and create car objects with them
public class Main{

    static String fName="cars.csv";

    public static void main(String[] args) {
        int [][] temp = readFromCSV(fName);

        Car car = new Car(temp[0][0],temp[1][0], temp[2][0]);
        //Car thirdcar= new Car(temp[0][3],temp[1][3], temp[2][3]);
        // System.out.println("Price "+car.getPrice()+"\nComfort "+car.getComfort()+"\nPerf: "+car.getPerformance());

         //I need to create an arraylist and put the cars inside
         ArrayList <Car> cars = new ArrayList <Car>();

        //create car objects using the temp array
        for (int index = 0; index < temp[0].length; index++) {
            Car tempCar = new Car(temp[0][index],temp[1][index], temp[2][index]);
            //add the cars to the arraylist
            cars.add(tempCar);
        }
       
        //Print the car's price to the console from the bestCar() method, 
        System.out.println(car.bestCar(cars).getPrice());

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
        //initializing our array
        values=new int[3][3];
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