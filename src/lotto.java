/**Kaikki tai ei mitään lotto
 * @author Karolina
 * @author Jenna
 */

import java.util.Scanner;

public class lotto {

private static final Scanner lukija = new Scanner(System.in);
	public static void main(String[] args) {
		
		/**Ohjeet ja pelin esittely.
		 * Käyttäjä valitsee arvotaanko numerot vai valitseeko käyttäjä itse.
		 * @valinta Lukee ja tallentaa käyttäjän vastauksen.
		 * */
		System.out.println("Tervetulo pelaamaan Kaikki tai ei mitään lottoa!");
		System.out.println("Valitse 12 numeroa 1-24 numeron välillä tai arvo numerot.");
		
		int valinta;
		
		/** Suoritetaan numeroiden arvonta tai käyttäjä valisee numerot itse.
		 * kutsutaan metodia käyttäjän valinnan mukaan.
		 * Jos käyttäjän syöttämä luku on pienempi kuin yksi, tai suurempi kuin kaksi käyttäjä valitsee uuden luvun.
		 * @case 1 käyttäjä valitsee itse numerot.
		 * @acase 2 numerot arvotaan.
		 * @valitseNumerot.myMethod Metodia kutsuttaessa käyttäjä valitsee itse numerot.
		 * @arvoNumerot.myMethod Metodia kutsuttaessa numerot arvotaan.*/
		int numerot[] = new int[13];
		do {
			System.out.println("1) Valitse numerot 2) Arvo numerot.");
			valinta = lukija.nextInt();
			
			switch (valinta) {
			case 1:
				System.out.println("Valitsit 1");
				numerot = valitseNumerot.myMethod();
				break;
			case 2:
				System.out.println("Valitsit 2");
				numerot = arvoNumerot.myMethod();
				
				System.out.println(" ");
				System.out.println("Arvotut lotto numerosi");
				for (int i = 1; i < numerot.length; i++)
					System.out.print(numerot[i] + " ");
				break;
				
			}
		} while (valinta != 1 && valinta != 2);
		
		System.out.println(" ");
		valitsePanos();
		
		int lottonumerot[] = arvoNumerot.myMethod();
		System.out.println(" ");
		System.out.println("Tässä on oikeat numerot");
		
		for (int i = 1; i < lottonumerot.length; i++)
			System.out.print(lottonumerot[i] + " ");

	}
	
	public static double valitsePanos() {
		/** Käyttäjä valitsee panoksen 1 € ja 5 € väliltä.
		 * @panos Tallentaa käyttäjän panoksen.
		 * @return Palauttaa panoksen määrän.
		 */
		System.out.println(" ");
		System.out.println("Valitse panos 1 € ja 5 € väliltä.");
		double panos = lukija.nextDouble();
		
		System.out.println("Panoksesi on " + panos + " €.");
		
		return panos;
	}

}
