package kostana.maksic;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		/*
		 * 3. Za unetu kategoriju vozačke dozvole, ispisati kojom vrstom vozila je
		 * moguće upravljati.(SWITCH-CASE)
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite vozacku kategoriju: ");
		char kat = input.next().charAt(0);

		switch (kat) {
		case 'A':
		case 'a': {
			System.out.println("Sa kategorijom A mozete voziti motor");
			break;
		}
		case 'B':
		case 'b': {
			System.out.println("Sa kategorijom B mozete voziti auto");
			break;
		}
		case 'C':
		case 'c': {
			System.out.println("Sa kategorijom C mozete voziti auto i kamion");
			break;
		}
		case 'D':
		case 'd': {
			System.out.println("Sa kategorijom D mozete voziti auto, kamion i autobus");
			break;
		}
		case 'E':
		case 'e': {
			System.out.println("Sa kategorijom E mozete voziti auto, kamion i kamion sa prikolicom");
			break;
		}
		default:
			System.out.println("Pogresan unos");
		}
		input.close();
	}

}
