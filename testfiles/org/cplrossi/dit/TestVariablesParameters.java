package org.cplrossi.dit;

public class TestVariablesParameters {
  public static void main(String[] args) {
    I & J x = () -> System.out.println("x");
    I & J c = new C();

    doSomething(new C());
    doSomething(() -> System.out.println("I'm a lambda"));
    doSomething(x);
    doSomething(c);
  }

  public static void doSomething(I & J x) {
    x.m();
    x.n();
  }
}
