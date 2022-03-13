
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1();
	}

	public static void question1() {
		
		//Declare variables
		double s0 = 12;
		double v0 = 3.5;
		double a = 9.8;
		int t = 10;
	
	
		// Calculate s = s0 + vo * t + 1/2 * a * t^2 
		double s = s0 + v0 * t + (1/2) * a * (t * t);
		
		// Print s
		System.out.println("s = " + s);
		
	}
}
