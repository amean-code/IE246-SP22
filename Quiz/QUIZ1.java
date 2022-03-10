
// You cannot use scanner. You cannot import any packages before the main method.
//Create two arrays of size 20. The first array should be an integer array, whose name is your first name, 
//and the second array should be a boolean array, whose name is your last name. 
//Of course, you need to replace the Turkish characters with their associated Latin characters (e.g., kundakcioglu). öztürkoğlu ozturkoglu

//Place the first 20 numbers in an Erhunacci sequence in the first array, which was an integer array. 
//Numbers in Erhunacci sequence satisfy : the n-th number is (2 times n-1st) + (5 times n-2nd) - (n-3rd). 

//The first 3 numbers are 9 0 and 3. So the fourth number should be 2*3 + 5*0 - 9 = -3. Of course, the first number goes to index zero inside the array. 
//--
//Next, for each number check out if they are positive and divisible by 3. If so, the associated entry on the second boolean array must be true. Otherwise, it should be false. So they look as follows:

//erhun = [9 0 3 -3 ...]

//kundakcioglu = [true false true false ...]
package Quiz;

public class QUIZ1 {
    public static void main(String[] args) {
        // creating the integer array
        int[] ecesu = new int[20];
        // creating the boolean array
        boolean[] elmas = new boolean[20];

        // copying the erhunacci sequence
        int first = 9;
        int second = 0;
        int third = 3;

        int newnumber = 0;
        // assigning the first 3 numbers
        ecesu[0] = first;
        ecesu[1] = second;
        ecesu[2] = third;

        for (int n = 3; n < 20; n++) {

            newnumber = 2 * third + 3 * second - first;
            // assigning the numbers between 3-20
            ecesu[n] = newnumber;

            first = second;
            second = third;
            third = newnumber;

        }

        // to check if a anumber is positive and divisible
        // I need to iterate all the numbers
        for (int i = 0; i < ecesu.length; i++) {
            // checking if the number is bigger than zero and %3 is zero
            if (ecesu[i] > 0 && ecesu[i] % 3 == 0) {
                // making the boolean true
                elmas[i] = true;
            }

        }
        // this section is just for seeing the results
        // to see the numbers in ecesu array
        for (int x : ecesu) {
            System.out.println(x);
        }
        // to check if boolean array is true
        for (boolean b : elmas) {
            System.out.println(b);
        }

    }

}
