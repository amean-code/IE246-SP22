public class Main{

    public static void main(String[] args) {
        
        Human tempHuman= new Human("tempHuman", 20, 250, 100);

        tempHuman.printHumantoConsole();
        tempHuman.eatFood(30);
        tempHuman.printHumantoConsole();
        tempHuman.work(1000000);
        tempHuman.printHumantoConsole();
        
    

        // System.out.println(tempHuman.getEnergy());
        // System.out.println(tempHuman.setEnergy(400));

        
        //getters and setters?


    }



}