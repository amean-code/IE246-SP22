public class Human {

    // attributes
    private int height;
    private double weight;
    private String name;
    private int age;
    private double energy;
    private double money;

    // constructor
    public Human(String n, int age, int h, double w) {
        this.name = n;
        this.age = age;
        this.height = h;
        this.weight = w;
        this.energy = 2 * w;
        this.money = 100;
    }

    // behaviours
    public void printHumantoConsole() {
        System.out.println(
                "Name: " + this.name + "\nAge: " + this.age + "\nHeight: " + this.height + "\nWeight: " + this.weight
                        + "\nEnergy: " + this.energy+ "\nMoney: " + this.money);
    }

    public void walk(int meters) {

        // find how many 100 meters I have travelled
        int blocksTravelled = meters / 100;
        // if to see if we have ehough energy
        if (this.energy >= blocksTravelled * age) {
            // for every 100 meters decrease energy by age value
            // 100 meters travelled * age
            // substract this value from my energy
            this.energy = this.energy - blocksTravelled * age;
            System.out.println(this.name + " has walked " + meters + " meters.");
        }else{
            //creating a prompt to see how many meters that I can walk
            //100 - 20 * 5
            //energy = age * meters that I can walk
            //metersthatIcanwalk=energy/age;
            double metersThatIcanWalk = (this.energy/this.age)*100;
            System.out.println("\nYou don't have enough energy, you can only walk "+ metersThatIcanWalk +" meters.");
        }

    }

    public double getEnergy() {
        return this.energy;
    }

    public double setEnergy(int i) {
        this.energy = this.energy + i;
        return this.energy;
    }

    // lets create a method named eatFood to gain energy from the food
    // 1 food costs 3 money, and gives 10 energy
    public void eatFood(int foodAmount) {
        // if I Have enough money to buy that much of food
        if (this.money >= foodAmount * 3) {
            // increment our energy by the food we ate times 10
            this.energy = this.energy + foodAmount * 10;
            // decrement our money buy the foodamount times 3
            this.money -= foodAmount * 3;
            // this.money=this.money-foodAmount*3;
        } else {
            System.out.println("You don't have enough money, you only have " + this.money + " liras.");
        }
    }
    
    //lets create a method named storeEnergy to store the exceed amount of fat if we have more than max energy (weight*2)


    //create a method named work to lose energy and time to earn money
    // 10 hours of work gives 10 lira and loses one day from daysToLive and adds 5 boredom
    
    //create daysToLive of 1000 days for every human
    

    //create a method DIE if the daysToLive becomes zero.

    //EXTRA
    // add a variable called boredom and make it zero

    //if boredom exceeds 100 make the Human die
    
    //create a method called haveFun, which substracts 1 day from life and 10 liras but cuts the boredom by 10






}
