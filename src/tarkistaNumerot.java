/** Ohjelma tarkistaa kuinka monta numeroa on oikein/v‰‰rin.*/
public class tarkistaNumerot  {  
	public static void lottorivinTarkistus(int[] numerot, int[] lottoNumerot, int onnenapila) {
		System.out.println("T‰‰ll‰ tarkistetaan lottorivi!");
		System.out.println("Toimii!");
		for (int i = 0; i < lottoNumerot.length; i++)
			System.out.print(lottoNumerot[i] + " ");
		System.out.print("\n");
		System.out.println("Toimii!");
		for (int i = 0; i < lottoNumerot.length; i++)
			System.out.print(numerot[i] + " ");
		System.out.print("\n");
		System.out.println("Toimii!");
		System.out.println(onnenapila);
		
		// Kaikki taulukoiden arvot n‰ytt‰v‰t tulevan hyvin t‰nne :)
		
	}
}