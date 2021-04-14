/** K‰ytt‰j‰ valitsee numerot.*/

import java.util.Scanner;

public class valitseNumerot {
	
		private static final Scanner lukija = new Scanner(System.in);
		
		public static void myMethod() {
			/** Kysyt‰‰n k‰ytt‰j‰lt‰ luvut jotka ovat v‰lilt‰ 1 ja 24,
			 * jos k‰ytt‰j‰ syˆtt‰‰ numeron joka on jos valittu, tai on pienempi kuin 1 tai suurempi kuin 24,
			 * kysyt‰‰n k‰ytt‰j‰lt‰ uusi luku.
			 * @numerot Tallennetaan taulukkoon k‰ytt‰j‰n valitsemat numerot.
			 * @numero Luodaan muuttuja johon tallennetaan numero.
			 */
			int[] numerot = new int[13];
			int numero;
			
			for (int i = 0; i < 13; i++) {
				do {
				System.out.println("Syˆt‰ " + (i + 1) + ". numero: ");
				
				numero = lukija.nextInt();
				
					if (numero <= 0) {
						System.out.println("Valitse numero joka on suurempi kuin 1: ");
						numero = lukija.nextInt();
					}
					else if (numero > 24) {
						System.out.println("Valitse numero joka on pienempi kuin 24: ");
						numero = lukija.nextInt();
					}
					
				} while (numero <= 0 && numero > 24);
				
				/** K‰yd‰‰n numerot lista l‰pi ja tarkistetaan ettei numeroa ole jo valittu.*/
				for (int x = 0; x < i; x++) {
					if (numerot[x] == numero) {
						System.out.println("Et voi valita numeroa jonka olet jo valinnut.");
						
						/** Tulostetaan k‰ytt‰j‰lle numerot jotka ovat jo valittuna.
						 * Poistetaan tulostuksesta listan tyhj‰t (0) kohdat.*/
						System.out.print("Valitut numerot: ");
						for (int j : numerot) {
							if (j != 0) {
								System.out.print(j + " ");
							}
						}
						System.out.println("");
						
						/** K‰ytt‰j‰ valitsee uuden numeron.*/
						System.out.println("Valitse uusi numero: ");
						numero = lukija.nextInt();
					}
				}
				
				numerot[i] = numero;
			}
			/** Tulostetaan k‰ytt‰j‰n valitsemat lottonumerot */
			
			System.out.println("Valitsemasi lottonumerot: ");
			for (int i : numerot) {
					System.out.print(i + " ");
			}
			System.out.println("");
			
		}
	}