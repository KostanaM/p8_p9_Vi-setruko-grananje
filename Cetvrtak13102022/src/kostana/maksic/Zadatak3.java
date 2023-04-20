package kostana.maksic;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int dan;

		System.out.println("Unesite redni broj dana: ");

		dan = input.nextInt();

		switch (dan) {
		case 1: {
			System.out.println("Ponedeljak ");
			break;
		}
		case 2: {
			System.out.println("Utorak ");
			break;
		}
		case 3: {
			System.out.println("Sreda ");
			break;
		}
		case 4: {
			System.out.println("Četvrtak ");
			break;
		}
		case 5: {
			System.out.println("Petak ");
			break;
		}
		case 6: {
			System.out.println("Subota ");
			break;
		}
		case 7: {
			System.out.println("Nedelja ");
			break;
		}
		default:
			System.out.println("Greška  ");
		}
		input.close();
	}

}
