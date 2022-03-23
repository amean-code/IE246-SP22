package Excercies;

public class SplitFounder {

    public static void main(String[] args) {
        
        int[] numbers = {1,1,2,2,4,1};

        boolean resutl = hasSplitter(numbers);

        System.out.println(resutl);

    }

    public static boolean hasSplitter(int[] arr){ // 1 3 5 2 4

        // iteate all numbers
        for(int i = 0 ; i < arr.length ; i++){
            int lhs = 0,rhs = 0;

            // Sum left hand side
            for(int j = 0 ; j < i ; j ++){
                lhs += arr[j];
            }

            // Sum right hand side
            for(int j = i ; j < arr.length ; j++){
                rhs += arr[j];
            }

            // chech if the same
            if(rhs == lhs){
                return true;
            }
        }   

        // return false
        return false;

    }
    
}
