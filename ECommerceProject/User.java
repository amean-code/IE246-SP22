package ECommerceProject;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class User {

	// MAIN
	public static void main(String[] args) {
		// // Test 6 - Save user as CSV File
		// User u = new User("eminkartci","123456");
		// u.saveUserCSV();

		// Tet 7 - Read User from CSV File
		User u = User.getUserCSV("eminkartci", "123456");
		System.out.println(u);
	}
	
	// CONSTANTS
	int ID_LENGTH = 15;
	String USER_PATH = "./db/user/";
	
	// attributes
	private String id,username,password,role;
	private String name,surname;
	private int age,TCKN;
	
	// STATICS

	
	// constructor
	public User(String username,String password) {
		
		// create a Random object for generation id
		Random rand = new Random();
		
		// initialize id
		this.id 		= "";
		
		// Add 15 random numbers 
		for(int i = 0 ; i  < ID_LENGTH ; i++) {
			this.id += rand.nextInt(10); // 0 1 2 3 ... 9
		}
		
		this.username 	= username;
		this.password 	= password;
		
		// Default
		this.role = "Guest";
	}
	
	public User(String username,String password, String name,String surname) {
		this(username,password);
		this.name = name;
		this.surname = surname;
		
	}
	
	public User(String username,String password, String name,String surname,String role) {
		this(username,password,name,surname);
		this.role =role;	
	}
	
	// behaviour
	public String toString() {
		
		
		String content = "-->| "+ this.id + " x " + this.role + " |<--" + "\n" 
						+"| Username : " + this.username + "\n" 
						+"| Password : **********" + "\n";
		
		if(this.name != null) {
			content += "| Name : "+ this.name + "\n";
		}
		
		if(this.surname != null) {
			content += "| Surname : "+ this.surname + "\n";
		}
		
		// Last Part
		content += "----------------------------------------" ;
		
		return content;
	}
	
	public void saveUserCSV(){

		try{

			// Define a BF to write a File
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(USER_PATH+"/"+this.username+".csv")));

			// Write the CSV Content
			bw.write(getCSVContent());

			// Close the file
			bw.close();

		}catch(IOException error){
			System.out.println("The user cannot be saved as CSV File!! : => "+ error.toString());
		}
		
	}

	public String getCSVContent(){

		String content = "User Name,Password\n"; // Titles

		content += this.username + "," + this.password + "\n";
		 

		// Return content
		return content;

	}
	
	// Getter Setter
	
	
	
	///////////////////////////////////////////////////////////////////////////////////
	
	// Static
	public static User newUser() {
		
		// Define a scanner to receive inputs
		Scanner scan = new Scanner(System.in);
		
		// Print title
		System.out.print("<----- Welcome to E-Commerce Panel ----->\n\nNEW USER\n----------\n");
		
		// Get new User Name
		System.out.print("| Username: "); String username = scan.nextLine();
		System.out.print("| Password: "); String password = scan.nextLine();
		
		User newUser = new User(username,password);
		
		return newUser;
	}

	public static User getUserCSV(String username,String password){

		User user;
			
		try{
			// check if there is a user
			BufferedReader br = new BufferedReader(new FileReader(new File("./db/user/"+username+".csv")));

			// Read content
			String titles = br.readLine();
			String[] data = br.readLine().split(",");

			if(data[1].equals(password)){
				System.out.println("Welcome "+ username +"! ");
				user = new User(data[0],data[1]);
			}else{
				System.out.println("username or password is incorrect!");
				return null;
			}
			

			// Return user
			return user;

		}catch(IOException e){
			System.out.println("There is no such a user :> " + username);
			return null;
		}		

	}

}
