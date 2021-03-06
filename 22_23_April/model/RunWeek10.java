package model;
import java.io.IOException;

import algorithm.*;

public class RunWeek10 {
	public static void main(String[] args) throws IOException {
		Parameters parameters = new Parameters();
		KnapsackProblemInstance knapsackProblemInstance = new KnapsackProblemInstance(parameters);
		knapsackProblemInstance.print();	
		HeuristicKnapsackSolution heuristicKnapsackSolution = new HeuristicKnapsackSolution(knapsackProblemInstance, parameters.splitChar);
		RandomKnapsackSolution randomKnapsackSolution = new RandomKnapsackSolution(knapsackProblemInstance,parameters.rngForSolution, parameters.seedForSolution, parameters.numberOfRandomSolns, parameters.splitChar);
		RandomKnapsackSolution smartRandomKnapsackSolution = new RandomKnapsackSolution(knapsackProblemInstance, parameters.rngForSolution, parameters.seedForSolution, parameters.numberOfRandomSolns, parameters.splitChar, "smart");
		EnumerateKnapsackSolution enumerateKnapsackSolution = new EnumerateKnapsackSolution(knapsackProblemInstance, parameters.splitChar);
		// Problem instance (read from file, random)
		// A few solution algorithms
		// Analysis
		// input
		// random -> input
		// output_random
		// output_exactSoln
		// output_heur
		
	}
}
