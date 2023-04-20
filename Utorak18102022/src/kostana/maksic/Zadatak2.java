package kostana.maksic;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// UGRAĐENI IF

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj:");
		int broj = sc.nextInt();

		if (broj > 0) {
			System.out.println("Uneti broj je pozitivan");
		}

		else if (broj < 0) {
			System.out.println("Uneti broj je negativan");
		}

		else {
			System.out.println("Uneti broj je 0");
		}

		sc.close();

	}

}
