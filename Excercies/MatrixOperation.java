package Excercies;

public class MatrixOperation {

    public static void main(String[] args) {
        
        int[][] zero5Matrix = zeros(5,5);
        printMatrix(zero5Matrix);

    }

    public static int[][] zeros(int row,int col){ // row = 5 - col = 5

        // Define 2D Array
        int[][] result = new int[row][col];
        /*
        result = [
            [,],
            [,],
            [,]
        ]
        */

        // Fill the values
        // Iterate rows
        for(int rowIndex = 0 ; rowIndex < result.length ; rowIndex++){ // rowIndex = 1

            // Iterate elements
            for(int itemIndex = 0 ; itemIndex < result[0].length ; itemIndex++){ // itemIndex = 0
                if(itemIndex == 3){
                    result[rowIndex][itemIndex] = 1;
                }else{
                    result[rowIndex][itemIndex] = 0;
                }  
            }
        }

        // return
        return result;
    }

    public static void printMatrix(int[][] matrix){

        /*
        matrix = [
            [2,1,4],
            [12,9,0],
            [6,3,-4],
        ]
        */
        // rows
        for(int[] row : matrix){ // row =  [12,9,0],
            // items
            for(int item : row){ // item = 1
                // print
                System.out.print(item+"\t");
            }
            // Next Line
            System.out.println();

        }

    }

}
