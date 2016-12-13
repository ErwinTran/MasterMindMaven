package ch.bbw.calc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PinTest {
	
	@Test
	public void testInstance_01() {
		// test instances of pins with valid parameters
		
		Pin pin1 = new Pin('1');
		Pin pin2 = new Pin('5');
		Pin pin3 = new Pin('9');
		
		assertTrue(pin1.toString().equals("Value: 1"));
		assertTrue(pin2.toString().equals("Value: 5"));
		assertTrue(pin3.toString().equals("Value: 9"));
	}
}
