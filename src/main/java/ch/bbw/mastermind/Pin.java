package ch.bbw.mastermind;

public class Pin {

	private int value;

	Pin(int value) {
		this.value = value;
	}
	
	Pin(char value) {
		int temp = Character.getNumericValue(value);
		if(temp <= 0 || temp > 9) {
			temp = 0;
		}
		this.value = temp;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		
		return "Value: " + value;
	}
}
