/**Kaikki tai ei mit‰‰n lotto
 * @author Karolina
 * @author Jenna
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class lotto {

private static final Scanner lukija = new Scanner(System.in);
	/** P‰‰ohjelma. */
	public static void main(String[] args) {
		/**Ohjeet ja pelin esittely.
		 * K‰ytt‰j‰ valitsee arvotaanko numerot vai valitseeko k‰ytt‰j‰ itse.
		 * @valinta Lukee ja tallentaa k‰ytt‰j‰n vastauksen.
		 */
		System.out.println("Tervetulo pelaamaan Kaikki tai ei mit‰‰n lottoa!");
		System.out.println("Valitse 12 numeroa 1-24 numeron v‰lill‰ tai arvo numerot.");
		System.out.println(" ");
		
		int valinta;
		
		/** Suoritetaan numeroiden arvonta tai k‰ytt‰j‰ valisee numerot itse.
		 * kutsutaan oikea metodi k‰ytt‰j‰n valinnan mukaan.
		 * Jos k‰ytt‰j‰n syˆtt‰m‰ luku on pienempi kuin yksi, tai suurempi kuin kaksi k‰ytt‰j‰ valitsee uuden luvun.
		 * @case 1 k‰ytt‰j‰ valitsee itse numerot.
		 * @acase 2 numerot arvotaan.
		 * @valitseNumerot.myMethod Metodia kutsuttaessa k‰ytt‰j‰ valitsee itse numerot.
		 * @arvoNumerot.myMethod Metodia kutsuttaessa numerot arvotaan.
		 */
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
				Arrays.sort(numerot);
				/** Tulostetaan arvottu lottorivi */
				for (int i = 0; i < numerot.length; i++)
					System.out.print(numerot[i] + " ");
				
				System.out.print("\n");
				break;
			}
		} while (valinta != 1 && valinta != 2);
		
		/** Kutsutaan metodia panos. K‰ytt‰j‰ valitsee panoksen */
		double panos = panos();
		
		/** K‰ytt‰j‰ valitsee haluaako onnenapilan. Tulostetaan ohjeet.
		 * @tuleekoOnnenapila Tallentaa arvon haluaako k‰ytt‰j‰ onnenapilan.
		 * @onnenapila Tallentaa onnenapilan arvon, oletusarvo 0.
		 */
		System.out.print("\n");
		System.out.println("Haluatko onnenapilan?");
		System.out.println("Oikea onnennumero nelinkertaistaa voittosi.");
		System.out.println("Onnenapila maksaa panoksen suuruisen lis‰maksun.");
		System.out.print("\n");
		int tuleekoOnnenapila;
		int onnenapila = 0;
		int onnenapilaKerroin = 2;
		
		/** Jos k‰ytt‰j‰ valitsee 1 pienemm‰n numeron tai 2 suuremman numeron,
		 * toistetaan kysymyst‰ kunnes k‰ytt‰j‰ syˆtt‰‰ numeron 1 tai 2.
		 * Jos k‰ytt‰j‰ valisee numeron 1, eli onnenapila valitaan, kutsutaan metodia onnenapila.
		 * Jos k‰ytt‰j‰ valitsee numeron 2, eli onnenapilaa ei valita, onnenapilan arvoksi j‰‰ 0.
		 */
		do {
			System.out.println("1) Valitse onnenapila 2) Ei onnenapilaa.");
			tuleekoOnnenapila = lukija.nextInt();
		} while(tuleekoOnnenapila < 1 || tuleekoOnnenapila > 2);
		
		if (tuleekoOnnenapila == 1) {
			onnenapila = onnenapila();
		}
		
		/** HintaLaskuri, laskee loton hinnan. */
		System.out.print("\n");
		
		double hinta = hintaLaskuri(panos, onnenapilaKerroin, tuleekoOnnenapila);
		
		
		/** Suoritetaan lottorivin arvonta.
		 * Tulostetaan lottorivi ja j‰rjestell‰‰n lottoNumero taulukon arvot suuruusj‰rjestykseen.
		 * @lottoNumerot Kutsutaan metodia arvoNumerot.lottorivi ja tallennetaan oikea lottorivi.
		 * @oikeaOnnenapila Arpoo oikean onnenapila.
		 */
		int lottoNumerot[] = arvoNumerot.lottorivi();
		
		System.out.print("\n");
		System.out.println("Lottoarvonta suoritettu, oikea lottorivi: ");
	
		Arrays.sort(lottoNumerot);
		for (int i = 0; i < lottoNumerot.length; i++)
			System.out.print(lottoNumerot[i] + " ");
		
		int oikeaOnnenapila = arvoNumerot.arvoOnnenapila();
		if (onnenapila != 0) {
		System.out.print("+ " + oikeaOnnenapila);
		}
		
		int onnenapilanArvonta = arvoNumerot.arvoOnnenapila();
		System.out.print("\n");
		
		/** Kutsutaan metodia tarkistaNumerot.lottorivinTarkistus, jossa
		 * tarkistetaan kuinka monta numeroa k‰ytt‰j‰ll‰ meni oikein tai v‰‰rin
		 * ja voiton suuruus.
		 * @voittosumma Tallentaa voittosumman.
		 */
		double voittosumma = tarkistaNumerot.lottorivinTarkistus(numerot, lottoNumerot, onnenapila, oikeaOnnenapila, panos);
		
		/** Tulostetaan kuitti tiedostoon ja t‰m‰n j‰lkeen luetaan teidosto
		 * ja tulostetaan se ohjelman loppuun.
		 */
		try {
			kuitti(hinta, voittosumma);
		} catch (IOException e) {
			System.out.println("Tapahtui virhe " +e);
		}
		
		System.out.println("_________________________________________________");
		
		try {
		tulostaKuitti();
		} catch (FileNotFoundException f) {
			System.out.println("Tapahtui virhe " +f);
		}
	}
	
	/** Metodi laskee lottorivin hinnan. */
	public static double hintaLaskuri(double panos, int onnenapilaKerroin, int tuleekoOnnenapila) {
		/** Ohjelma tarkistaa onko k‰ytt‰j‰ valinnut onnenapilan vai ei.
		 * @hinta Tallennetaan kokonaishinta muuttujaan
		 * @panos Sis‰lt‰‰ k‰ytt‰j‰n panoksen.
		 */
		double hinta = panos;
		
		do {
			
		} while(tuleekoOnnenapila < 1 || tuleekoOnnenapila > 2);
		if (tuleekoOnnenapila == 1) {
			hinta = panos * 2;
			/** @hintaLaskuriPanoksellaLaskee Laskee hinnan panoksella ja onneapilalla */
			double hintaLaskuriOnnenapilalla = panos * onnenapilaKerroin;
			System.out.println("Loton hinta: " + hintaLaskuriOnnenapilalla + " Ä");
		}
		else {
			/** @hintaLaskuriPanoksella Laskee hinna vain panoksella */
			double hintaLaskuriPanoksella = panos;
			System.out.println("Loton hinta: " + hintaLaskuriPanoksella + " Ä");
		}
		System.out.println("_________________________________________________");
		
		/** @return Palauttaa hinnan p‰‰ohjelmaan. */
		return hinta;
		
	}
	
	/** K‰ytt‰j‰ valitsee panoksen 1 Ä ja 5 Ä v‰lilt‰. */
	public static double panos() {
		 /** @panos Tallentaa k‰ytt‰j‰n panoksen.
		 * @return Palauttaa panoksen.
		 */
		double panos;
		System.out.print("\n");
		do {
			System.out.println("Valitse panos 1 Ä - 5 Ä v‰lilt‰.");
			panos = lukija.nextDouble();
		} while (panos < 1 || panos > 5);
		
		System.out.println("Panoksesi on " + panos + " Ä");
		
		return panos;
	}
	
	/** Arvotaan onnenapila. */
	public static int onnenapila() {
		/** K‰ytt‰j‰ voi halutessaan arpoa apilan uudelleen
		 * @onnenapila Onnenapila numero
		 * @arvoUudelleen K‰ytt‰j‰ valitsee arvotaanko luku uudelleen.
		 */
		int onnenapila;
		int arvoUudelleen;
		
		do {
			onnenapila = arvoNumerot.arvoOnnenapila();
			System.out.println("Onnenapila: " + onnenapila);
			
			System.out.println("Arvo onnenapila uudelleen 1) Ei 2) Kyll‰.");
			arvoUudelleen = lukija.nextInt();
				/** Jos k‰ytt‰j‰ syˆtt‰‰ numeron joka on pienempi kun 1 tai suurempi kun 2,
				 * pyydet‰‰n k‰ytt‰j‰‰ syˆtt‰m‰‰n uusi luku.
				 */
				while (arvoUudelleen < 1 || arvoUudelleen > 2) {
					System.out.println("Valitse luku 1) Pid‰ onnenapila tai 2) Arvo uudelleen: ");
					arvoUudelleen = lukija.nextInt();
				}
		} while (arvoUudelleen == 2);
		
		/** @return Palauttaa onnenapilan arvon. */
		return onnenapila;
	}
	
	/** Tulostetaan kuitti tiedostoon. */
	private static void kuitti(double hinta, double voittosumma) throws IOException { 
		 /** @PrintWriter Luodaan kirjoittaja-olio, joka yhdistet‰‰n tiedostoon "kuitti.txt.
		 * @DateTimeFormatter M‰‰ritt‰‰ miss‰ muodossa tulostetaan p‰iv‰m‰‰r‰.
		 * @LocalDateTime Tallentaa t‰m‰n hetkisen p‰iv‰m‰‰r‰n ja kellonajan."
		 */
		
		PrintWriter kirjoittaja = new PrintWriter("kuitti.txt");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		kirjoittaja.println("KUITTI");
		kirjoittaja.println("Kaikki tai ei mit‰‰n lotto");
		kirjoittaja.println("P‰iv‰m‰‰r‰ ja aika: " + dtf.format(now));
		kirjoittaja.println("Voitot: " + voittosumma + " Ä");
		kirjoittaja.println("Hinta yhteens‰: " + hinta + " Ä");
		/** @kirjoittaja Suljetaan tiedoto. */
		kirjoittaja.close();
	}
	
	/** Tulostaa kuitin tiedostosta ohjelmaan */
	private static void tulostaKuitti() throws FileNotFoundException {
		/**Luodaan lukija-olio, jonka toimet kohdistetaan tiedostoon "tiedosto.txt". */
		final Scanner lukija = new Scanner(new File("kuitti.txt"));
		/** @rivi Luodaan tyhj‰ merkkijono. */
		String rivi = "";
		while (lukija.hasNext()) {
			/** @rivi Luetaan talteen yksi tiedoston rivi. */
			rivi = lukija.nextLine();
			/** @rivi Tulostetaan n‰ytˆlle tiedostosta luettu rivi. */
			System.out.print("\n");
		System.out.println(rivi);
		}
		/** @lukija Suljetaan tiedosto. */
		lukija.close();
	}
}