import java.util.ArrayList;

public class Main {

    static ArrayList<Coffee> ahmetin_kahveleri = new ArrayList<Coffee>();
    public static void main(String[] args) {
        Human ahmet = new Human("Ahmet", 25, false, 50);
        Human ecesu = new Human("Ecesu",22,true,400);

        Coffee ecesu_coffee = new Coffee(20, 500, 200);


        /*
        ecesu_coffee.print_to_console();



        ecesu_coffee.makeCoffee(0, true, false, 50);


        ecesu_coffee.print_to_console();

        ecesu_coffee.makeCoffee(0, true, false, 50);

        ecesu_coffee.print_to_console();

        ecesu.buyCoffee(ecesu_coffee);
        ahmet.buyCoffee(ecesu_coffee);*/

        //I want ahmet to order 30 coffees with 500 mg of caffeine 200 ml of size and 40 percent coffee
        
        for (int i = 0; i < 10; i++) {
            Coffee ahmet_Coffee = new Coffee(i*3, 200, 50*i);
            ahmetin_kahveleri.add(ahmet_Coffee);
        }
        int[] hello = new int[10];
        for (int i : hello) {
            
        }
        //to print our arraylist
        for(Coffee c:ahmetin_kahveleri){
            c.print_to_console();
        }

    }
}
