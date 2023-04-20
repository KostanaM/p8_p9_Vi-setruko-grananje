package kostana.maksic;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		double C1, C2;
		double Ce;

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite C1: ");
		C1 = input.nextDouble();

		System.out.println("Unesite C2: ");
		C2 = input.nextDouble();

		System.out.println("Kako su povezani? P - pralalelno, R - redno");

		char veza = input.next().charAt(0);

		switch (veza) {

		case 'P':
		case 'p': {
			Ce = C1 + C2;
			System.out.println("Ce za paralelnu vezu iznosi: " + Ce + " nF");
			break;
		}
		case 'R':
		case 'r': {
			Ce = (C1 * C2) / (C1 + C2);
			System.out.println("Ce za rednu vezu iznosi: " + Ce + " nF");
			break;
		}
		default:
			System.out.println("Unesite tip veze");
		}
		input.close();
	}

}
