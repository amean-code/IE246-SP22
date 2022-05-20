import java.util.ArrayList;
import gurobi.*;

class Worker{
    //attributes
    String name;
    int wage;
    int [] availability;
    //constuctor
    public Worker(String n,int w, int [] x ){
        this.name=n;
        this.wage=w;
        this.availability=x;
    }
    //behaviors
}
//Amy, Bob, Cathy, Dan, Ed, Fred, and Gu.
//10, 12, 10, 8, 8, 9, 11
// int availability[] =

// {{ 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1 },

// { 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0 },

// { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },

// { 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 },

// { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1 },

// { 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1 },

// { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }};

class Shift{
    String name;
    int workerNeeded;
    public Shift(String n, int w){
        this.name=n;
        this.workerNeeded=w;
    }
}
//"Mon1", "Tue2", "Wed3", "Thu4", "Fri5", "Sat6", "Sun7", "Mon8", "Tue9", "Wed10", "Thu11", "Fri12", "Sat13", "Sun14".
//3, 2, 4, 4, 5, 6, 5, 2, 2, 3, 4, 6, 7, 5, respectively.

public class Main{


        public static void main(String[] args) {
            ArrayList<Worker> workers = new ArrayList<Worker>();
            ArrayList<Shift> shifts = new ArrayList<Shift>();

            String [] shiftName ={"Mon1", "Tue2", "Wed3", "Thu4", "Fri5", "Sat6", "Sun7", "Mon8", "Tue9", "Wed10", "Thu11", "Fri12", "Sat13", "Sun14"};
            int [] shiftCapacity={3, 2, 4, 4, 5, 6, 5, 2, 2, 3, 4, 6, 7, 5};

            String []names={"Amy", "Bob", "Cathy", "Dan", "Ed", "Fred","Gu"};
            int [] wagePerWorker = {10, 12, 10, 8, 8, 9, 11};
            int availability[][] =

                {{ 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1 },

                { 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0 },

                { 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },

                { 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 },

                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1 },

                { 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1 },

                { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }};
            
            //lets create workers
                int count=0;
                int [] temp = new int[availability[0].length] ;
                for (int i = 0; i < names.length; i++) {
                    for (int j = 0; j < availability[0].length; j++) {
                        temp[j]=availability[count][j];
                    }
                    count++;
                    workers.add(new Worker(names[i], wagePerWorker[i] , temp));
                }

            
            //create shifts
            for (int i = 0; i < temp.length; i++) {
                shifts.add(new Shift(shiftName[i], shiftCapacity[i]));
            }
            
        
			try {
				GRBEnv env = new GRBEnv();
				GRBModel model = new GRBModel(env);
				
				
				
				//variables
				ArrayList <GRBVar> workersGRB = new ArrayList <GRBVar>();
				ArrayList <GRBVar> shiftsGRB = new ArrayList <GRBVar>();
				
				//create grb variables using workers at hand
				for (int k = 0; k < names.length; k++) {
					workersGRB.add(model.addVar(0, 1, 0, GRB.BINARY, workers.get(k).name));
				}
				
				for (int k = 0; k < names.length; k++) {
					shiftsGRB.add(model.addVar(1, 1, 0, GRB.BINARY, shifts.get(k).name));
				}
	
			
				//GRB Objective
				GRBLinExpr expr = new GRBLinExpr(); 
				//i need to iterate over shifts
				for (int s= 0; s < shifts.size(); s++) {
					//i need to iterate over workers
					for (int i = 0; i < workersGRB.size(); i++) {
						//if worker is not available, make the value 99999
						if(workers.get(i).availability[s]==0) {
							expr.addTerm(workers.get(i).wage*99999,workersGRB.get(i));//5*x//Multipy wage * availability// 0 
						}else {
							expr.addTerm(workers.get(i).wage*1,workersGRB.get(i));//5*x//Multipy wage * availability// 0 
						}
		            }
				}
				
				model.setObjective(expr, GRB.MINIMIZE);
				//GRB Constraints
				
				GRBLinExpr con = new GRBLinExpr(); 
				//iterate over shifts to see their capacity
				for (int s= 0; s < shifts.size(); s++) {
					//add constraints
					for (int i= 0; i < shifts.size(); i++) {
						con.addTerm(shifts.get(i).workerNeeded, shiftsGRB.get(i));
					}
					
				}
				

				model.addConstr(con, GRB.LESS_EQUAL,50 , "Capacity constraint");

				//Solve
				
			} catch (GRBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            

        }
}