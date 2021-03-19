package org.cplrossi.dit;

public class TestPureLambda {
  private I $$ J x;

  public static void main(String[] args) {
    new TestPureLambda().doSomething();
  }

  private void doSomething() {
    x = () -> System.out.println("I'm method m");

    x.m();
    x.n();
  }
}
