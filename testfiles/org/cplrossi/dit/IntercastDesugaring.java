package org.cplrossi.dit;

public class IntercastDesugaring {
  public static void main(String[] args) {
    C c = new C();

    /* tmp: triggering some internal machinery */
    I i = (I & J) () -> System.out.println("I'm I&J"); // triggers syntethic class I&J building
    ((I & J) i).m(); // triggers intersection runtime loading

    /* this is: ((I & J) c).m() */
    (($IJ) IntersectionProxy.newInstance(
 		 										c,
 		 										new Class[] {
 			 									$IJ.class
 												}
 											)).m();
  }
}
