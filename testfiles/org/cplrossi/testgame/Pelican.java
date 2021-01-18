package org.cplrossi.testgame;

public class Pelican implements Flyable, Swimmable {
	@Override
	public void fly() {
		System.out.println("Pelican is flying");
	}

	@Override
	public void swim() {
		System.out.println("Pelican is swimming");
	}
}

