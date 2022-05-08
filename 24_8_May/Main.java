
import gurobi.*;

public class Main {
    // Create classes with 3 attributes
    //name
    //zorluk
    //size

    //student capacity(100)
    public static void main(String[] args) {
        //create lesson objects 
        Lesson IE246 = new Lesson("IE246", 7, 6);
        Lesson ENG101 = new Lesson("ENG101", 5, 4);
        Lesson FE101 = new Lesson("FE101", 1, 2);
        Lesson HIST201 = new Lesson("HIST201",4,3);
        Lesson MATH215 = new Lesson ("MATH215",6,4);

        
        
        
        try {
        	//GRB ENV
            //GRB MODEL
        	GRBEnv env = new GRBEnv();
			GRBModel model = new GRBModel(env);
			//GRB VARIABLES
			GRBVar IE= model.addVar(0, 1, 0, GRB.BINARY, IE246.name);
			GRBVar ENG= model.addVar(0, 1, 0, GRB.BINARY, ENG101.name);
			GRBVar FE= model.addVar(0, 1, 0, GRB.BINARY, FE101.name);
			GRBVar HIST= model.addVar(0, 1, 0, GRB.BINARY, HIST201.name);
			GRBVar MATH= model.addVar(0, 1, 0, GRB.BINARY, MATH215.name);
			
			//GRB Objective
			GRBLinExpr expr = new GRBLinExpr(); 
			expr.addTerm(IE246.hardness*IE246.size, IE);//42 0 1= 42
			expr.addTerm(ENG101.hardness*ENG101.size, ENG);//20 0 1= 0
			expr.addTerm(FE101.hardness*FE101.size, FE);//2 0 1= 2
			expr.addTerm(HIST201.hardness*HIST201.size, HIST);//12 0 1=12
			expr.addTerm(MATH215.hardness*MATH215.size, MATH);//24 0 1=0
														//minimum
			model.setObjective(expr, GRB.MINIMIZE);

			//GRB Constraints
			GRBLinExpr con = new GRBLinExpr(); 
				con.addTerm(6, IE);
				con.addTerm(4, ENG);
				con.addTerm(2, FE);
				con.addTerm(3, HIST);
				con.addTerm(4, MATH);
			model.addConstr(con, GRB.GREATER_EQUAL, 4, "Capacity constraint");

	        //Solve
			model.optimize();
			System.out.println("The optimal solution:");
			System.out.println(model.get(GRB.DoubleAttr.ObjVal));

			model.dispose();
			env.dispose();
		} catch (GRBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
        
        
    }
    
}
