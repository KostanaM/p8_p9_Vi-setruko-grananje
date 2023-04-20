package kostana.maksic;

import java.util.Scanner;

public class Zadatak7 {

	// 5. Napisati program koji omogucuje da za uneti naziv meseca i broj dana
	// ispise horoskopski znak. Unesite mesec rodjenja: OktobarUnesite dan rodjenja:
	// 18Vaga

	/**
	 * Ovan – od 21. marta do 20. aprila; Bik – od 21. aprila do 21. maja;
	 * 
	 * Blizanci – od 22. maja do 21. juna;
	 * 
	 * Rak – od 22. juna do 22. jula;
	 * 
	 * Lav – od 23. jula do 22. avgusta;
	 * 
	 * Devica – od 23. avgusta do 22. septembra;
	 * 
	 * Vaga – od 23. septembra do 23.oktobra;
	 * 
	 * Škorpija – od 24. oktobra do 22. novembra;
	 * 
	 * Strelac – od 23. novembra do 21. decembra;
	 * 
	 * Jarac – od 22. decembra do 20. januara;
	 * 
	 * Vodolija – od 21. januara do 19. februara;
	 * 
	 * Ribe – od 20. februara do 20. marta;
	 **/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dan, mjesec;

		Scanner scan = new Scanner(System.in);

		System.out.println("Unesite dan Vaseg rodjenja ");
		dan = scan.nextInt();
		System.out.println("Unesite mjesec Vaseg rodjenja ");
		mjesec = scan.nextInt();

		switch (mjesec) {
		case 1:
			if (dan <= 20) {
				System.out.println("Vas horoskopski znak je Jarac ");
			} else if (dan >= 21) {
				System.out.println("Vas horoskopski znak je Vodolija ");
				break;
			}
		case 2:
			if (dan <= 19) {
				System.out.println("Vas horoskopski znak je Vodolija ");
			} else if (dan >= 20) {
				System.out.println("Vas horoskopski znak je Riba ");
				break;
			}
		case 3:
			if (dan <= 20) {
				System.out.println("Vas horoskopski znak je Riba ");
			} else if (dan >= 21) {
				System.out.println("Vas horoskopski znak je Ovan ");
				break;
			}
		case 4:
			if (dan <= 20) {
				System.out.println("Vas horoskopski znak je Ovan ");
			} else if (dan >= 21) {
				System.out.println("Vas horoskopski znak je Bik ");
				break;
			}
		case 5:
			if (dan <= 21) {
				System.out.println("Vas horoskopski znak je Bik ");
			} else if (dan >= 22) {
				System.out.println("Vas horoskopski znak je Blizanac ");
				break;
			}
		case 6:
			if (dan <= 21) {
				System.out.println("Vas horoskopski znak je Blizanac ");
			} else if (dan >= 22) {
				System.out.println("Vas horoskopski znak je Rak ");
				break;
			}
		case 7:
			if (dan <= 22) {
				System.out.println("Vas horoskopski znak je Rak ");
			} else if (dan >= 23) {
				System.out.println("Vas horoskopski znak je Lav ");
				break;
			}
		case 8:
			if (dan <= 22) {
				System.out.println("Vas horoskopski znak je Lav ");
			} else if (dan >= 23) {
				System.out.println("Vas horoskopski znak je Djevica ");
				break;
			}
		case 9:
			if (dan <= 22) {
				System.out.println("Vas horoskopski znak je Djevica ");
			} else if (dan >= 23) {
				System.out.println("Vas horoskopski znak je Vaga ");
			}
			break;
		case 10:
			if (dan <= 23) {
				System.out.println("Vas horoskopski znak je Vaga ");
			} else if (dan >= 24) {
				System.out.println("Vas horoskopski znak je Skorpija ");
				break;
			}
		case 11:
			if (dan <= 22) {
				System.out.println("Vas horoskopski znak je Skorpija ");
			} else if (dan >= 23) {
				System.out.println("Vas horoskopski znak je Strelac ");
				break;
			}
		case 12:
			if (dan <= 21) {
				System.out.println("Vas horoskopski znak je Strelac ");
			} else if (dan >= 22) {
				System.out.println("Vas horoskopski znak je Jarac ");
				break;
			}
		default:
			System.out.println(mjesec + " ne postoji!");

		}
		scan.close();
	}

}
