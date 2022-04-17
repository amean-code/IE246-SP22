import java.util.ArrayList;



public class RecursiveSolution {

    // MAIN
    public static void main(String[] args) {
        
        RecursiveSolution rs = new RecursiveSolution();

        double maxValue = rs.solve_recursive(30, 0);

        System.out.println("Max Value: "+ maxValue);
    }

    // Item Arraylist
    private ArrayList<Item> items;

    // Constructor
    public RecursiveSolution(){
        items = generateItems();
    }

    // Generate Items
    public ArrayList<Item> generateItems(){

        // Init
        ArrayList<Item> newItems = new  ArrayList<Item>();

        newItems.add(new Item(12.0, 50.0));
        newItems.add(new Item(15.0, 60.0));
        newItems.add(new Item(20.0, 120.0));
        newItems.add(new Item(16.0, 90.0));
        newItems.add(new Item(2.0, 40.0));

        // return
        return newItems;
    }

    // Solver Function
    public double solve_recursive(double capacity,int itemIndex){
        System.out.println("Capacity: "+capacity);
        System.out.println("Index: "+itemIndex);
        // Check if its finished
        if(itemIndex == items.size()){
            // return 0
            return 0;
        }

        // Get the item
        Item currentItem = items.get(itemIndex);

        // 1 - There is no space
        if(capacity < currentItem.getWeight()){
            // don't take - go next item
            return solve_recursive(capacity,itemIndex+1);
        }else{
            // 2 - There is space

                // 2.1 - Take it
                double takeValue = solve_recursive(capacity - currentItem.getWeight(),itemIndex+1) + currentItem.getValue();
                // 2.2 - Leave it
                double leaveValue = solve_recursive(capacity,itemIndex+1);
                System.out.println("Take Value: " + takeValue);
                System.out.println("Leave Value: " + leaveValue);
            // 3 - Compare and took the highest value
            if(takeValue >= leaveValue){
                // 4 - return value
                return takeValue;
            }else{
                // 4 - return value
                return leaveValue;
            }

        }
    }
    
}

class Item{

    // Attributes
    private double weight,value;

    // Constructor
    public Item(double weight, double value){
        this.weight = weight;
        this.value = value;
    }

    // GETTER
    public double getWeight(){
        return this.weight;
    }

    public double getValue(){
        return this.value;
    }

}


