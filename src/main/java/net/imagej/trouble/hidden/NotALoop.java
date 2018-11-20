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

package net.imagej.trouble.hidden;

/**
 * STOP LOOKING AT THIS CLASS!! IT'S OFF LIMITS!
 *
 * @author Mark Hiner
 */
public class NotALoop {

	public static void dontLoopForever() {
		final long time = System.currentTimeMillis();

		// Wait for 7.5 seconds
		while (System.currentTimeMillis() - time < 7500);

		// System.exit, because we're jerks.
		System.exit(0);
	}

	public static void dontLoopTwice() {
		for (int i = 0; i < 4; i++);
	}

	public static void dontLoopThrice() {
		for (int i = 0; i < 3; i++);
	}

	public static void loopForever() {
		boolean loop = true;
		while (loop) {
			loop = false;
		}
	}
}
