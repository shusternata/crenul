package crenul;

import java.util.ArrayList;

public class PlayField {
	private ArrayList<ArrayList<String>> field = new ArrayList<>();
	public PlayField(){
		System.out.println("������� ����� ����...");
		for(int i = 0; i < 3; i++){
			ArrayList<String> str = new ArrayList<String>(3);
			for(int j = 0; j < 3; j++){
			str.add(" ");
			}	
			field.add(str);
			System.out.println("��������� ������: " + i);
		}
		System.out.println("������");
	}
    public void printField() {
    	System.out.println("  | 0 | 1 | 2 |");
    	System.out.println("________________");
    	System.out.print("a");
    	for(int i = 0; i < 3; i++){
    		System.out.print(" | " + field.get(0).get(i));	
    	}
    	System.out.println(" |");
    	System.out.print("b");
    	for(int i = 0; i < 3; i++){
    		System.out.print(" | " + field.get(1).get(i));	
    	}
    	System.out.println(" |");
    	System.out.print("c");
    	for(int i = 0; i < 3; i++){
    		System.out.print(" | " + field.get(2).get(i));	
    	}
    	System.out.println(" |");
    	
    }
}
