package kostana.maksic;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int d1 = 0;
		int m1 = 0;
		int g1 = 0;
		System.out.println("Unesite dan: ");
		int d = sc.nextInt();
		System.out.println("Unesite mesec: ");
		int m = sc.nextInt();
		System.out.println("Unesite godinu: ");
		int g = sc.nextInt();
		sc.close();

		if (m % 2 != 0 && (d + 7) <= 31) {
			d1 = d + 7;
			m1 = m;
			g1 = g;
		} else if (m % 2 != 0 && (d + 7) > 31) {
			d1 = (d + 7) - 31;
			m1 = m + 1;
			g1 = g;
		} else if (m == 12 && (d + 7) <= 31) {
			d1 = d + 7;
			m1 = m;
			g1 = g;
		} else if (m == 12 && (d + 7) > 31) {
			d1 = (d + 7) - 31;
			m1 = (m + 1) - 12;
			g1 = g + 1;
		} else if (m % 2 == 0 && (d + 7) <= 30 && m != 2) {
			d1 = d + 7;
			m1 = m;
			g1 = g;
		} else if (m % 2 == 0 && (d + 7) > 30 && m != 2) {
			d1 = (d + 7) - 30;
			m1 = m + 1;
			g1 = g;
		} else if (m == 2 && (d + 7) <= 28 && g % 4 != 0) {
			d1 = d + 7;
			m1 = m;
			g1 = g;
		} else if (m == 2 && (d + 7) > 28 && g % 4 != 0) {
			d1 = (d + 7) - 28;
			m1 = m + 1;
			g1 = g;
		} else if (m == 2 && (d + 7) <= 29) {
			if (g % 4 == 0 && g % 100 != 0 || g % 400 == 0)
				d1 = d + 7;
			m1 = m;
			g1 = g;
		} else if (m == 2 && (d + 7) > 29) {
			if (g % 4 == 0 && g % 100 != 0 || g % 400 == 0)
				d1 = (d + 7) - 29;
			m1 = m + 1;
			g1 = g;
		}

		System.out.println("Izlaz: " + d1 + "." + m1 + "." + g1 + ".");

	}
}
