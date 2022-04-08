import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        //filereader
        //bufferedreader
        //file
        
        try {
            //File reader basics
            File file = new File("temp.csv");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            BufferedReader BRS = new BufferedReader(new FileReader(new File("temp.csv")));
            //creating an arrayist to put our infos
            ArrayList<String> data = new ArrayList<String>();
            //create an array to store the line
            String[] fragments;
            //rather than putting the values in arraylist put them in 2D array.
            String [][] twoD_array=null;
            //creating a line variable
            String line = br.readLine();

            //to initialize our array
            fragments=line.split(";");
            twoD_array= new String[3][fragments.length];
            twoD_array[0]= fragments;


            //System.out.println("sork");
            //to count the indexes
            int i = 1;
            line = br.readLine();
            while(line!=null){
                //1;2;4
                //{1,2,4}
                fragments=line.split(";");
                // for (String string : fragments) {
                //     data.add(string);
                // }

                //put the first line in the first index of twoDarray
                //put the second line at the second index
                
                twoD_array[i]= fragments;
                // {{1,2,4},
                //  {4,5,6},
                //  {8,6,8}}
                i++;
                //System.out.println("work");
                line = br.readLine();
            }
            br.close();
            fr.close();

            // for (String string : data) {
            //     System.out.println(string);
            // }
            for (String[] strings : twoD_array) {
                for (String x : strings) {
                    System.out.println(x);
                }
            }


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}