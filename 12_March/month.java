public class month {

    public static void main(String[] args) {
        // take the argument of month from the user
        int number = Integer.parseInt(args[0]);

        System.out.println(months(number));
    
    }

    public static String months(int num) {
        // return the name of the month
        switch (num) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

        }

        return "Please enter a number between 1 - 12";
    }

}