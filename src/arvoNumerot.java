/** Ohjelma arpoo numerot.*/

public class arvoNumerot {
	
	 public static int[] myMethod() {
		
		/** @numerot Tallennetaan taulukkoon 12 numeroa.*/
		int[] numerot = new int[13];
		
		/** @randomNum Luodaan muuttuja.*/
		int randomNum; 
		
		/** Arvotaan satunnaiset luvut
		 * @randomNum Ohjelma valitsee satunnaisen luvun 1-24 v�lilt� ja tallentaa sen muuttujaan.
		 * */
		for (int i = 0; i < 13; i++) {
			randomNum = (int) (Math.random() * 25);
			if (i == 0)
				i++;
	
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
	 	
	 }