package org.cplrossi.dit;

public class PureLambda {
  private I & J x;

  public static void main(String[] args) {
    new PureLambda().doSomething();
  }

  private void doSomething() {
    x = (I & J) () -> System.out.println("I'm method m");

    x.m();
    x.n();
  }
}
