import java.util.ArrayList;
import java.util.Random;

public class Bilge {


    public static void main(String[] args) {
        SlotMachine sM = new SlotMachine();
        int bet = 20;
        int balance=sM.won(sM.run(bet));

        System.out.println(balance+" is your balance.");

        //sM.initMoney+=sM.won(sM.run(bet));

    }
}

class SlotMachine{

    //attributes
    int initMoney=100;
    int bet;
    ArrayList <Integer> numbers = new ArrayList<Integer>();
    //constructor
    public SlotMachine(){

    }
    //behaviours
    //I need a method to run my slot machine and if the 3 bars have the same value return true, else false
    public boolean run(int bet){
        this.bet=bet;
        this.initMoney-=bet;
        //I need to create 3 different random numbers between(0-7)
        Random x = new Random();
        //iterating tree times for three slots
        for (int i = 0; i < 3; i++) {
            //I want to put the numbers to my arraylist
            numbers.add(x.nextInt(8));
        }
        

        printToConsole();
        //I need to make sure 3 of the numbers are the same
        if (numbers.get(0)==numbers.get(1)&& numbers.get(1)==numbers.get(2)) {
            //if they are same return true
            return true;
           
        }else{
             //if they are different return false
             return false;
        }
       
    }

    //create a method called won which takes a boolean value and increments the money by 20 times the bet if its true and decreases it by the bet amount if its false;
    public int won(boolean x){
        
        //if we won lets incement our money
        if (x) {
            System.out.println("YOU WON CONGRIGULATIONS");
            this.initMoney+=this.bet*20;
        }else{
            System.out.println("YOU LOST");
        }
        return this.initMoney;
    }

    public void printToConsole(){
        System.out.println(" ["+numbers.get(0)+"] "+" ["+numbers.get(1)+"] "+" ["+numbers.get(2)+"] ");
    }

    // create a method called dibiGor and run until you win, you can create an attribute called debt which can go up to -1000
    
    //create a method named simulate, to simulate how much money I will have after x tries
    // I should be able to do the following
    // int balance = sM.simulate(100);

}