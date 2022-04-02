import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        Drunk man1 =new Drunk(80,"man1");
        man1.populateArrayList();
        man1.randomizeIndex(rand);
        simulate(20, man1, rand);

    }
    //I want to create an integer called stepcount
    public static void simulate(int value,Drunk x, Random rand){
        //until the value is equal to my index
        //I want to make my man walk
        int stepcount=0;
        while (value!=x.getIndex()) {
            x.walk(rand); 
            System.out.println(x.name+" index is "+x.getIndex());
            stepcount++;
        }
        System.out.println("You reached the value!\nYou took "+stepcount+" steps.");
    }
}   