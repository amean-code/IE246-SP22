
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Execute {
	 // Agent, profit, taskID
	//create a hashmap wh'ch holds 2 values
	//create a hashmap and put a hashmap in it, i can hold 3 values
	// 
	
	static HashMap <Agent,Integer> correl;
	static HashMap <String,HashMap <Agent,Integer>> threeData = new HashMap <String,HashMap <Agent,Integer>>(); 
	static ArrayList<Agent> agents = new ArrayList<Agent>();

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		/*
		 * 	Server: sql11.freemysqlhosting.net
			Name: sql11491183
			Username: sql11491183
			Password: Hv2apFdAci
			Port number: 3306
		 */
		Connection con = null;
		String url = "jdbc:mysql://sql11.freemysqlhosting.net";
		String username = "sql11491183";
		String password = "Hv2apFdAci";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connected!");
		
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from sql11491183.agent");
		ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
		
		int numberOfColumns = resultSetMetaData.getColumnCount();
		
		for(int i=0;i<numberOfColumns;i++)
		{
			System.out.println("Column "+(i+1) + "-> name "+resultSetMetaData.getColumnName(i+1)+" -> type "+resultSetMetaData.getColumnTypeName(i+1));
		}
		
		while(resultSet.next())
		{
			Agent temp = new Agent(resultSet.getString(1),resultSet.getString(3),resultSet.getDouble(2),resultSet.getBoolean(4));
			agents.add(temp);
			System.out.println(resultSet.getString(1)+"\t"+resultSet.getDouble(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getBoolean(4));
		}
		
		
		resultSet = statement.executeQuery("select * from sql11491183.profit");
		resultSetMetaData = resultSet.getMetaData();
		
		numberOfColumns = resultSetMetaData.getColumnCount();
		
		for(int i=0;i<numberOfColumns;i++)
		{
			System.out.println("Column "+(i+1) + "-> name "+resultSetMetaData.getColumnName(i+1)+" -> type "+resultSetMetaData.getColumnTypeName(i+1));
		}
		
		int rows=0;
		while(resultSet.next())
		{
			//creating our hashmap everytime a new line comes
			correl = new HashMap <Agent,Integer>();
			//putting the agetns with the profits
			correl.put(getAgent(agents,resultSet.getString(1)),resultSet.getInt(3));
			//putting the taskids and agents and profits
			threeData.put(resultSet.getString(2), correl);
			//System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getInt(3));
			rows++;
		}
		System.out.println(rows);
		
		System.out.println("========================================");
		System.out.println("========================================");
		//getting all the taskIDs from our hashmap
		int counter=0;
		for(String x: threeData.keySet()) {
			//System.out.println(threeData.get(x));
			counter++;
			//pronting the first agents' tasks and Profıts
			for(Agent s : agents) {
				if(threeData.get(x).get(s)!=null) {
					System.out.println("Profit "+threeData.get(x).get(s));
				}
			

			}

		}
		System.out.println(counter+" is taskId count");

		// In response to a question in class:
		int[] col = readCSVColumn(2,',');
				
	}

	public static Agent getAgent(ArrayList<Agent> x , String ID) {
		for(Agent temp : x) {
			if(temp.ID.equals(ID)){
				System.out.println(temp.ID);
				return temp;
			}
		}
		return null;
	}
	
	private static int[] readCSVColumn(int i, char c) {
		// while(there is a line to read) 
		//   	readLine()
		//  	split(c)
		//  	go to i-th loc (col)
		//  	add this value to an arraylist (if does not exist add null)
		// copy that arraylist to an array and return
		return null;

	}
	
	
}

class Agent{
	//attributes
	String ID;
	String name;
	double capacity;
	boolean ispartial;
	//constructor
	public Agent(String id, String n, double c, boolean b) {
		this.ID=id;
		this.name=n;
		this.capacity=c;
		this.ispartial=b;
	}
	//behaviours
	
}















