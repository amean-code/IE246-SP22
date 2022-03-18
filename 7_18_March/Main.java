public class Main{

    public static void main(String[] args) {
        
        Human tempHuman= new Human("tempHuman", 20, 250, 100);

        tempHuman.printHumantoConsole();

        tempHuman.walk(20000);
        tempHuman.walk(500);
        tempHuman.printHumantoConsole();
        tempHuman.eatFood(20);
        tempHuman.printHumantoConsole();
        


        // System.out.println(tempHuman.getEnergy());
        // System.out.println(tempHuman.setEnergy(400));

        
        //getters and setters?


    }



}