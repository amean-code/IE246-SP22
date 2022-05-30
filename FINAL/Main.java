import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        String filename=args[0];
        ArrayList <Integer> firstFile=readFromFile(filename);
        ArrayList <Integer> secondFile=readFromFile(args[1]);

        printArraylistTOConsole(firstFile);
        printArraylistTOConsole(secondFile);


    }

    public static void printArraylistTOConsole(ArrayList <Integer>s) {
        System.out.println("========================================================");
        for (Integer integer : s) {
            System.out.print(integer + " ");
        }
        System.out.println("\n========================================================");
    }

    public static ArrayList<Integer> readFromFile(String fNAME){
        ArrayList<Integer> data = new ArrayList<Integer>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fNAME)));
           
            //create an array to store the line
            String[] splitted_line;
            //creating a line variable
            String line = br.readLine();

            //to initialize our array
            splitted_line=line.split(";");

            for (String string : splitted_line) {
                data.add(Integer.parseInt(string));
            }
            //System.out.println("sork");
            //to count the indexes
            line = br.readLine();
            while(line!=null){
                //1;2;4
                //{1,2,4}
                splitted_line=line.split(";");
                // for (String string : splitted_line) {
                //     data.add(string);
                // }

                //put the first line in the first index of twoDarray
                //put the second line at the second index
                 
                for (String string : splitted_line) {
                    data.add(Integer.parseInt(string));
                }
                //System.out.println("work");
                line = br.readLine();
            }
            br.close();


        } catch (Exception e) {
            //TODO: handle exception
        }


        return data;
    }

}