public class arvoNumerot {
	/** Arvotaan satunnaiset luvut. */
	public static int[] lottorivi() {
		/** @randomNum Luodaan muuttuja.*
		 * @hyvaksyttyjaLukuja Tallentaa lukujen m‰‰r‰n.
		 * @randomNum Ohjelma valitsee satunnaisen luvun 1-24 v‰lilt‰ ja tallentaa sen muuttujaan.
		 * @arvotut Tallennetaan taulukkoon 12 numeroa.
		 * */
		
		int[] arvotut = new int[12];
		int hyvaksyttyjaLukuja = 0;
		
		arvontaKierre:
		while (hyvaksyttyjaLukuja < 12) {
			int arvottu = (int) (Math.random() * 24) + 1;
			
			/** Tarkistetaan onko luku jo taulukossa. */
			for (int i = 0; i < arvotut.length; i++) {
				if (arvotut[i] == arvottu) {
					/**Continue arvontaKierre jatkaa arvontaKierre-silmukkaa.*/
					continue arvontaKierre;
				}
			}
		/** Lis‰t‰‰n arvottu luku taulukkoon*/
		arvotut[hyvaksyttyjaLukuja] = arvottu;
		hyvaksyttyjaLukuja++;
		}
		
		/** @return Palauttaa taulukon.*/
		return arvotut;
		
		}
	
	/** Arvotaan onnenapila. */
	public static int arvoOnnenapila() {
		/** Arvotaan onnenapila 1 ja 4 v‰lilt‰.
		* @onnenapila Tallentaa numeron muuttujaan.
		* @return Palauttaa onnenapilan arvon. */
		int onnenapila = (int) (Math.random() * 4) + 1;

		return onnenapila;
	}
	 	
}