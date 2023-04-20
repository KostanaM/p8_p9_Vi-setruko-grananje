package kostana.maksic;

import java.util.Scanner;

public class Bezveze {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int month;
		int day;
		int year;

		System.out.print("Dan: ");
		day = sc.nextInt();
		System.out.print("Mesec: ");
		month = sc.nextInt();
		System.out.print("Godina: ");
		year = sc.nextInt();
		sc.close();

		double m;
		int y;
		int dow;

		m = (month - 2 + 12) % 12;
		if (month <= 2) {
			year--;
		}
		y = 5 * (year % 4) + 4 * (year % 100) + 6 * (year % 400);
		dow = (day + (int) (2.6 * m - 0.2) + y) % 7;
		// System.out.println("Day: " + dow);

		if (dow == 1) {
			System.out.println("Dan je: Ponedeljak");
		} else if (dow == 2) {
			System.out.println("Dan je: Utorak");
		} else if (dow == 3) {
			System.out.println("Dan je: Sreda");
		} else if (dow == 4) {
			System.out.println("Dan je: Četvrtak");
		} else if (dow == 5) {
			System.out.println("Dan je: Petak");
		} else if (dow == 6) {
			System.out.println("Dan je: Subota");
		} else if (dow == 0) {
			System.out.println("Dan je: Nedelja");
		} else {
			System.out.println("Error");
		}

	}
}