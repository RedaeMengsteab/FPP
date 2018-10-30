package assignment3p4;

public final class Circle {
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
		
	}
	public double computeArea() {
	return Math.PI *Math.pow(radius,2);	
	}
	
	public double getRadius() {
		return radius;
	}
	

}
