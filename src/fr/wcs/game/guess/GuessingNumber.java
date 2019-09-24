package fr.wcs.game.guess;

import java.util.Random;

public class GuessingNumber implements Runnable {

	public static int MAX_NUMBER = 10;

	public static void main(String[] args) {
		new GuessingNumber().run();
	}

	private GameIhm ihm;
	private Random rand;

	public GuessingNumber() {
		this.ihm = new GameIhm();
		this.rand = new Random();
	}

	@Override
	public void run() {
		boolean exit = false;
		this.ihm.display("Bienvenue dans le jeu 'Devine le nombre' !");
		while (!exit) {
			String choice = this.ihm.readInput("Voulez-vous quitter ? (o/N) : ");
			if (choice.matches("[oO]")) {
				exit = true;
			} else {
				this.play();
			}
		}
	}

	public void play() {
		int random = this.rand.nextInt(MAX_NUMBER);
		this.ihm.display("J'ai généré un nombre entre 0 et "
				+ MAX_NUMBER + ", pouvez-vous le deviner ?");
		boolean won = false;
		while (!won) {
			String strNum = this.ihm.readInput("Proposez un nombre : ");
			if (strNum.matches("[0-9]*")) {
				int num = Integer.parseInt(strNum);
				if (num > random) {
					this.ihm.display("Dommage ! Le nombre à deviner est plus petit !");
				} else if (num < random) {
					this.ihm.display("Dommage ! Le nombre à deviner est plus grand !");
				} else {
					this.ihm.display("Bravo !!! Vous avez bien deviné le nombre.");
					won = true;
				}
			} else {
				this.ihm.display("La valeur saisie n'est pas un nombre, veuillez recommencer.");
			}
		}
	}
}
