import java.util.ArrayList;

/*

              Car1; Car2; Car3
Price       =60000;70000;67000
Comfort     =    7;    4;    3
Performance =    7;    9;    8


*/


public class Car {
    //attributes
    private int price;
    private double comfort;
    private double performance;
    //price
    //comfort
    //power
    
    //constuctor
    //Car(14,23,25)
    //to create a car we need price, comfort and power
    public Car(int cost,double comfy,double mahmut){
        this.price=cost;
        this.comfort=comfy;
        this.performance=mahmut;
    }
    

    //behaviours

    //create a method named bestCar which takes an arraylist of Car objects and returns the best car with
    //comfort*performance/price ratio
    public Car bestCar(ArrayList <Car> temp){
        Car bestCar=temp.get(0);
        
        //{1,4,6,2,4,89,3,4,5,0,5,23}
        for (Car x : temp) {
            if (bestCar.value()<x.value()) {
                bestCar=x;
            }
        }
        
        return bestCar;
    }

    // lets creeate a method called value which returns a car comfort*performance/price
    public double value() {
        return this.comfort*this.performance/this.price;
    }

    //getters and setters
    public int getPrice(){
        return this.price;
    }

    public double getComfort(){return this.comfort;}
    public double getPerformance(){return this.performance;}
}
