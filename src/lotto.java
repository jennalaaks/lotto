/**Kaikki tai ei mit‰‰n lotto
 * @author Karoliina
 * @author Jenna
 */

import java.util.Scanner;

public class lotto {

private static final Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {
		
		/**Ohjeet ja pelin esittely.
		 * K‰ytt‰j‰ valitsee arvotaanko numerot vai valitseeko k‰ytt‰j‰ itse.
		 * @valinta Lukee ja tallentaa k‰ytt‰j‰n vastauksen.
		 * */
		System.out.println("Tervetulo pelaamaan Kaikki tai ei mit‰‰n lottoa!");
		System.out.println("Valitse 12 numeroa 1-24 numeron v‰lill‰ tai arvo numerot.");
		
		int valinta;
		
		do {
			System.out.println("1) Valitse numerot 2) Arvo numerot.");
			valinta = lukija.nextInt();
			
			switch (valinta) {
			case 1:
				System.out.println("Valitsit 1");
				//valitseNumerot.myMethod();
				break;
			case 2:
				System.out.println("Valitsit 2");
				arvoNumerot.myMethod();
				break;
				
			}
		} while ((valinta <= 1) && (valinta >= 2));
		
		System.out.println("\n");
		System.out.println("Valitse panos 1 Ä ja 5 Ä v‰lilt‰.");
	}

}
