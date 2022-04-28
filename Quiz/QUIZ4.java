import java.util.HashMap;

public class QUIZ4{

    public static void main(String[] args) {
        HashMap<Player,Integer> pointScored = new HashMap<Player,Integer>();
        Player kb = new Player("Kobe Bryant", 24);
        Player mj = new Player("Michael Jordan", 23);

        pointScored.put(kb, 33643);
        pointScored.put(mj, 32292);
        //creating player3
        Player player3 = new Player("Kobe Bryant", 24);
        //to see our method is working
        int number2 = pointScored.get(kb);
        System.out.println(number2);
        //trying to access the value
        /*
        int number = pointScored.get(player3);
        System.out.println(number);
        */
        //we cannot access the value because it is not defined in the keyset of the hashmap
        
    }
}

class Player{
    //attributes
    String name;
    int number;

    public Player(String s, int n){
        this.name=s;
        this.number=n;
    }
}