

public class MinimumFinder {
    
    public static void main(String[] args) {
        
        /*Pseudocode to find t-th minimum
        *(values[] are given and t is given) 
        */

        // n-th minimum value
        int t = 3; // 3

        // default input values 
        int[] values = {1,3,6,62,5,66};

        // define an arbitrary minValue and index
        int minValue = Integer.MAX_VALUE; // sonsuz
        int minIndex = 0; // 0

        // define a pin boolean array
        boolean[] pin = new boolean[values.length]; // false false false
        
        // make all values false
        for(int i = 0 ; i < pin.length ; i++){ 
            pin[i] = false;
        }
        
        // loop until your nth minimum
        for (int count = 0;count<t; count++){ // count = 0

            minValue = Integer.MAX_VALUE;
            minIndex = 0;

            // find minimum and its index
            for (int i=0 ; i < values.length ; i++){ // i = 0

                // if this is the min value and not pinned
                if (values[i]<minValue && !pin[i]){

                    // get the value
                    minValue=values[i];
                    // get the index
                    minIndex=i;
                }
            }

            pin[minIndex] = true;
        }

        System.out.println(t+"th minimum number is: "+minValue);
        
    }
}