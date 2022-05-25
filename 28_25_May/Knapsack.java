import java.util.ArrayList;
import gurobi.*;

public class Knapsack {
	// Attributes
	// ArrayList<Player> Items = new ArrayList<Player>();
	ArrayList<GRBVar> Items = new ArrayList<GRBVar>();
	int noOfItems;
	Player[] players=new Player[4];
	
	int count = 0;
	int capacity;

	// constructor
	public Knapsack(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	// behaviours
	public void addItem(String name, int capacity, int value) {
		players[count] = new Player(name, capacity, value);
		count++;
	}

	public void setCapacity(int n) {
		this.capacity = n;
	}

	public void Solve() {
		try {
			// env
			GRBEnv env = new GRBEnv();
			GRBModel model = new GRBModel(env);

			// variables
			for (int i = 0; i < this.noOfItems; i++) {
				GRBVar temp = model.addVar(0, 1, 0, GRB.BINARY, players[i].name);
				Items.add(temp);
			}

			// constraints
			GRBLinExpr con = new GRBLinExpr();
			for (int i = 0; i < this.noOfItems; i++) {
				con.addTerm(players[i].capacity, Items.get(i));
			}
			model.addConstr(con, GRB.LESS_EQUAL, this.capacity, "Capacity Constraint");
			// model.addConstr(con, GRB.GREATER_EQUAL, 4, "Capacity constraint");

			// objective
			GRBLinExpr expr = new GRBLinExpr();
			// expr.addTerm(IE246.hardness*IE246.size, IE);//42 0 1= 42

			for (int i = 0; i < this.noOfItems; i++) {
				expr.addTerm(players[i].value / players[i].capacity, Items.get(i));
			}
			model.setObjective(expr, GRB.MAXIMIZE);

			// Solve
			model.optimize();
			System.out.println("The optimal solution:");
			//System.out.println(model.get());

			model.dispose();
			env.dispose();

		} catch (Exception e) {
			System.out.print(e);
		}
	}

}

class Player {
	String name;
	int capacity;
	int value;

	// constructor
	public Player(String n, int c, int v) {

		this.name = n;
		this.capacity = c;
		this.value = v;
	}
}