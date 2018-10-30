package assignment3p4;

public final class Rectangle {
	private double width;
	private double height;

	public Rectangle(double width, double hight) {
		this.width = width;
		this.height = hight;
	}

	public double computeArea() {
		return width * height;
	}

	public double getWidth() {
		return width;
	}

	public double getHight() {
		return height;
	}
	
	

}
