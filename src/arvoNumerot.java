
/** Ohjelma arpoo numerot.*/

public class arvoNumerot {
	
	public static int[] lottorivi() {
		
		/** @numerot Tallennetaan taulukkoon 12 numeroa.*/
		int[] numerot = new int[12];
		
		/** @randomNum Luodaan muuttuja.*/
		int randomNum; 
		
		/** Arvotaan satunnaiset luvut
		 * @randomNum Ohjelma valitsee satunnaisen luvun 1-24 v�lilt� ja tallentaa sen muuttujaan.
		 * */
		for (int i = 0; i < 12; i++) {
			randomNum = (int) (Math.random() * 25);
			if (randomNum == 0)
				randomNum++;
	
			/** K�yd��n taulukko l�pi, jos taulukossa on olemassa sama numero, arvotaan numero uudelleen*/
			for (int x = 0; x < i; x++) {
				if (numerot[x] == randomNum) {
					randomNum = (int) (Math.random() * 25);
					x = -1;	
				}
			}
			
		/** Lis�t��n arvottu luku taulukkoon*/
				numerot[i] = randomNum;
				}
		return numerot;
		
		}
	
	public static int arvoOnnenapila() {
		/** Arvotaan onnenapila 1 ja 4 v�lilt�.
		* @onnenapila Tallentaa numeron muuttujaan.
		* @return Palauttaa onnenapilan arvon.
		*/
		int onnenapila = (int) (Math.random() * 4);
		if (onnenapila == 0)
			onnenapila++;
		
		return onnenapila;
	}
	 	
}