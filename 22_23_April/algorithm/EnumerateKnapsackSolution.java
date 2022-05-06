package algorithm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import data.Item;
import model.KnapsackProblemInstance;

public class EnumerateKnapsackSolution {

    private KnapsackProblemInstance knapsackProblemInstance;
	private int bestObjFound = 0;
	private ArrayList<Item> selection;
    private HashMap<Item,Boolean> isTaken;
	String splitChar;

    //constructor
    public EnumerateKnapsackSolution(KnapsackProblemInstance knapsackProblemInstance, String splitChar) throws IOException {
        this.knapsackProblemInstance=knapsackProblemInstance;
		this.splitChar = splitChar;
		runAlgorithm();
        printToConsole();
		//printSoln();
    }
    //add the method
    private void runAlgorithm() {

		// include one by one if it fits... 
		// This is based on descending value per weight
		// mostly copied from random algorithm
		
		ArrayList<Item> candidates = sortItems();
        //use hashmaps to determine if we are gonna 
        isTaken = new HashMap<Item,Boolean>();

		selection = new ArrayList<Item>();
       //add items to the hashmap
        for (Item x: candidates) {
            isTaken.put(x, false);
        }

		int totalValue = 0;
		int remainingCapacity = this.knapsackProblemInstance.backpack.capacity;
		
		for(Item i : candidates) // sorted!
		{
			if(i.weight <= remainingCapacity)
			{
				//I need to change the value from false to true
                //call the item
                // isTaken.get(i);
                //change the value
                isTaken.replace(i,true);
				remainingCapacity=remainingCapacity - i.weight;
				totalValue+=i.value;
			}
		}
		this.bestObjFound=totalValue;
	}

	private ArrayList<Item> sortItems() {
		ArrayList<Item> result = new ArrayList<Item>();
		// Find the max value per weight among items not in the result array
		while(result.size() != this.knapsackProblemInstance.items.length)
		{
			double maxVpW = 0;
			Item best=null;
			for(Item i : this.knapsackProblemInstance.items)
			{	
				if(i.valuePerWeight>maxVpW && !result.contains(i))
				{
					maxVpW = i.valuePerWeight;
					best=i;
				}
			}
			result.add(best);
		}
		// Place it in the result array as the last item
		return result;
	}
    //to print the best items to the console
    public void printToConsole() {
        //iterating over hashmap
        for (Item x: isTaken.keySet()) {
            //if the value of a key is true
            if (isTaken.get(x)==true) {
                //print it to the console
                System.out.print(x.id+" ");
            }
        }
    }

}

