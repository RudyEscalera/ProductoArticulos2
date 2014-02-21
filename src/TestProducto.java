import static org.junit.Assert.*;

import org.junit.Test;


public class TestProducto {
	Servicio nuevo=new Servicio(2,5);
	@Test
	public void test() {
		assertEquals(2,nuevo.Costoporcobrar(),0.00);
	}
}
