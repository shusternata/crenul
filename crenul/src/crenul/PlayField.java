package crenul;

import java.util.ArrayList;

public class PlayField {
	private ArrayList<ArrayList<String>> field = new ArrayList<>();
	public PlayField(){
		System.out.println("������� ����� ����...");
		for(int i = 0; i < 3; i++){
			ArrayList<String> str = new ArrayList<String>(3);
			field.add(str);
			System.out.println("��������� ������: " + i);
		}
		System.out.println("������");
	}

}
