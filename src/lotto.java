/**Kaikki tai ei mit��n lotto
 * @author Karolina
 * @author Jenna
 */

import java.util.Scanner;

public class lotto {

private static final Scanner lukija = new Scanner(System.in);
	public static void main(String[] args) {
		
		/**Ohjeet ja pelin esittely.
		 * K�ytt�j� valitsee arvotaanko numerot vai valitseeko k�ytt�j� itse.
		 * @valinta Lukee ja tallentaa k�ytt�j�n vastauksen.
		 * */
		System.out.println("Tervetulo pelaamaan Kaikki tai ei mit��n lottoa!");
		System.out.println("Valitse 12 numeroa 1-24 numeron v�lill� tai arvo numerot.");
		System.out.println(" ");
		
		int valinta;
		
		/** Suoritetaan numeroiden arvonta tai k�ytt�j� valisee numerot itse.
		 * kutsutaan metodia k�ytt�j�n valinnan mukaan.
		 * Jos k�ytt�j�n sy�tt�m� luku on pienempi kuin yksi, tai suurempi kuin kaksi k�ytt�j� valitsee uuden luvun.
		 * @case 1 k�ytt�j� valitsee itse numerot.
		 * @acase 2 numerot arvotaan.
		 * @valitseNumerot.myMethod Metodia kutsuttaessa k�ytt�j� valitsee itse numerot.
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
		/** K�ytt�j� valitsee panoksen 1 � ja 5 � v�lilt�.
		 * @panos Tallentaa k�ytt�j�n panoksen.
		 * @return Palauttaa panoksen.
		 */
		System.out.println(" ");
		System.out.println("Valitse panos 1 � ja 5 � v�lilt�.");
		double panos = lukija.nextDouble();
		
		System.out.println("Panoksesi on " + panos + " �");
		
		return panos;
	}
	
	public static int onnenapila() {
		/** Arvorvotaan onnenapila.
		 * K�ytt�j� voi halutessaan arpoa apilan uudelleen
		 * @onnenapila Onnenapila numero
		 * @arvoUudelleen K�ytt�j� valitsee arvotaanko luku uudelleen. */
		int onnenapila;
		
		int arvoUudelleen;
		do {
			onnenapila = arvoNumerot.arvoOnnenapila();
			System.out.println("Onnenapila: " + onnenapila);
			
			System.out.println("Arvo onnenapila uudelleen 1) Ei 2) Kyll� ");
			arvoUudelleen = lukija.nextInt();
				while (arvoUudelleen < 1 || arvoUudelleen > 2) {
					System.out.println("Valitse luku 1) Pid� onnenapila tai 2) Arvo uudelleen: ");
					arvoUudelleen = lukija.nextInt();
				}
		} while (arvoUudelleen == 2);
			
		return onnenapila;
	}

}
