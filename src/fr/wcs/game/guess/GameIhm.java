package fr.wcs.game.guess;

import java.util.Scanner;

public class GameIhm {
	
	private final Scanner scanner;

	public GameIhm() {
		this.scanner = new Scanner(System.in);
	}
	
	/**
	 * Méthode d'affichage d'informations à l'utilisateur.
	 * 
	 * @param message le message à afficher.
	 */
	public void display(String message) {
		 System.out.println(message);
	}
	
	/**
	 * Méthode de récupération d'une saisie utilisateur.
	 * 
	 * @param label le message a afficher avant de demander la saisie.
	 * @return String la saisie utilisateur.
	 */
	public String readInput(String label) {
		this.display(label);
		return this.scanner.nextLine();
	}
}
