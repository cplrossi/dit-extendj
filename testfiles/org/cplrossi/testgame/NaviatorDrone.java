package org.cplrossi.testgame;

public class NaviatorDrone implements Flyable, Swimmable {
	@Override
	public void fly() {
		System.out.println("NaviatorDrone is flying");
	}

	@Override
	public void swim() {
		System.out.println("NaviatorDrone is swimming");
	}
}

