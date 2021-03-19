package org.cplrossi.dit;

public class TestReturnValue {
	public static void main(String[] args) {
		I $$ J x = getLambdaInstance();

		x.m();
		x.n();
	}

	private static I $$ J getLambdaInstance() {
		return () -> System.out.println("Here I am.");
	}
}
