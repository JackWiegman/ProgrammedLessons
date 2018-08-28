import java.text.*;

public class SinTable {

	public static void main(String[] args) {
		DecimalFormat form = new DecimalFormat("0.000000");
		DecimalFormat zero = new DecimalFormat("0.0");
		double angle = 105.0;

		while (angle >= -105.0) {
			angle = angle - 15;
			double radians = angle * (Math.PI/180);
			double sinx = Math.sin(radians);

			if (-15.0 >= angle && angle > -105.0) {
				System.out.println(angle + "\t" + form.format(sinx));
			} 
			else if (90.0 >= angle && angle >= 15.0) {
				System.out.println(" " + angle + "\t" +  " " + form.format(sinx));
			}
			if (angle == 0.0) {
				System.out.println("  " + angle + "\t" + " " + form.format(sinx));
			}
		}
	}

}