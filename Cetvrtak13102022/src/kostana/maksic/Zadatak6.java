package kostana.maksic;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite slovo: ");

		char karakter = input.next().charAt(0);

		if (karakter == 'A' || karakter == 'a') {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
		} else if (karakter == 'E' || karakter == 'e') {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
		} else if (karakter == 'I' || karakter == 'i') {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
		} else if (karakter == 'O' || karakter == 'o') {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
		} else if (karakter == 'U' || karakter == 'u') {
			System.out.println("Slovo " + karakter + " je samoglasnik!");
		} else {
			System.out.println("Slovo " + karakter + " je suglasnik!");
		}
		input.close();
	}

}
