package org.cplrossi.dit;

public interface B {
	// default void sayHello() {
	// 	System.out.println("hello from B");
	// }

	default void sayHello() {
		System.out.println("hello from B");
	}
}
