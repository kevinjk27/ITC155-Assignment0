
public class UseShape {

	public static void main(String[] args) {
		Octagon stop = new Octagon(4);

		System.out.println("The area for the stop sign is "+ String.format("%.2f", stop.getArea()));
		System.out.println("The perimeter for the stop sign is "+ stop.getPerimeter());
		
		
	}

}
