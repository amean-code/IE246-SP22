import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


// This class generates random daily sellings of a product
public class DemandGenerator {

    // MAIN
    public static void main(String[] args) {
        
        DemandGenerator dg = new DemandGenerator();

        dg.init();

        dg.generateDemand();

        //dg.showSellings();

        //dg.saveDataCSV();

        dg.setSeedTry();

    }

    // Attribute
    Random rand;
    ArrayList<Integer> sellings;

    // Init
    public void init(){

        this.rand = new Random();
        this.rand.setSeed(100);
        this.sellings = new ArrayList<Integer>();
    }

    public void setSeedTry(){
        System.out.println("Random1: "+ this.rand.nextInt(10));
        System.out.println("Random2: "+ this.rand.nextInt(100));
        System.out.println("Random3: "+ this.rand.nextInt(1000));

        System.out.println("Random4: "+ this.rand.nextInt(10));
        System.out.println("Random5: "+ this.rand.nextInt(100));
        System.out.println("Random6: "+ this.rand.nextInt(1000));
    }

    public void generateDemand(){

        // Iterate all days in a year
        for(int i_day = 0 ; i_day < 365 ; i_day++){

            // Create a random number for sellings of the day 40-110
            int randSell = this.rand.nextInt(70) + 40;

            // Add the arraylist
            this.sellings.add(randSell);

        }

    }

    public void showSellings(){

        for(int i = 0 ; i < sellings.size() ; i++){

            System.out.println("Day " + i + ": " + this.sellings.get(i));

        }

    }

    // Save as csv file
    public void saveDataCSV(){

        try{
            // Create a Buf Write to write a file
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("random_demand2.csv")));

            // Write the content
            bw.write(getCSVContent());

            // Close the file
            bw.close();

        }catch(IOException e){
            System.out.println("Error: " + e.toString());
        }
        
    }

    // Get CSV Content
    public String getCSVContent(){

        String content = "Day Index,# of sales\n"; // Titles


        // Keep All Data
        for(int i = 0 ; i < sellings.size() ; i++){
            content += i+","+this.sellings.get(i)+"\n";
        }

        return content;

    }


    
}
