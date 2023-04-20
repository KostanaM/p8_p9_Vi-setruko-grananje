package kostana.maksic;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite kvadrant: ");

		int kvadrant = input.nextInt();

		switch (kvadrant) {
		case 1: {
			System.out.println("Kvadrant 1: 0 - 90");
			break;
		}
		case 2: {
			System.out.println("Kvadrant 2: 90 -180");
			break;
		}
		case 3: {
			System.out.println("Kvadrant 3: 180 - 270");
			break;
		}
		case 4: {
			System.out.println("Kvadrant 4: 270 -360");
			break;
		}
		default:
			System.out.println("Unesite kvadrant od 1 do 4");
		}
		input.close();
	}

}
