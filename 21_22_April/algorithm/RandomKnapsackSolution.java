package algorithm;

import model.*;
import data.*;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomKnapsackSolution {

	private KnapsackProblemInstance knapsackProblemInstance;
	private Random rng = new Random();
	private HashMap<Item, Boolean> solution = new HashMap<Item, Boolean>();
	private int bestObjFound = 0;
	String splitChar;

	public RandomKnapsackSolution(KnapsackProblemInstance knapsackProblemInstance, Random rngForSolution,
			int seedForSolution, int numberOfRandomSolns, String splitChar) throws IOException {
		this.knapsackProblemInstance = knapsackProblemInstance;
		this.rng = rng;
		this.splitChar = splitChar;
		this.rng.setSeed(seedForSolution);
		this.resetSolutionDict();
		for (int i = 0; i < numberOfRandomSolns; i++)
			this.solve();
		this.printBestSoln(numberOfRandomSolns);
		
		
	}

	public RandomKnapsackSolution(KnapsackProblemInstance knapsackProblemInstance2, Random rngForSolution,
			int seedForSolution, int numberOfRandomSolns, String splitChar2, String string) throws IOException {
		this.knapsackProblemInstance = knapsackProblemInstance2;
		this.rng = rng;
		this.splitChar = splitChar2;
		this.rng.setSeed(seedForSolution);
		this.resetSolutionDict();
		for (int i = 0; i < numberOfRandomSolns; i++)
			this.solve(string);
		this.printBestSoln(numberOfRandomSolns);
		this.knapsackProblemInstance.bufferedWriter.close();
		this.knapsackProblemInstance.fileWriter.close();
		
	}

	private void printBestSoln(int numberOfRandomSolns) throws IOException {
		// Let's write the output of the algo to a file...
		this.knapsackProblemInstance.bufferedWriter
				.write("Best obj upon " + numberOfRandomSolns + " random trials: " + this.bestObjFound + "\n");
		for (Item i : this.solution.keySet()) {
			if (this.solution.get(i)) {
				this.knapsackProblemInstance.bufferedWriter
						.write(i.id + this.splitChar + i.value + this.splitChar + i.weight + " \n");
			}
		}
	}

	private void CopySelectionToHashMap(ArrayList<Item> selection) {
		// given list of selection, update solution HashMap
		this.resetSolutionDict(); // resets everything to false to be on the safe side
		for (Item i : selection) {
			this.solution.put(i, true);
		}
	}

	private void resetSolutionDict() {
		for (Item i : this.knapsackProblemInstance.items) {
			this.solution.put(i, false);
		}
	}

	private void solve() {
		ArrayList<Item> selection = new ArrayList<Item>();
		ArrayList<Item> candidates = new ArrayList<Item>();
		// DO NOT DO THE FOLLOWING!
		// Item[] candidates = this.knapsackProblemInstance.items;
		for (Item i : this.knapsackProblemInstance.items) {
			candidates.add(i);
		}
		int totalValue = 0;
		int remainingCapacity = this.knapsackProblemInstance.backpack.capacity;

		while (!candidates.isEmpty()) {
			Item i = pickOneRandomly(candidates);

			// Item ij = new Item(1,1504,16);
			// candidates.remove(ij);
			// this would not remove the object,
			// even with same properties
			// because it is not "THAT" object
			// It is some sort of a copy

			candidates.remove(i);
			if (i.weight <= remainingCapacity) {
				selection.add(i);
				remainingCapacity = remainingCapacity - i.weight;
				totalValue += i.value;
			}
		}
		if (totalValue > this.bestObjFound) {
			this.bestObjFound = totalValue;
			this.CopySelectionToHashMap(selection);
		}
	}

	private void solve(String x) {
		ArrayList<Item> selection = new ArrayList<Item>();
		ArrayList<Item> candidates = new ArrayList<Item>();
		// DO NOT DO THE FOLLOWING!
		// Item[] candidates = this.knapsackProblemInstance.items;
		for (Item i : this.knapsackProblemInstance.items) {
			candidates.add(i);
		}
		int totalValue = 0;
		int remainingCapacity = this.knapsackProblemInstance.backpack.capacity;

		while (!candidates.isEmpty()) {
			Item i = pickOnePerWeight(candidates);

			// Item ij = new Item(1,1504,16);
			// candidates.remove(ij);
			// this would not remove the object,
			// even with same properties
			// because it is not "THAT" object
			// It is some sort of a copy

			candidates.remove(i);
			if (i.weight <= remainingCapacity) {
				selection.add(i);
				remainingCapacity = remainingCapacity - i.weight;
				totalValue += i.value;
			}
		}
		if (totalValue > this.bestObjFound) {
			this.bestObjFound = totalValue;
			this.CopySelectionToHashMap(selection);
		}
	}

	private Item pickOneRandomly(ArrayList<Item> setOfItems) {
		int accessThis = this.rng.nextInt(setOfItems.size());
		return setOfItems.get(accessThis);
	}

	// lets create a method to pick the random items per their weights
	private Item pickOnePerWeight(ArrayList<Item> setOfItems) {
		// 10 20 30 40
		// 100, 0-10 ,
		// 90, 0-20,
		// 70, 0-30,
		// 40, 40
		double sum = 0;
		// calculate all values
		for (Item item : setOfItems) {
			sum += item.valuePerWeight;
		}
		// create a random
		double randbyWeight = sum * this.rng.nextDouble();
		// iterate elements
		for (int index = 0; index < setOfItems.size(); index++) {
			// added if to check randomity
			//if the items value is bigger than random return the item
			if (randbyWeight < setOfItems.get(index).valuePerWeight) {
				return setOfItems.get(index);
				//else update our random value (make it smaller)
			} else {
				randbyWeight -= setOfItems.get(index).valuePerWeight;
			}
		}
		return null;
	}
}
