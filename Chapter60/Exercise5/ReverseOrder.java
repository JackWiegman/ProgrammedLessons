public class ReverseOrder {

	public static void main (String[] args) {
		int[] val = {0,1,2,3};
		int temp;
		int[] reverse = {0,0,0,0};

		System.out.println( "Original Array: " 
        	+ val[0] + " " + val[1] + " " + val[2] + " " + val[3] );

		for (int i = 0; i < 4; i++) {
			reverse[3 - i] = val[i];
		}

		System.out.println( "Reversed Array: " 
        	+ reverse[0] + " " + reverse[1] + " " + reverse[2] + " " + reverse[3] );

	}

}