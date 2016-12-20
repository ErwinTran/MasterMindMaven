package ch.bbw.mastermind;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

	public Row generatePattern(int number){
		Row row = new Row();
	    List<Pin> list = new ArrayList<Pin>();
	    
	    Random ran = new Random();
	    for(int i = 0;i<number;i++){
	    
	    	int ranNumber = ran.nextInt(7);
	    	list.add(new Pin(ranNumber));
	    }
	    
	    row.setPinList(list);
		return null;
	}
	
	public boolean checkRow(Row pattern, Row row){
		List<Boolean> trues = new ArrayList<Boolean>();
		for(int i = 0; i < pattern.getPinList().size(); i++){
			if(pattern.getPinList().get(i) == row.getPinList().get(i)){
				trues.add(true);
			}
			else{
				trues.add(false);
			}
		}
		return false;
	}
}
