import java.util.Random;
import java.util.concurrent.Flow.Subscriber;

public class Item {
    String name;
    double value;

    public Item(String n){
        this.name=n;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Item x = new Item("Item 1");
        Item y = new Item("Item 2");
        Item z = new Item("Item 3");

        int randomint= rand.nextInt(8)+3; //3 - 10, (0 - 7) + 3, 0,1,2,3,4,5,6,7
        System.out.println(randomint);
        double randomDouble= rand.nextDouble();

        if (randomDouble<0.65) {
            x.value=3;
        }else{
            x.value=5.5;
        }
        System.out.println("Random 1"+ randomDouble);
        randomDouble= rand.nextDouble();

        if (randomDouble<0.65) {
            y.value=3;
        }else{
            y.value=5.5;
        }
        System.out.println("Random 2"+ randomDouble);

        randomDouble= rand.nextDouble();

        if (randomDouble<0.65) {
            z.value=3;
        }else{
            z.value=5.5;
        }
        System.out.println("Random 3"+ randomDouble);


        System.out.println(x.name+" value is "+ x.value);
        System.out.println(y.name+" value is "+ y.value);
        System.out.println(z.name+" value is "+ z.value);


    }

}
