public class OrderFinder {

    public static void main(String[] args) {
        int[] orderOfArgs = new int[args.length];
        // initializing the arra
        for (int i = 0; i < orderOfArgs.length; i++) {
            orderOfArgs[i] = 0;
        }
        // initializing the array
        for (int i : orderOfArgs) {
            i = 0;
        }

        // count variable
        int count = 1;
        // I want to iterate in the empty sections orderofargs
        for (int i = 0; i < orderOfArgs.length; i++) {

            int temp = Integer.MAX_VALUE;
            int minArgsIndex = -1;

            // iterating through args
            for (int j = 0; j < args.length; j++) {
                
                // to check if orderOfArgs index number is equal to zero
                if (orderOfArgs[j] == 0) {

                    // find the smallest number in array
                    if (Integer.parseInt(args[j]) < temp) {
                        temp = Integer.parseInt(args[j]);
                        minArgsIndex = j;
                    }

                }

            }
            // saving the number to our args
            orderOfArgs[minArgsIndex] = count;
            count++;
        }
        
        for (String a : args) {
            System.out.print(a + " ");
        }
        System.out.println();

        for (int i : orderOfArgs) {
            System.out.print(i + " ");
        }

    }

}
