/** Ohjelma tarkistaa kuinka monta numeroa on oikein/v‰‰rin.*/

public class tarkistaNumerot {
	public static void lottorivinTarkistus(int[] numerot, int[] lottoNumerot, int onnenapila, int oikeaOnnenapila, double panos) {
		
		System.out.print("\n");
		System.out.println("Pelaamasi lottorivi: ");
		
		/** Tulostetaan arvottu lottorivi */
		for (int i = 0; i < numerot.length; i++)
			System.out.print(numerot[i] + " ");
	
			if (onnenapila != 0) {
			System.out.print("+ " + onnenapila);
			}
			
			System.out.print("\n");
			
			int oikein = 0;
			
			/** Pelaajan numerot */
			numerot.clone();
			
			/** Oikeat numerot*/
			lottoNumerot.clone();
			
			int[] osumat = new int[12];
			
			/** Pelaajan numerot verrataan oikein arvottuihin numeroihin */
			for (int i = 0; i < lottoNumerot.length; i++) {
				for (int j = 0; j < numerot.length; j++) {
					if (lottoNumerot[i] == numerot[j]) {
						oikein++;
						osumat[oikein] = lottoNumerot[i];
					}
				}
			}
			System.out.print("\n");
			
			if (onnenapila == oikeaOnnenapila) {
				System.out.println("Sinulla on " + oikein + " numeroa ja onnenapila oikein.");
			} else {
				System.out.println("Sinulla on " + oikein + " numeroa oikein.");
			}
			
			/** Tulostetaan numerot jotka olivat oikein */
			System.out.print("Osumat: ");
			for (int i : osumat) {
				if (i != 0) {
					System.out.print(i + " ");
				}
			}
			if (onnenapila == oikeaOnnenapila) {
				System.out.print("+ " + onnenapila);
			}
			
			System.out.print("\n");
			
			if(oikein == 0 || oikein == 12) {
				if (onnenapila == oikeaOnnenapila) {
					System.out.println("Voitit: " + ((panos * 125000) * 4) + " Ä");
				} else {
					System.out.println("Voitit: " + (panos * 125000) + " Ä");
				}
			} else if (oikein == 1 || oikein == 11) {
				if (onnenapila == oikeaOnnenapila) {
					System.out.println("Voitit: " + ((panos * 250) * 4) + " Ä");
				} else {
					System.out.println("Voitit: " + (panos * 250) + " Ä");
				}
			} else if (oikein == 2 || oikein == 10) {
				if (onnenapila == oikeaOnnenapila) {
					System.out.println("Voitit: " + ((panos * 25) * 4) + " Ä");
				} else {
					System.out.println("Voitit: " + (panos * 25) + " Ä");
				}
			} else if (oikein == 3 || oikein == 9) {
				if (onnenapila == oikeaOnnenapila) {
					System.out.println("Voitit: " + ((panos * 5) * 4) + " Ä");
				} else {
					System.out.println("Voitit: " + (panos * 5) + " Ä");
				}
			} else if (oikein == 4 || oikein == 8) {
				if (onnenapila == oikeaOnnenapila) {
					System.out.println("Voitit: " + ((panos * 1) * 4) + " Ä");
				} else {
					System.out.println("Voitit: " + (panos * 1) + " Ä");
				}
			} else {
				if (onnenapila == oikeaOnnenapila) {
					System.out.println("Voitit: " + ((panos * 1) * 4) + " Ä");
				} else {
				System.out.println("Voitit: " + "0 Ä");
				}
		}
	}
}
