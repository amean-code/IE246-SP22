
public class Stutter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Test
		if(args.length == 0) {
			System.out.println("There is no input !!");
			return;
		}
		
		// Write
		writeTwice(args[0]);
	}
	
	// Stutter
	public static void writeTwice(String word){
		
		// word = H e l l o 
		//        0 1 2 3 4
		
		
		// Iterate the char
		for(int i = 0 ; i < word.length() ; i++) { // i = 2
			
			// print twice
			for(int j = 0; j < 2 ; j++) {
				System.out.print(word.charAt(i));
			}
		}
		
	}

}
