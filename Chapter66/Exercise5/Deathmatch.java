class Firefly {

	public double xLoc, yLoc, zLoc;
	public boolean alive;
	public double min = -10.0;
	public double max = 10.0;

	public Firefly (double xLoc, double yLoc, double zLoc, boolean alive) {

		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.zLoc = zLoc;
		this.alive = alive;
	}

	public void kill() {
		this.alive = false;
	}

	public double getxLoc() {return xLoc;}
	public double getyLoc() {return yLoc;}
	public double getzLoc() {return zLoc;}
	public boolean getAlive() {return this.alive;}

	public void move() {

		xLoc += getRandomDouble(-1.0, 1.0);
		yLoc += getRandomDouble(-1.0, 1.0);
		zLoc += getRandomDouble(-1.0, 1.0);

		if (xLoc > max) {xLoc = max;}
		else if (xLoc < min) {xLoc = min;}

		if (yLoc > max) {yLoc = max;}
		else if (yLoc < min) {yLoc = min;}

		if (zLoc > max) {zLoc = max;}
		else if (zLoc < min) {zLoc = min;}

	}


	public double getRandomDouble(double min, double max) {
		double num = (Math.random()*((max-min)+1))+min;
		return num;
	}

}


class BuildFireflies {

	int numberFireflies = 1000;

	public Firefly[] warriors;

	public double getRandomDouble(double min, double max) {
		double num = (Math.random()*((max-min)+1))+min;
		return num;
	}

	public BuildFireflies() {
		double min = -10.0;
		double max = 10.0;
		warriors = new Firefly[numberFireflies];

		for (int i = 0; i < warriors.length; i++) {
			warriors[i] = new Firefly(getRandomDouble(min, max), getRandomDouble(min, max), getRandomDouble(min, max), true);
		}

	}

	public int getLength() {
		return warriors.length;
	}

	public Firefly getEntry(int x) {
		return warriors[x];
	}

	public boolean checkKillRadius (Firefly fly1, Firefly fly2) {
		double xDist = fly1.getxLoc() - fly2.getxLoc();
		double yDist = fly1.getyLoc() - fly2.getyLoc();
		double zDist = fly1.getzLoc() - fly2.getzLoc();

		double totDistance = Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2) + Math.pow(zDist, 2));

		if (totDistance < 1.0) {
			return true;
		}

		return false;
	}

}


public class Deathmatch {

	public static void main(String[] args) {
		BuildFireflies flies = new BuildFireflies();

		int killCount = 0;

		System.out.println("Fireflies alive: " + flies.getLength());

		int winner = -1;
		int moves = 0;

		while (killCount != flies.getLength() - 1) {
			for (int i = 0; i < flies.getLength(); i++) {
				if (flies.getEntry(i).getAlive()) {
					flies.getEntry(i).move();
					moves++;
					System.out.println("Total Moves: " + moves);

					for (int j = 0; j < flies.getLength(); j++) {
						if (j != i && flies.getEntry(j).getAlive()) {
							if (flies.checkKillRadius(flies.getEntry(i), flies.getEntry(j))) {
								flies.getEntry(j).kill();
								killCount += 1;
								System.out.println("Firefly " + i + " killed Firefly " + j);
								System.out.println("Fireflies alive: " + (flies.getLength() - killCount));
							}
						}

						if (killCount == flies.getLength() - 1) {
							winner = i;
						
						}
					}
				}
			}
		}

		System.out.println("Total Moves: " + moves);
		System.out.println("Winner: Firefly " + winner + "\nFinal Position: \nx: " + flies.getEntry(winner).getxLoc() + "\ny: " + flies.getEntry(winner).getyLoc() + "\nz: " + flies.getEntry(winner).getzLoc());

	}

}