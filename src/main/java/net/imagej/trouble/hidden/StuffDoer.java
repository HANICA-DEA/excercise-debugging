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
public class StuffDoer {

	public static void doStuff() {
		for (int i = 0; i < 10000; i++) {
			final Object[] objects = new Object[1];
			objects[0] = new Integer(5);
		}
	}

	public static void doMoreStuff() {
		int i = 5;
		i = i - 2;
	}
}
