package org.cplrossi.testgame;

public class Game {
	/* TMP */
	private static Swimmable & Flyable player;

	public static void goAcrossRavine(Swimmable & Flyable player, boolean underwaterObj) {
		System.out.println("Reached the ravine");

		/* test parameter declaration */
		if (underwaterObj) {
			player.fly();
			player.swim();

			System.out.println("Picked object");

			player.swim();
			player.fly();
		} else {
			player.fly();
		}

		System.out.println("Crossed the ravine");
	}

	public static void main(String[] args) {
		// Swimmable & Flyable player = new Pelican();

		/* TMP */
		player = new Pelican();

		/* test variable declaration */
		goAcrossRavine(player, true);
	}
}

public interface Swimmable {
	public void swim();
}

public interface Flyable {
	public void fly();
}
