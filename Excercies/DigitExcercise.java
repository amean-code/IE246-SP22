package Excercies;

import java.util.Scanner;

public class DigitExcercise {

    // Question
    //     Write a program that reads an integer between 0
    // and 999 and displays all the digits in the integer.
    // Your program first should identify the number of
    // digits of the integer. Then if the number of digits is
    // 1, display “The number has 1 digit. The digit is ...”;
    // 2, display “The number has 2 digits. The digits are
    // ...”; 3, display “The number has 3 digits. The digits
    // are ...”.

    public static void main(String[] args) {
        
        // Scanner
        Scanner scan = new Scanner(System.in);

        // Get input between 0-999
        System.out.println("Please type an integer between 0-999: ");
        int number = scan.nextInt();


        // check if between 0-999
        if(!(number < 1000 && number >= 0)){
            System.out.println("Please type an integer between 0-999: ");
            return;
        }

        // identify number of digits
        String inputStr = Integer.toString(number);
        int numberDigits = inputStr.length(); 

        // Print
        System.out.println("The number has " + numberDigits + " digits.");

        // Sum of the digits
        int sumDigits = 0;
        for(int i = 0 ; i < inputStr.length() ; i ++){
            int currentDigit = Integer.parseInt(inputStr.substring(i, i+1));
            sumDigits += currentDigit;
        }
        System.out.println("Sum of the digits: "+ sumDigits);

        scan.close();

    }
    
}
