package ch.bbw.mastermind;

import java.util.List;

public class Row {

	
	private List<Pin> pinList;

	public List<Pin> getPinList() {
		return pinList;
	}

	public void setPinList(List<Pin> pinList) {
		this.pinList = pinList;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		for(Pin pin : pinList) {
			result = result + pin.getValue();
		}
		
		return result;
	}
}
