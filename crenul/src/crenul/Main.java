package crenul;

public class Main {

	public static void main(String[] args) {
		PlayField field = new PlayField();
		field.printField ();
		field.setCell("a0", "x");
		field.printField ();

	}

}
