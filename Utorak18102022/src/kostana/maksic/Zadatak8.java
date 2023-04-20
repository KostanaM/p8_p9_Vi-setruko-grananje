package kostana.maksic;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d1 = 0;
		int m1 = 0;
		int g1 = 0;
		int l = 0;
		System.out.println("Unesite dan: ");
		int d = sc.nextInt();
		System.out.println("Unesite mesec: ");
		int m = sc.nextInt();
		System.out.println("Unesite godinu: ");
		int g = sc.nextInt();
		sc.close();

		switch (m) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			l = 31;
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			l = 30;
			break;
		}
		case 2: {
			if (g % 4 == 0 && g != 100 || g % 400 == 0) {
				l = 29;
			} else {
				l = 28;
			}
			break;
		}
		}
		if (d + 7 > l) {
			d1 = (d + 7) - l;
			m1 = m + 1;
			g1 = g;
		}
		if (m1 > 12) {
			m1 = 1;
			g1 = g + 1;
		} else if (d + 7 < l) {
			d1 = d + 7;
			m1 = m;
			g1 = g;
		}

		System.out.println("Izlaz: " + d1 + "." + m1 + "." + g1 + ".");
	}

}
