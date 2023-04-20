package kostana.maksic;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		/*
		 * 3. Za unetu kategoriju vozačke dozvole, ispisati kojom vrstom vozila je
		 * moguće upravljati. (IFELSE).
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vozacku kategoriju: ");
		char kat = input.next().charAt(0);

		if (kat == 'A' || kat == 'a') {
			System.out.println("Sa kategorijom A mozete voziti motor");
		} else if (kat == 'B' || kat == 'b') {
			System.out.println("Sa kategorijom B mozete voziti auto");
		} else if (kat == 'C' || kat == 'c') {
			System.out.println("Sa kategorijom C mozete voziti auto i kamion");
		} else if (kat == 'D' || kat == 'd') {
			System.out.println("Sa kategorijom D mozete voziti auto, kamion i autobus");
		} else if (kat == 'E' || kat == 'e') {
			System.out.println("Sa kategorijom E mozete voziti auto, kamion i kamion sa prikolicom");
		} else {
			System.out.println("Pogresan unos");
		}
		input.close();
	}

}
