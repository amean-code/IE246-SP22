
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knapsack knapsack = new Knapsack(4);
		knapsack.addItem("Mirealem", 55, 607);
		knapsack.addItem("Mitchy", 65, 547);
		knapsack.addItem("Rachid", 75, 747);
		knapsack.addItem("Mesut", 85, 60);
		knapsack.setCapacity(200);
		knapsack.Solve();
	}

}
