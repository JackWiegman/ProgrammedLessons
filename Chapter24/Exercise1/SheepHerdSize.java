public class SheepHerdSize {

	public static void main(String[] args) {
		double power = 0;
		double n = 0;
		double t = 0;
		for (int i = 0; i <= 25; i++) {
			n = 220/(1+10 * (power));
			t = i;
			System.out.println("For " + t + " years, there will be " + Math.round(n) + " sheep.");
			if (i == 0) {
				power = 0.83;
			} else {
				power *= 0.83;
			}
		}
	}

}