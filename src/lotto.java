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
		
		int valinta;
		
		/** Suoritetaan numeroiden arvonta tai k�ytt�j� valisee numerot itse.
		 * kutsutaan metodia k�ytt�j�n valinnan mukaan.
		 * Jos k�ytt�j�n sy�tt�m� luku on pienempi kuin yksi, tai suurempi kuin kaksi k�ytt�j� valitsee uuden luvun.
		 * @case 1 k�ytt�j� valitsee itse numerot.
		 * @acase 2 numerot arvotaan.
		 * @valitseNumerot.myMethod Metodia kutsuttaessa k�ytt�j� valitsee itse numerot.
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
		System.out.println("T�ss� on oikeat numerot");
		
		for (int i = 1; i < lottonumerot.length; i++)
			System.out.print(lottonumerot[i] + " ");

	}
	
	public static double valitsePanos() {
		/** K�ytt�j� valitsee panoksen 1 � ja 5 � v�lilt�.
		 * @panos Tallentaa k�ytt�j�n panoksen.
		 * @return Palauttaa panoksen m��r�n.
		 */
		System.out.println(" ");
		System.out.println("Valitse panos 1 � ja 5 � v�lilt�.");
		double panos = lukija.nextDouble();
		
		System.out.println("Panoksesi on " + panos + " �.");
		
		return panos;
	}

}
