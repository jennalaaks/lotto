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
		 * kutsutaan oikea metodi käyttäjän valinnan mukaan.
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
				numerot = valitseNumerot.lottorivi();
				break;
			case 2:
				numerot = arvoNumerot.lottorivi();
				
				System.out.println("Arvotut lottonumerosi:");
				
				/** Tulostetaan arvottu lottorivi */
				for (int i = 0; i < numerot.length; i++)
					System.out.print(numerot[i] + " ");
				
				System.out.print("\n");
				break;
			}
		} while (valinta != 1 && valinta != 2);
		
		/** Kutsutaan metodia panos. Käyttäjä valitsee panoksen */
		double panos1 = panos();
		
		/** Käyttäjä valitsee haluaako onnenapilan. Tulostetaan ohjeet.
		 * @tuleekoOnnenapila Tallentaa arvon haluaako käyttäjä onnenapilan.
		 * @onnenapila Tallentaa onnenapilan arvon, oletusarvo 0.
		 */
		System.out.print("\n");
		System.out.println("Haluatko onnenapilan?");
		System.out.println("Oikea onnennumero nelinkertaistaa voittosi.");
		System.out.println("Onnenapila maksaa panoksen suuruisen lisämaksun.");
		System.out.print("\n");
		int tuleekoOnnenapila;
		int onnenapila = 0;
		int onnenapilaKerroin = 2;
		
		/** Jos käyttäjä valitsee 1 pienemmän numeron tai 2 suuremman numeron,
		 * toistetaan kysymystä kunnes käyttäjä syöttää numeron 1 tai 2.
		 * Jos käyttäjä valisee numeron 1, eli onnenapila valitaan, kutsutaan metodia onnenapila.
		 * Jos käyttäjä valitsee numeron 2, eli onnenapilaa ei valita, onnenapilan arvoksi jää 0.
		 */
		do {
			System.out.println("1) Valitse onnenapila 2) En onnenapilaa.");
			tuleekoOnnenapila = lukija.nextInt();
		} while(tuleekoOnnenapila < 1 || tuleekoOnnenapila > 2);
		
		if (tuleekoOnnenapila == 1) {
			onnenapila = onnenapila();
		}
		
		/** Suoritetaan lottorivin arvonta.
		 * @lottoNumerot Kutsutaan metodia arvoNumerot.lottorivi ja tallennetaan oikea lottorivi.
		 * */
		int lottoNumerot[] = arvoNumerot.lottorivi();
		
		System.out.println(" ");
		System.out.println("Lottoarvonta suoritettu, oikea lottorivi: ");
		
		/** Tulostetaan lottorivi */
		for (int i = 0; i < lottoNumerot.length; i++)
			System.out.print(lottoNumerot[i] + " ");
		
		System.out.print("\n");
		System.out.print("\n");
		
		/** Kutsutaan metodia tarkistaNumerot.lottorivinTarkistus, jossa
		 * tarkistetaan kuinka monta numeroa käyttäjällä meni oikein tai väärin
		 * ja voiton suuruus.
		 */
		tarkistaNumerot.lottorivinTarkistus(numerot, lottoNumerot, onnenapila);
		
		/** hintaLaskuri, laskee loton hinnan. */
		System.out.print("\n");
		hintaLaskuri(panos1, onnenapilaKerroin, tuleekoOnnenapila);

	}
	
	public static double hintaLaskuri(double panos1, int onnenapilaKerroin, int tuleekoOnnenapila) {
		
		do {
			
		} while(tuleekoOnnenapila < 1 || tuleekoOnnenapila > 2);
		if (tuleekoOnnenapila == 1) {
			double hintaLaskuriOnnenapilalla = panos1 * onnenapilaKerroin; /** Laskee hinnan panoksella ja onneapilalla */
			System.out.println("Hinta: "+hintaLaskuriOnnenapilalla+" €");
		}
		else {
			double hintaLaskuriPanoksella = panos1; /** Laskee hinna vain panoksella */
			System.out.println("Hinta: "+hintaLaskuriPanoksella+" €");
		}
		
		return tuleekoOnnenapila;
		
	}

	public static double panos() {
		/** Käyttäjä valitsee panoksen 1 € ja 5 € väliltä.
		 * @panos Tallentaa käyttäjän panoksen.
		 * @return Palauttaa panoksen.
		 */
		double panos;
		System.out.print("\n");
		do {
			System.out.println("Valitse panos 1 € - 5 € väliltä.");
			panos = lukija.nextDouble();
		} while (panos < 1 || panos > 5);
		
		System.out.println("Panoksesi on " + panos + " €");
		
		return panos;
	}
	
	public static int onnenapila() {
		/** Arvotaan onnenapila.
		 * Käyttäjä voi halutessaan arpoa apilan uudelleen
		 * @onnenapila Onnenapila numero
		 * @arvoUudelleen Käyttäjä valitsee arvotaanko luku uudelleen.
		 * @return Palauttaa onnenapilan arvon. */
		int onnenapila;
		int arvoUudelleen;
		
		do {
			onnenapila = arvoNumerot.arvoOnnenapila();
			System.out.println("Onnenapila: " + onnenapila);
			
			System.out.println("Arvo onnenapila uudelleen 1) Ei 2) Kyllä.");
			arvoUudelleen = lukija.nextInt();
				/** Jos käyttäjä syöttää numeron joka on pienempi kun 1 tai suurempi kun 2,
				 * pyydetään käyttäjää syöttämään uusi luku.
				 */
				while (arvoUudelleen < 1 || arvoUudelleen > 2) {
					System.out.println("Valitse luku 1) Pidä onnenapila tai 2) Arvo uudelleen: ");
					arvoUudelleen = lukija.nextInt();
				}
		} while (arvoUudelleen == 2);
			
		return onnenapila;
	}
}