package crenul;

import java.util.ArrayList;

public class PlayField {
	private ArrayList<ArrayList<String>> field = new ArrayList<>();
	public PlayField(){
		System.out.println("Создаем новое поле...");
		for(int i = 0; i < 3; i++){
			ArrayList<String> str = new ArrayList<String>(3);
			for(int j = 0; j < 3; j++){
			str.add(" ");
			}	
			field.add(str);
			System.out.println("Добавлена строка: " + i);
		}
		System.out.println("Готово");
	}
    public void printField() {
    	System.out.println("\n  | 0 | 1 | 2 |");
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
    public boolean setCell(String str, String user){ 
    	String iString = str.substring(0, 1);
    	System.out.println(iString);
    	int i = -1;
    	switch(iString){
    	case "a":
    		i = 0;
    		break;
    	case "b":
    		i = 1;
    		break;
    	case "c":
    		i = 2;
    		break;
    	}
    	int j = Integer.parseInt(str.substring(1, 2));
    	System.out.println(j);
    	if(i<0 || i>2 || j<0 || j>2){
    		System.out.println("неправильный ввод");
    		return false;
    	}
    	if(field.get(i).get(j).equalsIgnoreCase(" ")){
    		field.get(i).add(j, user);
    		return true;
    	}
    	return false;
    }
}
