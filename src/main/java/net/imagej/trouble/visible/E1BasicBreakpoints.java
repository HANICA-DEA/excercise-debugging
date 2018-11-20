/*
 * #%L
 * ImageJ interactive debugging tutorials.
 * %%
 * Copyright (C) 2009 - 2016 Board of Regents of the University of
 * Wisconsin-Madison.
 * %%
 * To the extent possible under law, the ImageJ developers have waived
 * all copyright and related or neighboring rights to this tutorial code.
 * 
 * See the CC0 1.0 Universal license for details:
 * http://creativecommons.org/publicdomain/zero/1.0/
 * #L%
 */

package net.imagej.trouble.visible;

/**
 * Exercise 1: Setting breakpoints, stepping through code, and viewing variables
 * in the Debug perspective.
 *
 * @author Mark Hiner
 */
public class E1BasicBreakpoints {

	public static void main(final String... args) {
		// Here is where our object is being created.
		// If we need to debug the creation process, we could
		// add a breakpoint on this line.
		final Object o = makeAThing();

		printThis(o);
	}

	private static Object makeAThing() {
		final Object o = new Object();
		System.out.println(o);

		return null;
	}

	private static void printThis(final Object o) {
		// This method doesn't do any input validation.
		// If "o" is null we will see a NullPointerException here,
		// however that doesn't tell us WHY it's null.
		//
		// Setting a breakpoint here is limited in usefulness,
		// since whether or not "o" is valid has been
		// determined prior to this point.
		System.out.println(o.toString());
	}
}
