import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		
//		printTriangeType(5,7,7);
//		printTriangeType(6,6,6);
//		printTriangeType(5,7,8);
//		printTriangeType(12,18,12);
		
//		getAndTestTriangle();
		
		args_test(args);
		
	}
	
	// New Method
	public static void getAndTestTriangle() {
		
		// Scanner
		Scanner scan = new Scanner(System.in);
		// Get Side Lengths
		System.out.println("Side 1:");
		int a = scan.nextInt();
		System.out.println("Side 2:");
		int b = scan.nextInt();
		System.out.println("Side 3:");
		int c = scan.nextInt();
		
		// Test
		printTriangeType(a,b,c);
		
	}
	
	// Args
	public static void args_test(String[] args) {
		
		// Check length of args
		if(args.length != 3) {
			System.out.println("Please provide the correct inputs!!");
			return;
		}
		
		// Parse Int
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		// Test
		printTriangeType(a,b,c);
		
		
	}
	
	// Print Method
	public static void printTriangeType(int s1, int s2, int s3) {
		
		// equilateral - osisceles - scalene
		
		
		// equilateral => s1 == s2 == s3
		if(s1 == s2 && s1 == s3 && s2 == s3) {
			System.out.println("equilateral");
		}// isoscales => s1 == s2 || s1 == s3 || s2 == s3 (any two sides)
		else if(s1 == s2 || s1 == s3 || s2 == s3) {
			System.out.println("isoscales");
		}else {// scalane => s1 != s2 != s3
			System.out.println("scalane");
		}
		
		
		
		
		
	}

}
