package kostana.maksic;

import java.util.Scanner;

public class Bezveze2 {

	public static void main(String[] args) {
		int x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Broj: ");
		x = sc.nextInt();
		int dow;

		dow = x % 7;
		// System.out.println("Day: " + dow);

		switch (dow) {
		case 3: {
			System.out.println("Dan je: Ponedeljak");
			break;
		}
		case 4: {
			System.out.println("Dan je: Utorak");
			break;
		}
		case 5: {
			System.out.println("Dan je: Sreda");
			break;
		}
		case 6: {
			System.out.println("Dan je: Četvrtak");
			break;
		}
		case 0: {
			System.out.println("Dan je: Petak");
			break;
		}
		case 1: {
			System.out.println("Dan je: Subota");
			break;
		}
		case 2: {
			System.out.println("Dan je: Nedelja");
			break;
		}
		default:
			System.out.println("Error");
		}

		/*
		 * if (dow == 3) { System.out.println("Dan je: Ponedeljak"); } else if (dow ==
		 * 4) { System.out.println("Dan je: Utorak"); } else if (dow == 5) {
		 * System.out.println("Dan je: Sreda"); } else if (dow == 6) {
		 * System.out.println("Dan je: Četvrtak"); } else if (dow == 0) {
		 * System.out.println("Dan je: Petak"); } else if (dow == 1) {
		 * System.out.println("Dan je: Subota"); } else if (dow == 2) {
		 * System.out.println("Dan je: Nedelja"); } else { System.out.println("Error");
		 * }
		 */
		sc.close();
	}
}