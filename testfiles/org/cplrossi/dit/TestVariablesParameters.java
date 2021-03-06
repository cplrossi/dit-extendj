package org.cplrossi.dit;

public class TestVariablesParameters {
  private static I & J & java.io.Serializable x;

  public static void main(String[] args) {
    x = () -> System.out.println("x");

    I & J c = new C();

    doSomething(new C());
    doSomething(() -> System.out.println("I'm a lambda"));
    doSomething(x);
    doSomething(c);
    doSomething(createLambda());
  }

  private static void doSomething(I & J x) {
    x.m();
    x.n();
  }

  private static I & J createLambda() {
    return () -> System.out.println("I'm a lambda");
  }
}
