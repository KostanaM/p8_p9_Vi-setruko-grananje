package kostana.maksic;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite mesec rodjenja: ");
		String mesec = input.next();
		System.out.println("Unesite dan rodjenja: ");
		int dan = input.nextInt();

		if ((mesec.equals("mart") && dan >= 21 && dan <= 31) || (mesec.equals("april") && dan <= 20)) {
			System.out.println("Ovan");
		} else if (mesec.equals("april") && dan >= 21 && dan <= 30 || mesec.equals("maj") && dan <= 21) {
			System.out.println("Bik");
		} else if (mesec.equals("maj") && dan >= 22 && dan <= 31 || mesec.equals("jun") && dan <= 21) {
			System.out.println("Blizanci");
		} else if (mesec.equals("jun") && dan >= 22 && dan <= 30 || mesec.equals("jul") && dan <= 22) {
			System.out.println("Rak");
		} else if (mesec.equals("jul") && dan >= 23 && dan <= 31 || mesec.equals("avgust") && dan <= 22) {
			System.out.println("Lav");
		} else if (mesec.equals("avust") && dan >= 23 && dan <= 31 || mesec.equals("septembar") && dan <= 22) {
			System.out.println("Devica");
		} else if (mesec.equals("septembar") && dan >= 23 && dan <= 30 || mesec.equals("oktobar") && dan <= 23) {
			System.out.println("Vaga");
		} else if (mesec.equals("oktobar") && dan >= 24 && dan <= 31 || mesec.equals("novembar") && dan <= 22) {
			System.out.println("Skorpija");
		} else if (mesec.equals("novembar") && dan >= 23 && dan <= 30 || mesec.equals("decembar") && dan <= 21) {
			System.out.println("Strelac");
		} else if (mesec.equals("decembar") && dan >= 22 && dan <= 31 || mesec.equals("januar") && dan <= 20) {
			System.out.println("Jarac");
		} else if (mesec.equals("januar") && dan >= 21 && dan <= 31 || mesec.equals("februar") && dan <= 19) {
			System.out.println("Vodolija");
		} else if (mesec.equals("februar") && dan >= 20 && dan <= 29 || mesec.equals("mart") && dan <= 20) {
			System.out.println("Ribe");
		} else
			System.out.println("Pogresan unos");

		input.close();

	}

}
