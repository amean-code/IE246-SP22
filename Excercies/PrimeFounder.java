package Excercies;

import java.util.Scanner;

public class PrimeFounder {

        // Question
    //     You will write a program, which reads an integer
    //  N between 0 and 100 and displays ”prime” is N is
    //  prime; ”not prime” otherwise.
    public static void main(String[] args) {
        
        // Define Scanner
        Scanner scan = new Scanner(System.in);

        // Get Nmber
        System.out.println("Enter an integer number: ");
        int input = scan.nextInt();

        scan.close();
        // Check if it is prime

            // less than 2 is not prime
            if(input < 2){
                System.out.println("Not Prime!");
            }
            // 2 is first prime
            else if(input == 2){
                System.out.println("Prime!");
            }
            
            else{
                boolean isPrime = true;
                // iterate all numbers starting from 2
                for(int i = 2 ; i < input ; i++){

                    // if input is divisible by any previous value
                    if(input % i == 0 ){
                        System.out.println("Not Prime!");
                        isPrime = false;
                        break;
                    }
                        // not prime

                    // otherwise

                        // Prime
                }

                if(isPrime){
                    System.out.println("Prime!");
                }
            }   

        // Print

    }

    

    
}