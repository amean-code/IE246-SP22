public class Project1 {
    static int globalinteger = 0;

    public static void main(String[] args) {
        int[] numbers = { 5, 5, 6, 7, 4, 7, 2, 8, 0, 2, 0 };
        int indexNum = 5;
        globalinteger = Integer.parseInt(args[0]);
        numCheck(globalinteger);
        // I want to check if the result of boolean operation is true or false
        // if its true than I wont print something to the console
        // if numcheck is true then if paranthesis compile
        if (!true) {
            // here will NOT run
        }
        // if the value
        if (!numCheck(numberAtIndex(numbers, indexNum))) {
            System.out.println("Result is: " + numbers[indexNum]);
        }

        // recurseNum(45,5);

        // System.out.println("Result is: " + numberAtIndex(numbers, indexNum));

        String[] strArr = { "abc", "nuhammad", "ada", "kaan", "beril" };
        // boolean is a binary operation
        boolean[] boolArr = new boolean[10];
        for (int i = 0; i < boolArr.length; i++) {
            boolArr[i] = true;
        }
        boolArr[3] = false;
        for (int i = 0; i < boolArr.length; i++) {
            System.out.println(boolArr[i]);
        }

        // while (true) {

        // }

        // if (condition) {

        // }

        // do {
        // //username
        // } while (condition);

    }

    // create method that takes an integer array and an int index, returns the value
    // of that integer at that index
    public static int numberAtIndex(int[] array, int index) {

        // how to get a value at the zero'th index of an array
        // int result = array[0];

        // I want to check if index value is smaller than array.lenght
        if (index < array.length) {
            return array[index];
        }
        numCheck(globalinteger);
        return Integer.MAX_VALUE;
    }

    // boolean method, to check if the returned result is equal to integer.max
    // value, which takes an integer parameter
    public static boolean numCheck(int number) {
        // what is the difference between one equal sign and two?
        // =, means assignig sth to sth, ==, is checking
        // int hello = 10;
        // hello == 10
        // I need to check if the value is equal to int.Maxvalue
        if (number == Integer.MAX_VALUE) {
            System.out.println("The index is out of bounds.");
            return true;
        }
        return false;
    }

    // lets write method which takes two integer values and substracts them from
    // each other // tehr esult will be another integer
    // stops if the first number is negative
    // i need to write this as a recursive method = recursion

    public static int recurseNum(int number1, int number2) {
        // substracting the numbers
        int result = number1 - number2;
        System.out.println(result);
        // stops if my number is negative
        if (number1 <= 0) {
            System.out.println("This is the last one.");
            return number1;
        }

        return recurseNum(result, number2);
    }
    // recurseNum(45,5);
    // recurseNum(40,5);
    // recurseNum(35,5);
    // recurseNum(30,5);
    // recurseNum(25,5);
    // recurseNum(20,5);

}