package kostana.maksic;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite kvadrant: ");
		double kvadrant = input.nextDouble();

		if (kvadrant == 1) {
			System.out.println("Kvadrant 1: 0 - 90");
		} else if (kvadrant == 2) {
			System.out.println("Kvadrant 2: 90 -180");
		} else if (kvadrant == 3) {
			System.out.println("Kvadrant3: 180 - 270");
		} else if (kvadrant == 4) {
			System.out.println("Kvadrant 4: 270 -360");
		} else {
			System.out.println("Unesite kvadrant od 1 do 4");
		}
		input.close();
	}

}
