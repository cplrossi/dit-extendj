package org.cplrossi.testgame;

public class GameStd {
	public static <T extends Swimmable & Flyable> void goAcrossRavine(T player, boolean underwaterObj) {
		System.out.println("Reached the ravine");

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
		Pelican player = new Pelican();

		goAcrossRavine(player, true);
	}
}
