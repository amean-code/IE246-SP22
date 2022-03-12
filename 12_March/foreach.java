// Write a method called vertical that accepts a String as its parameter and prints 
// each letter of the string on separate lines. 
// For example, a call of vertical("hey now") should produce the following output:

public class foreach {
    
    public static void main(String[] args) {
        String hello = "hello";
        vertical(hello);
        int[] array = {3,5,6,7,8,9};
        printSquare(array);
        //  int[] array = {1,3,4,5,6,7};
        System.out.println(array[3]);
    }

    public static void printSquare(int[] arr) {
        // for (int i : arr) {
        //     i=i-2;
        //     System.out.println(i*i);
        // }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]-2;
            System.out.println(arr[i]*arr[i]);
        }
    }


    public static void vertical(String s){
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}
