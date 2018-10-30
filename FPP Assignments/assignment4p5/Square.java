package assignment4p5;

public class Square implements Polygon {
	private final double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double[] getArrayOfSides() {
		double[] sides = { side, side, side, side };
		return sides;
	}

}
