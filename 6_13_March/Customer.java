
public class Customer {

	// MAIN METHOD
	public static void main(String[] args) {
	
		// CUSTOMER - 500 Customers
				Customer c1 = new Customer();
				Customer c2 = new Customer();
				Customer c3 = new Customer();
				Customer c4 = new Customer();
				// Update Attribute
				c1.name = args[0];
				c2.name = args[1];
				c3.name = args[2];
				c4.name = "Ada";
				
				c1.setSalary(1355);
				c2.setSalary(15);
				c3.setSalary(-23524);
				c4.setSalary(100);
				
				c1.age = 21;
				c2.age = 26;
				c3.age = 30;
				c4.age = 11;
				
				c1.sayHello();
				c2.sayHello();
				c3.sayHello();
				c4.sayHello();
		
	}
	
	// Attributes - 10 Attributes
	String name;
	private double salary = 0; // in USD
	int age;
	
	// Behaviour
	public void calculateSalaryTRY(double rate) {
		// Receive the exchange rate as parameter
		
		// calcualte the salary in TRY
		double salaryTRY = salary * rate;
		
		// print
		System.out.println("Salary (TRY): "+ salaryTRY);
	}
	
	public void sayHello() {
		System.out.println("Hi I'm a customer! My name is " + this.name);
		System.out.println("I'm "+this.age+" years old.");
		this.calculateSalaryTRY(15);
	}
	
	public void setSalary(double newSalary) {
		if(newSalary < 100) {
			newSalary = 100;
		}
		this.salary = newSalary;
	}

}
