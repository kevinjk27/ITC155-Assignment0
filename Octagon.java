
public class Octagon implements Shape {
	private double a;

	public Octagon(double a) {
		this.a = a;
	}

	// Returns the area of this octagon.
	public double getArea() {
		return 2.0 * ((1.0 + Math.sqrt(2)) * Math.pow(a, 2));
	}

	// Returns the perimeter of this octagon.
	public double getPerimeter() {
		return 8.0 * a;
	}

}
