
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDesign();
	}
	
	// Method printDesign
	public static void printDesign() {
		
		
		// For - Rows
		for(int rowCount = 0 ; rowCount < 5 ; rowCount++) {
			
			// Dash 5 4 3 2 1
			for(int j = 0 ; j < 5 - rowCount ; j++) {
				System.out.print("-");		
			}
			
			// Number increase 2
			
			for(int j = 0; j < 1 + 2 * rowCount ; j++) {
				System.out.print(1 + 2 * rowCount);
			}
			
			// Dash 5 4 3 2 1
			for(int j = 0 ; j < 5 - rowCount ; j++) {
				System.out.print("-");		
			}
		
			// Next Line
			System.out.println();	
		}
		
	}

}
