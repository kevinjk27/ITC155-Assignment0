import static org.junit.Assert.assertEquals;



import org.junit.Test;

public class ShapeTest {

	@Test
	public void testGetArea() {
		Octagon stop = new Octagon(4);
		assertEquals(77.25, stop.getArea(), 0.2f);
	}
	
	@Test
	public void testGetPerimeter() {
		Octagon stop = new Octagon(4);
		assertEquals(32.0, stop.getPerimeter(), 0.1f);
	}

}
