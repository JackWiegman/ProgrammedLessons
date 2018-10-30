public class Box {

	private double width, height, length, side;

	public Box(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	public double volume() {
		return width * length * height;
	}

	public double area() {
		return 2 * ((width * length) + (height * length) + (height * width));
	}

}