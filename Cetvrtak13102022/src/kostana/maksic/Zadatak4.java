package kostana.maksic;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite slovo: ");

		char karakter = input.next().charAt(0);

		switch (karakter) {
		case 'a':
		case 'A': {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
			break;
		}
		case 'e':
		case 'E': {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
			break;
		}
		case 'i':
		case 'I': {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
			break;
		}
		case 'o':
		case 'O': {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
			break;
		}
		case 'u':
		case 'U': {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
			break;
		}
		default:
			System.out.println("Slovo " + karakter + " je suglasnik!");
		}
		input.close();
	}

}
