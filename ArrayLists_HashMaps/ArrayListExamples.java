package ArrayLists_HashMaps;

// Imports
import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {

        // Defıne a new boolean array
        boolean[] nameOfBooleanArray; // Not An Object !! - Only a variable holds an address
        
        nameOfBooleanArray = new boolean[10];

        // Make first index true
        for(int i = 0 ; i < nameOfBooleanArray.length ; i+=2){
                nameOfBooleanArray[i] = true;
        }
        
        // ARRAY LIST - Advenged version of Array
        ArrayList<Boolean> booleanArrayList = new ArrayList<Boolean>();

        // Add new element

        for(int i = 0 ; i < 100 ; i++){
            booleanArrayList.add(false);
        }  

        for(int i = 0 ; i < booleanArrayList.size(); i+=2){
            booleanArrayList.set(i,true);
        }


        // Print size
        System.out.println("Array Length: "+ nameOfBooleanArray.length );
        System.out.println("ArrayList Size: "+ booleanArrayList.size() );

        // Compare the third elemets
        System.out.println("3rd Element of Array: "+ nameOfBooleanArray[2]);
        System.out.println("3rd Element of Array List: "+ booleanArrayList.get(2));




    }
    
}
