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
		System.out.println(" ");
		
		int valinta;
		
		/** Suoritetaan numeroiden arvonta tai käyttäjä valisee numerot itse.
		 * kutsutaan metodia käyttäjän valinnan mukaan.
		 * Jos käyttäjän syöttämä luku on pienempi kuin yksi, tai suurempi kuin kaksi käyttäjä valitsee uuden luvun.
		 * @case 1 käyttäjä valitsee itse numerot.
		 * @acase 2 numerot arvotaan.
		 * @valitseNumerot.myMethod Metodia kutsuttaessa käyttäjä valitsee itse numerot.
		 * @arvoNumerot.myMethod Metodia kutsuttaessa numerot arvotaan.*/
		int numerot[] = new int[12];
		
		do {
			System.out.println("1) Valitse numerot 2) Arvo numerot.");
			valinta = lukija.nextInt();
			
			switch (valinta) {
			case 1:
				System.out.println("Valitsit 1");
				numerot = valitseNumerot.lottorivi();
				break;
			case 2:
				System.out.println("Valitsit 2");
				numerot = arvoNumerot.lottorivi();
				
				System.out.println(" ");
				System.out.println("Arvotut lotto numerosi:");
				for (int i = 0; i < numerot.length; i++)
					System.out.print(numerot[i] + " ");
				break;
				
			}
		} while (valinta != 1 && valinta != 2);
		
		System.out.println(" ");
		panos();
		onnenapila();
		
		/** Suoritetaan lottorivin arvonta ja tulostetaan oikea lottorivi.
		 * @lottoNumerot Tallennetaan oikea lottorivi
		 * */
		int lottoNumerot[] = arvoNumerot.lottorivi();
		
		System.out.println(" ");
		System.out.println("Lottoarvonta suorittu, oikea lottorivi: ");
		
		for (int i = 0; i < lottoNumerot.length; i++)
			System.out.print(lottoNumerot[i] + " ");

	}
	
	public static double panos() {
		/** Käyttäjä valitsee panoksen 1 € ja 5 € väliltä.
		 * @panos Tallentaa käyttäjän panoksen.
		 * @return Palauttaa panoksen.
		 */
		System.out.println(" ");
		System.out.println("Valitse panos 1 € ja 5 € väliltä.");
		double panos = lukija.nextDouble();
		
		System.out.println("Panoksesi on " + panos + " €");
		
		return panos;
	}
	
	public static int onnenapila() {
		/** Arvorvotaan onnenapila.
		 * Käyttäjä voi halutessaan arpoa apilan uudelleen
		 * @onnenapila Onnenapila numero
		 * @arvoUudelleen Käyttäjä valitsee arvotaanko luku uudelleen. */
		int onnenapila;
		
		int arvoUudelleen;
		do {
			onnenapila = arvoNumerot.arvoOnnenapila();
			System.out.println("Onnenapila: " + onnenapila);
			
			System.out.println("Arvo onnenapila uudelleen 1) Ei 2) Kyllä ");
			arvoUudelleen = lukija.nextInt();
				while (arvoUudelleen < 1 || arvoUudelleen > 2) {
					System.out.println("Valitse luku 1) Pidä onnenapila tai 2) Arvo uudelleen: ");
					arvoUudelleen = lukija.nextInt();
				}
		} while (arvoUudelleen == 2);
			
		return onnenapila;
	}

}
