package Excercies;

public class MatrixOperation {

    public static void main(String[] args) {
        
        // int[][] zero5Matrix = zeros(5,5);
        // printMatrix(zero5Matrix);
        question2();
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
        for(int[] row : matrix){ // row =  [2,1,4],
            // items
            for(int item : row){ // item = 2

                if(item == 3 || item == 4){
                    return;
                }
                // print
                System.out.print(item+"\t");
            }
            // Next Line
            System.out.println();

        }

    }

    public static void question2(){

        // Define double array of arrays
        double[][] matrix = {
            {34,53,5,3.76,1},
            {4.1,53,5,3.76,6},
            {34,3,5,3.76,5},
        };
        // iterate rows
        for(int i = 0 ; i < matrix.length ; i++){ // i = 0

            // iterate columns
            for(int j = 0 ; j < matrix[0].length ; j++){// j = 2

                // check the condition
                if( !((matrix[i][j] >= 3 && matrix[i][j] <4) || (matrix[i][j] >= 5 && matrix[i][j] <=6)) ){
                    // if true - print
                    System.out.print(matrix[i][j]+" ");
                }

            }

            // Next Line
            System.out.println();
        }

    }

}
