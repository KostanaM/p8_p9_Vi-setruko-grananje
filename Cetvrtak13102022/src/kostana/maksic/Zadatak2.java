package kostana.maksic;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int ocena;

		System.out.println("Unesite ocenu: ");
		ocena = input.nextInt();

		if (ocena == 5) {
			System.out.println("Odličan!");
		} else if (ocena == 4) {
			System.out.println("Vrlo dobar!");
		} else if (ocena == 3) {
			System.out.println("Dobar!");
		} else if (ocena == 2) {
			System.out.println("Dovoljan!");
		} else if (ocena == 1) {
			System.out.println("Nedovoljan!");
		} else {
			System.out.println("Uneta ocena ne postoji!");
		}
		input.close();
	}

}
