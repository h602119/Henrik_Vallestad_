package no.hvl.dat100;

//I denne oppg�va skal eg finne ut kva karakter ein elev f�r basert p� poenga
//Dette skal gjenta seg 10 gonger og ein ugyldig karakter skal ikkje telle som ei registering
import static javax.swing.JOptionPane.*;

public class Oppg�ve_B5 {
	public static void main(String[] args) {
		String karakter = "";

		for (int i = 1; i <= 10; i++) {
			String poengTxt = showInputDialog("Kor mange poeng fekk du? ");
			int poeng = Integer.parseInt(poengTxt);

			if (poeng >= 0 && poeng <= 39) {
				karakter = "F";
			} else if (poeng >= 40 && poeng <= 49) {
				karakter = "E";
			} else if (poeng >= 50 && poeng <= 59) {
				karakter = "D";
			} else if (poeng >= 60 && poeng <= 79) {
				karakter = "C";
			} else if (poeng >= 80 && poeng <= 89) {
				karakter = "B";
			} else if (poeng >= 90 && poeng <= 100) {
				karakter = "A";
			} else {
				karakter = "UGYLDIG!";
				i--;
			}
			System.out.println(poeng + " poeng gir karakter " + karakter);
		}

	}
}
