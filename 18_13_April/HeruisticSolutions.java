import java.util.ArrayList;

public class HeruisticSolutions {

    public static void main(String[] args) {
        
        // Generate 10 items
        ArrayList<Item> items = Item.generateItems(10);


    }

    public static void lessWeight( ArrayList<Item> items, double capacity){

        // Initialize an arraylist to select an item
        ArrayList<Item> collectedItems =  new ArrayList<Item>();

        for(int j = 0 ; j < items.size() ; j++){
                        // Find the item with minimum weight
            Item tempItem = items.get(0); // assume that first item has min weight
            for(int i = 0 ; i < items.size() ; i++){

                Item currentItem = items.get(i);
                // check if the current item has less weight
                if(currentItem.getWeight() < tempItem.getWeight()){
                    tempItem = currentItem;
                }

            }

            // check if there is enough capacity
            if(tempItem.getWeight() <= capacity){
                // take the item
                collectedItems.add(tempItem);
                // decrease the capacity
                capacity -= tempItem.getWeight();
            }// pass the item
        }

    }
    
}

class Item{

    // Attributes
    private String name;
    private double weight,value;

    // Constructor
    public Item(String name,double weight,double value){

        this.name = name;
        this.weight = weight;
        this.value = value;

    }

    // Static  method to generate item Arraylist
    public static  ArrayList<Item> generateItems(int count){

        // init an arraylist
        ArrayList<Item> newItems = new ArrayList<Item>();

        // Create Item objects and collect them
        for(int i = 0 ; i < count ; i++){
            newItems.add(new Item("Item "+ (i+1) , Math.random() * 5 + 5, Math.random() *10 + 10));
        }

        // return arraylist
        return newItems;

    }

    // Getter Setter
    public double getWeight(){
        return this.weight;
    }

}