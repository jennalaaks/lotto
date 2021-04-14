import java.util.Scanner;
public class lotto {
	
private static final Scanner lukija = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Tervetulo pelaamaan Kaikki tai ei mit‰‰n lottoa!");
		System.out.println("Valitse 12 numeroa 1-24 numeron v‰lill‰ tai arvo numerot (1 valitse numerot tai 2 arvo numerot)");
		int valinta = lukija.nextInt();
		
		switch (valinta) {
		case 1:
			System.out.println("Valitsit 1");
			valiteNumerot.myMethod();
			break;
		case 2:
			System.out.println("Valitsit 2");
			arvoNumerot.myMethod();
			break;
			
		}
		System.out.println("Valitse panos 1Ä ja 5Ä v‰lilt‰");
	}

}
