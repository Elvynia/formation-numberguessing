package fr.wcs.game.guess;

import java.util.Scanner;

public class Affichage {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void afficher(String message) {
		System.out.println(message);
	}
	
	public static String lireSaisie() {
		return Affichage.scanner.nextLine();
	}
}
