/** Ohjelma tarkistaa kuinka monta numeroa on oikein/v��rin.*/
public class tarkistaNumerot  {  
	public static void lottorivinTarkistus(int[] numerot, int[] lottoNumerot, int onnenapila, int tuleekoOnnenapila) {
		System.out.println("T��ll� tarkistetaan lottorivi!");
		
		// Kaikki taulukoiden arvot n�ytt�v�t tulevan hyvin t�nne :)
		// Jos k�ytt�j� ei valinnut onnenapilaa, sen arvo on 0.
				
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
			System.out.println("Voitit: " + " �");
		}
}