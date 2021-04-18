/** Ohjelma tarkistaa kuinka monta numeroa on oikein/v‰‰rin.*/
public class tarkistaNumerot  {  
	public static void lottorivinTarkistus(int[] numerot, int[] lottoNumerot, int onnenapila, int onnenApilanArvonta) {
		System.out.println("T‰‰ll‰ tarkistetaan lottorivi!");
		
		// Kaikki taulukoiden arvot n‰ytt‰v‰t tulevan hyvin t‰nne :)
		// Jos k‰ytt‰j‰ ei valinnut onnenapilaa, sen arvo on 0.
				
		System.out.print("\n");
		System.out.println("Arvotut lottonumerosi ovat:");
		/** Tulostetaan arvottu lottorivi */
		for (int i = 0; i < numerot.length; i++)
			System.out.print(numerot[i] + " ");
			System.out.print("+ " + onnenapila);
			System.out.print("\n");
			
			int oikein = 0;
			
			numerot.clone(); /** Pelaajan numerot */
			lottoNumerot.clone(); /** Oikeat numerot*/

			/** Pelaajan numerot verrataan oikein arvottuihin numeroihin */
			for (int i = 0; i < lottoNumerot.length; i++) {
			    for (int j = 0; j < numerot.length; j++) {
			        if (lottoNumerot[i] == numerot[j]) {
			            oikein++;
			            break;
			        }
			    }
			}
			System.out.print("\n");
			System.out.println("Sinulla on "+oikein+" numeroa oikein.");
			
			if(oikein == 0 || oikein == 12) {
				System.out.println("Voitit: " + "125 000 Ä");
			} else if (oikein == 1 || oikein == 11) {
				System.out.println("Voitit: " + "250 Ä");
			} else if (oikein == 2 || oikein == 10) {
				System.out.println("Voitit: " + "25 Ä");
			} else if (oikein == 3 || oikein == 9) {
				System.out.println("Voitit: " + "5 Ä");
			} else if (oikein == 4 || oikein == 8) {
				System.out.println("Voitit: " +oikein*1 + " Ä");
			} else {
				System.out.println("Voitit: " + "0 Ä");
			
			
			
	}
}
}
