public class substract {
    
    public static void main(String[] args) {
        int[] twoInts = new int[2];
        twoInts[0]=Integer.parseInt(args[0]);
        twoInts[1]=Integer.parseInt(args[1]);
        
        //to check if there is two arguments
        if(args.length!=2){
            System.out.println("Please provide two numbers.");
            return;
        }   

        larger(twoInts);

    
    }
    
    //to see which number is larger
    public static void larger(int[] numbers){
        //first number is bigger
        if (numbers[0]>numbers[1]) {
            System.out.println("First Number is larger and the difference is "+ (numbers[0] - numbers[1]));
        //the second number is bigger
        }else if (numbers[1]>numbers[0]) {
            System.out.println("Second Number is larger and the difference is "+ (numbers[1] - numbers[0]));
        //if they are equal
        }else {
            System.out.println("Both Numbers are the same.");
        }
    }
}