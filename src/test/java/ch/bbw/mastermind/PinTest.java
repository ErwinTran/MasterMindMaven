package ch.bbw.mastermind;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ch.bbw.mastermind.Pin;

public class PinTest {
	
	@Test
	public void testInstancingPinsWithChar() {
		// test instances of pins with valid parameters
		
		Pin pin1 = new Pin('1');
		Pin pin2 = new Pin('5');
		Pin pin3 = new Pin('9');
		
		assertTrue(pin1.toString().equals("Value: 1"));
		assertTrue(pin2.toString().equals("Value: 5"));
		assertTrue(pin3.toString().equals("Value: 9"));
	}
	
	@Test
	public void testInstancingPinsWithInt() {
		// test instances of pins with valid parameters
		
		Pin pin1 = new Pin(1);
		Pin pin2 = new Pin(4);
		Pin pin3 = new Pin(8);
		
		assertTrue(pin1.toString().equals("Value: 1"));
		assertTrue(pin2.toString().equals("Value: 4"));
		assertTrue(pin3.toString().equals("Value: 8"));
	}
	
	@Test
	public void testInstancingWithInvalidValues() {
		// Pin converts alphabets or other characters to 0
		
		Pin pin1 = new Pin('!');
		Pin pin2 = new Pin('d');
		Pin pin3 = new Pin('ä');
		
		assertTrue(pin1.toString().equals("Value: 0"));
		assertTrue(pin2.toString().equals("Value: 0"));
		assertTrue(pin3.toString().equals("Value: 0"));
	}
	
}
