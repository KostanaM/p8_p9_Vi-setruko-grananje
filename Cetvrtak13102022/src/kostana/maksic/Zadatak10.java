package kostana.maksic;

import java.util.Scanner;

public class Zadatak10 {
	public static void main(String[] args) {

		double a, b, f;

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva operanda: ");

		a = input.nextDouble();
		b = input.nextDouble();

		System.out.println("Unesite operator: ");

		char operand = input.next().charAt(0);

		switch (operand) {

		case '+': {
			f = a + b;
			System.out.println("Rezultat je: " + f);
			break;
		}
		case '-': {
			f = a - b;
			System.out.println("Rezultat je: " + f);
			break;
		}
		case '*': {
			f = a * b;
			System.out.println("Rezultat je: " + f);
			break;
		}
		case '/': {
			f = a / b;
			System.out.println("Rezultat je: " + f);
			break;
		}
		default:
			System.out.println("Invalid");
		}
		input.close();
	}

}
