package org.cplrossi.dit;

import java.io.Serializable;

public class Test3 {
  public static void main(String[] args) {
    // Box b = (Box & Serializable) new Box();
    //
    // b.greet();
    //
    // if (b instanceof Serializable) {
    //   System.out.println("b is serializable");
    // } else {
    //   System.out.println("something went wrong");
    // }

    /**************************************************/

    // Doable d = (Doable & A) new Doable() {
    //   @Override
    //   public void doSomething() {
    //     System.out.println("doing something...");
    //   }
    // };
    //
    // d.doSomething();
    //
    // if (d instanceof Serializable) {
    //   System.out.println("d is serializable");
    // } else {
    //   System.out.println("something went wrong");
    // }

  }

  public static class Box {
    public void greet() {
      System.out.println("hi, I'm a box");
    }
  }

  public static interface Doable {
    public void doSomething();
  }

  public static interface A {
    default void greet() {
      System.out.println("hi, I'm A");
    }
  }
}
