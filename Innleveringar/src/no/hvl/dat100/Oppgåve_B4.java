package no.hvl.dat100;

//	I dette programmet skal ein finne ut kva for gruppe/trinn ein tilhøyrer
//	med tanke på kva ein tjener
import static javax.swing.JOptionPane.*;

public class Oppgåve_B4 {
	public static void main(String[] args) {
		int brutto = Integer.parseInt(showInputDialog("Kva er din totale inntekt i brutto? "));

		double sats = 0.0;
		int trinn = 0;
		double skatt = 0.0;

		if (brutto <= 164100) {
			sats = 0.00;
		} else if (brutto >= 164101 && brutto <= 230950) {
			sats = 0.0093;
			trinn = 1;
			skatt = brutto * sats;
		} else if (brutto >= 230951 && brutto <= 580650) {
			sats = 0.0241;
			trinn = 2;
		} else if (brutto >= 580651 && brutto <= 934050) {
			sats = 0.1152;
			trinn = 3;
		} else {
			sats = 0.1452;
			trinn = 4;
		}

		skatt = brutto * sats;

		String utTekst = "I år har du tjent " + brutto + "kr \n du har då ein trinnsats på; " + sats * 100 + "%"
				+ "\n Dette betyr at du tilhører trinn " + trinn + "\n og at du betaler " + skatt + "kr i skatt";
		showMessageDialog(null, utTekst);

		System.out.println("Brutto; " + brutto + "\nTrinnsats; " + trinn + "\nSkatt i %; " + sats + " = " + sats * 100
				+ "%" + "\nSkatt i kr; " + skatt);
	}
}
