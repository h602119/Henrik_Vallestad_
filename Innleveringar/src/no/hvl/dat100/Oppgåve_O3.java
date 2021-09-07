package no.hvl.dat100;
//Her skal eg lage eit program som skriv ut fakultetet av eit gitt tal, f.eks 5! (5 fakultet)
import static javax.swing.JOptionPane.*;

public class Oppgåve_O3 {
	public static void main(String[] args) {

//		int a = 5; (Her er tankeprosessen bak)
//		int b = a;
//		for(int i = 1; i < b; i++) {
//			a *= i;
//			System.out.println(a);
//		}

		int n = Integer.parseInt(showInputDialog("Velg n"));
		int m = n;
		String printTekst = "";
		
		if (n > 0) {
			for (int i = 1; i < m; i++) {
				n *= i;
				printTekst = m + " fakultet gir " + n;

			}
		} else {
			showMessageDialog(null, "Velg ein verdi som er større en 0");
		}

		showMessageDialog(null, printTekst);
	}
}
