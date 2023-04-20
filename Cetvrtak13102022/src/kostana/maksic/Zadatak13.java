package kostana.maksic;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int k1, k2, k3;

		System.out.println("Unesite tri prirodna broja: ");
		k1 = input.nextInt();
		k2 = input.nextInt();
		k3 = input.nextInt();

		if ((k1 < 1 || k1 > 366) || (k2 < 1 || k2 > 366) || (k3 < 1 || k3 > 366)) {
			System.out.println("Neka od unetih vrednosti ne predstavlja dan u godini!");
		}

		else {
			if ((k1 - k2) % 7 == 0 && (k1 - k3) % 7 == 0 && (k2 - k3) % 7 == 0) {
				System.out.println("Navedene vrednosti predstavljaju iste dane u sedmici");
			}

			else {
				System.out.println("Navedene vrednosti ne predstavljaju iste dane u sedmici");
			}
		}

		input.close();
	}
}
