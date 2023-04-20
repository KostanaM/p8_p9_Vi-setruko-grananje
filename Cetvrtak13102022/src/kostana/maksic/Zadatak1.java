package kostana.maksic;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		/*
		 * Napisati naredbu case kojom se na osnovu brojnih ocena 5, 4, 3, 2, 1 ispisuju
		 * opisne Ocene “odlican”, “vrlo dobar”, “dobar”, “dovoljan”, “nedovoljan”.
		 */

		// 1. deo: Unos podataka
		// 2. deo: Obrada podataka
		// 3. deo: Stampanje

		// case struktura:
		// switch (uslov)
		// {
		// case 1: {
		// break;
		// }
		// case2:
		// {
		// obrada
		// break;
		// }
		// defult
		// obrada ostalih slucajeva

		Scanner input = new Scanner(System.in);

		int ocena;

		System.out.println("Unesite ocenu: ");

		ocena = input.nextInt();

		switch (ocena) {
		case 5: {
			System.out.println("Odličan!");
			break;
		}
		case 4: {
			System.out.println("Vrlo dobar!");
			break;
		}
		case 3: {
			System.out.println("Dobar!");
			break;
		}
		case 2: {
			System.out.println("Dovoljan!");
			break;
		}
		case 1: {
			System.out.println("Nedovoljan!");
			break;
		}
		default:
			System.out.println("Uneta ocena ne postoji  ");
		}
		input.close();
	}

}
