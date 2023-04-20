package kostana.maksic;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int k1, k2, k3;

		System.out.println("Unesite tri prirodna broja: ");
		k1 = input.nextInt();
		k2 = input.nextInt();
		k3 = input.nextInt();

		if ((k1 < 1 || k1 > 366) || (k2 < 1 || k2 > 366) || (k3 < 1 || k3 > 366)) {
			System.out.println("Neka od unetih vrednosti ne predstavlja dan u godini!");
		} else if (k1 % 7 == 0 && k2 % 7 == 0 && k3 % 7 == 0) {
			System.out.println("Oznacavaju iste dane u nedelji");
		} else if (k1 % 7 == 1 && k2 % 7 == 1 && k3 % 7 == 1) {
			System.out.println("Oznacavaju iste dane u nedelji");
		} else if (k1 % 7 == 2 && k2 % 7 == 2 && k3 % 7 == 2) {
			System.out.println("Oznacavaju iste dane u nedelji");
		} else if (k1 % 7 == 3 && k2 % 7 == 3 && k3 % 7 == 3) {
			System.out.println("Oznacavaju iste dane u nedelji");
		} else if (k1 % 7 == 4 && k2 % 7 == 4 && k3 % 7 == 4) {
			System.out.println("Oznacavaju iste dane u nedelji");
		} else if (k1 % 7 == 5 && k2 % 7 == 5 && k3 % 7 == 5) {
			System.out.println("Oznacavaju iste dane u nedelji");
		} else if (k1 % 7 == 6 && k2 % 7 == 6 && k3 % 7 == 6) {
			System.out.println("Oznacavaju iste dane u nedelji");
		} else {
			System.out.println("Ne oznacavaju iste dane u nedelji");
		}
		input.close();
	}
}
