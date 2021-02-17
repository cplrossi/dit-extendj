package org.cplrossi.dit;

public class IntercastDesugaring {
  public static void main(String[] args) {
    C c = new C();  // user concrete type
    I i = (I & J) () -> System.out.println("I'm a lambda"); // induced class type

    doSomething(c);
    doSomething(i);
  }

  public static void doSomething(I i) {
    ((I & J) i).m();
    ((I & J) i).n();
  }
}
