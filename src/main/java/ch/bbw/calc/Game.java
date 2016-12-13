package ch.bbw.calc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	private List<Row> rowList;
	private static Row pattern;
	private static Computer computer;
	private static int rowNumbers = 4;
	
	public static void main(String[] args) {
		computer = new Computer();
		pattern = computer.generatePattern(rowNumbers);
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("================");
			System.out.println("Write something:");
			Row row = readInput(in);
			computer.checkRow(pattern, row);
			printResult(row);
			System.out.println("================");
		}
		
	}
	
	public static Row readInput(Scanner in){
	    String input = in.nextLine();
	    
	    Row row = new Row();
	    List<Pin> list = new ArrayList<Pin>();
	    
	    for(int i = 0; i < input.length(); i++) {
	    	list.add(new Pin(input.charAt(i)));
	    }
	    
	    row.setPinList(list);
	    return row;
	}
	
	public static void printResult(){
		System.out.println("hallo");
	}
	
	public static void printResult(Row row){
		System.out.println("Row: " + row);
	}
}
