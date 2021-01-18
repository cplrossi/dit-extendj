package org.cplrossi.dit;

import java.util.function.*;

public class Test {
	private static Object o;

	/* the additional bound list is semantically ignored at the moment */
	private static Consumer<Integer> c;

	public static void main(String[] args) {
		o = (Runnable & java.io.Serializable) () -> System.out.println("I'm serializable");

		new Thread((Runnable) o).start();

		c = (Consumer<Integer> & Pippable) (x) -> System.out.println(x);

		c.accept(1234);
		((Consumer<Integer> & Pippable) c).doSomething();
	}
}

interface Pippable {
	default void doSomething() {
		System.out.println("I'm pippable");
	}
}
