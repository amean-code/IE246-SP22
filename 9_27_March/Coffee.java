public class Coffee {

    // attributes
    int coffee_percentage;
    int caffeine;
    int size;
    boolean containsMilk;
    int chocolate_percentage = 0;
    boolean isCold;

    // constructor
    public Coffee(int cP, int size, int caffeine) {
        this.coffee_percentage = cP;
        this.size = size;
        this.caffeine = caffeine;

    }

    // behaviours
    public void makeCoffee(int caffeine, boolean milk, boolean coldness, int chocolate_percentage) {
        this.caffeine += caffeine;
        // this.caffeine=this.caffeine+caffeine;
        this.containsMilk = milk;
        this.isCold = coldness;
        this.chocolate_percentage += chocolate_percentage;
    }

    public void print_to_console(){
        System.out.println("Coffee Percentage: "+this.coffee_percentage+"\nSize: "+this.size+"\nCaffeine: "+this.caffeine+"\nChocolate: "+this.chocolate_percentage);
    }
}

class Human {

    // attributes
    String name;
    int age;
    boolean tolerance;
    int caffeine_sensitivity = 100;

    // constructor
    public Human(String n, int age, boolean tolerance, int caffeine_sensitivity) {
        this.name = n;
        this.age = age;
        this.tolerance = tolerance;
        this.caffeine_sensitivity = caffeine_sensitivity;

    }

    // behaviours
    public void isTolerant() {
        if (tolerance) {
            System.out.println("This person can drink coffee.");
        } else {
            System.out.println("This person can't drink coffee!");
        }

    }

    // to buy coffee from the counter
    public void buyCoffee(Coffee c) {
        // if human has intolerance dont let him buy coffee.
        if (!this.tolerance) {
            System.out.println("This person can't drink caffeine!");
        }else{
            System.out.println("This person can drink coffee.");
        }
        // if caffeine is zero let him buy the coffee
        if (c.caffeine == 0) {
            System.out.println("This person can drink this beverage");
        }
        
    }

    public void print_to_console() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nCan tolerate coffee? :" + this.tolerance
                + "\nCaff Sens: " + this.caffeine_sensitivity);

    }

}