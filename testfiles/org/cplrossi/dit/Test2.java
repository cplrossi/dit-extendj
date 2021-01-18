package org.cplrossi.dit;

public class Test2 {
	public static void main(String[] args) {
		new C().m((A & B) () -> System.out.println("hello from A"));
	}

	public static class C {
		public <T extends A & B> void m(T t) {
			t.doSomething();
			t.sayHello();
		}
	}
}
