class Reversal2 {

	public static void main(String[] args) {
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] result = new int[data.length];

		int temp = 0;

		for (int i = 0; i < result.length / 2; i++) {
			temp = data[i];
			result[i] = data[(data.length - 1) - i];
			result[(result.length - 1) - i] = temp;
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}