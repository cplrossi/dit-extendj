package org.cplrossi.dit;

public class TestReturnValue {
	public static void main(String[] args) {
		accept(getInstance());
	}

	private static I $$ J getInstance() {
		return () -> System.out.println("Here I am.");
	}

	private static void accept(I $$ J x) {
		x.m();
		x.n();
	}
}
