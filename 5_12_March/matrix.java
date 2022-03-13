// Write a method called isMagicSquare that accepts a two-dimensional array of integers as a parameter 

//and returns true if it is a magic square. 
//A square matrix is a magic square if it is square in shape (same number of rows as
//  columns, and every row the same length), and all of its row, column, and diagonal sums are equal. 
// For example, [[2, 7, 6], [9, 5, 1], [4, 3, 8]] is a magic square because all eight of the sums are exactly 15.


public class matrix {

    public static void main(String[] args) {
        
        int[][] arr={{2,7,6},
                     {9,5,1},
                     {4,3,7}};

        
        if (isMagicSquare(arr)) {
            System.out.println("It is a magic square!!");
        }else{
            System.out.println("It is not a magic square.");
        }

    }

    //create a method that accepts 2d int array as a parameter
    public static boolean isMagicSquare(int[][] arr){

        //if the height and width of my matrix is equal
        int height = arr.length;
        int width = arr[0].length;


        //A square matrix is a magic square if it is square in shape
        //lets check if every row width of my matrix is equal
        // I also checked if my matrix is a square matrix
        for (int i = 0; i < height; i++) {
            //height is equal to width of every row
            if (height == arr[i].length) {
                
            }else{
                System.out.println("Matrix cannot exist.");
                return false;
            }

        }

        // for (int i = 0; i < arr[0].length; i++) {
        //     System.out.println(arr[0][i]);
        // }
        int widthSum = 0;
        int heigtSum = 0;
        int tempColumn = arr[0][0]+arr[1][0]+arr[2][0];
        int tempRow = arr[2][0]+arr[2][1]+arr[2][2];
        for (int i = 0; i < height; i++) {
            //and all of its row, column, and diagonal sums are equal. 
            
            
            //calculate the rows
            for (int j = 0; j < width; j++) {
                widthSum+= arr[i][j];
            }


            //calculate the column
            for (int j = 0; j < width; j++) {
                heigtSum+= arr[j][i];
            }

            //checking if horizontal sum is equal to height sum
            if (!(widthSum == heigtSum && tempColumn==tempRow )) {
                return false;
            }
            //making the values zero to calculate them again
            widthSum = 0;
            heigtSum = 0;
        }
        // int[][] arr={{2,7,6},
        //              {9,5,1},
        //              {4,3,8}};
        return true;
    }

}
