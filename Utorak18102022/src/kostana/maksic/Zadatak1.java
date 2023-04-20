package kostana.maksic;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// UGRAĐENI IF

		// 1. deo alogritma: Unos podataka
		// 2. deo algoritma: Obrada podataka
		// 3. deo algoritma: Ispisivanje vrednosti

		// 1. Za uneta tri broja, ispisati najveci broj
		Scanner sc = new Scanner(System.in);

		int najveciBroj;

		System.out.println("Unesite prvi broj:");
		int br1 = sc.nextInt();

		System.out.println("Unesite drugi broj:");
		int br2 = sc.nextInt();

		System.out.println("Unesite drugi broj:");
		int br3 = sc.nextInt();

		if (br1 > br2) // (br1>br2) == true
		{
			if (br1 > br3) // (br1>br3) == true -ugrađeni IF
			{
				najveciBroj = br1;
			} else {
				najveciBroj = br3;
			}
		} else {
			if (br2 > br3) {
				najveciBroj = br2;
			} else {
				najveciBroj = br3;
			}
		}

		System.out.println("Najveci broj je: " + najveciBroj);

		sc.close();

	}

}
