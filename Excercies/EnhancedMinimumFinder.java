package Excercies;

public class EnhancedMinimumFinder {

	public static void main(String[] args) {
		
        // Find the median of a set of given numbers.
		// java RunWeek5 3 4 15.5
		// Median is 4.0
		// java RunWeek5 3 4 5 15
		// Median is 4.5
		// java RunWeek5 3.3 4.5 6.6
		// Median is 4.5
        double[] input = {23,-25,346.32};
		System.out.println("Nth Min number: "+  nthminimum(input, 1));

	}
	

	public static double nthminimum(double[] data, int order) 
	// data = 23 -25 346.32
	// order = 1
	{
		double minValue = Double.MAX_VALUE; // sonsuz
		int minIndex=0; // 0
		
		boolean[] pin = new boolean[data.length]; // false false false
		
		for(int count=0; count<order ; count++) // 0
		{
			minIndex = nextMinFinder(data, pin);
			minValue = data[minIndex];
			pin[minIndex] = true;
		}
		//right here, how many pin's are true if order is 3? The answer is 3 :) 
		return minValue;
	}

    public static int nextMinFinder(double[] array,boolean[] pin){


            double minValue = Double.MAX_VALUE; // sonsuz
			int minIndex=0; // 0
			for (int i=0;i<array.length;i++) // i = 0
			{
				if(array[i]<minValue && !pin[i]) {
					minValue=array[i];
					minIndex = i;
				}
			}

            return minIndex;

    }
 

}