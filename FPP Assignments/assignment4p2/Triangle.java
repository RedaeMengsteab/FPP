package assignment4p2;
import java.util.Arrays;

public final class Triangle extends ClosedCurve {
	/** base and height variables are defined so that height <= base */
	private final double base;
	private final double height;
	
	@SuppressWarnings("unused")
	/** sides of the triangle, defined so that side1 <= side2 <= side3 */
	private final double side1, side2, side3;
	private static final double DEFAULT_SIDE = 5.0;
	
		public Triangle(double base, double height){
		if (height <= base) {
			this.base = base;
			this.height = height;
		} 
		else {
			this.base = height;
			this.height = base;
		}
		side1 = height;
		side2 = base;
		side3 = Math.sqrt(base * base + height * height);	
		//verify during development and testing that postconditions are met
		assert(side1 <= side2 && side2 <= side3);
		assert(height <= base);
	}
	
	
	public Triangle(double s1, double s2, double s3)  {
		double[] arr = {s1, s2, s3};
		Arrays.sort(arr);		
		double x = arr[0];
		double y = arr[1];
		double z = arr[2];
		if(x + y < z) {
			//TODO: Throw an exception here...
			System.out.println("Illegal sizes for a triangle: " + s1 + ", " + s2+", " + s3);
			System.out.println("Creating an equilateral triangle with side = " + DEFAULT_SIDE);
			x = y = z = DEFAULT_SIDE;
		}
		side1 = x;
		side2 = y;
		side3 = z;
		double u = (y * y - x * x + z * z)/(2 * z);
		double h = Math.sqrt(y * y - u * u);
		base = z;
		height = h;	
		assert(side1 <= side2 && side2 <= side3);
		assert(height <= base);
	}
	public double computeArea() {
		return (0.5 * base * height);
	}

}
