package org.cplrossi.testgame;

public class Game {
	public static void goAcrossRavine(Swimmable & Flyable player, boolean underwaterObj) {
		System.out.println("Reached the ravine");

		if (underwaterObj) {
//			player.fly();
			player.swim();

			System.out.println("Picked object");

			player.swim();
//			player.fly();
		} else {
//			player.fly();
		}

		System.out.println("Crossed the ravine");
	}

	public static void main(String[] args) {
		Swimmable & Flyable player = new Pelican();

		goAcrossRavine(player, true);
	}
}
