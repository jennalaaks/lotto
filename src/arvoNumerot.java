
public class arvoNumerot {
	
	 public static void myMethod() {
		 int[] numerot = new int[12]; //Tallennetaan listaan 12 numeroa
		    int randomNum; 
		    System.out.println("Arvotut numerosi on: ");

		    for (int i = 0; i < 12; i++) {
		        randomNum = (int) (Math.random() * 24); //Tässä ohjelma valitsee numeron randomisti 1-24 numeron välillä
		        for (int x = 0; x < i; x++) {
		            if (numerot[x] == randomNum) //Koodi tarkistaa onko toista samanlaista numeroa
		            	{
		            	randomNum = (int) (Math.random() * 24); //Jos random numero on sama, numero valitaan uudestaan
		            	x = -1;
		            	}
		            }
		        numerot[i] = randomNum;
		        }
		    for (int i = 0; i < numerot.length; i++)
		    	System.out.print(numerot[i] + " ");
		    }
	 }