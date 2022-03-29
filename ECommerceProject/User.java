import java.util.Random;
import java.util.Scanner;

public class User {
	
	// CONSTANTS
	int ID_LENGTH = 15;
	
	// attributes
	private String id,username,password,role;
	private String name,surname;
	private int age,TCKN;
	
	
	
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

}
