class TestBox {

	public static void main (String[] args) {
		Box box = new Box(2.5, 5.0, 6.0);

		System.out.println("Area: " + box.area() + " volume: " + box.volume());
		System.out.printlnl("Area: " + smallerBox.area());

		biggerBox = box.biggerBox();

		System.out.println("Area: " + box.area() + " volume: " + box.volume());
		System.out.println("Area: " + biggerBox.area());
	}

}