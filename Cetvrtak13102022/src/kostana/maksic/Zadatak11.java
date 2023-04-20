package kostana.maksic;

import java.util.Scanner;

public class Zadatak11 {
	public static void main(String[] args) {

		double a, b, f;

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite dva operanda: ");
		a = input.nextDouble();
		b = input.nextDouble();

		System.out.println("Unesite operator: ");
		char operator = input.next().charAt(0);

		if (operator == '+') {
			f = a + b;
			System.out.println("Rezultat je: " + f);
		} else if (operator == '-') {
			f = a - b;
			System.out.println("Rezultat je: " + f);
		} else if (operator == '*') {
			f = a * b;
			System.out.println("Rezultat je: " + f);
		} else if (operator == '/') {
			f = a / b;
			System.out.println("Rezultat je: " + f);
		} else {
			System.out.println("Invalid");
		}
		input.close();
	}
}