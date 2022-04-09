import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// lets read the csv file and create car objects with them
public class Main{

    static String fName="cars.csv";

    public static void main(String[] args) {
        int [][] temp = readFromCSV(fName);

        //create car objects using the temp array

        //Print the car's price to the console from the bestCar() method, 





        //to see if our method works
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
}