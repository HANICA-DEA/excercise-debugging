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

package nl.han.ica.dea.debugging.visible;

import nl.han.ica.dea.debugging.hidden.ObjectMaker;

/**
 * Exercise 7: Looking for memory leaks to identify the cause of
 * {@link OutOfMemoryError} exceptions.
 *
 * @author Mark Hiner
 */
public class E7InvestigateImpressions {

	public static void main(final String... args) {

		final int size = Math.abs((int) Runtime.getRuntime().totalMemory() / 10);

		// create 100 arrays of the determined size
		// One of these may be a problem... but which?
		for (int i = 0; i < 100; i++) {
			System.out.println(ObjectMaker.getFloatArray(size));
			System.out.println(ObjectMaker.getLongArray(size));
			System.out.println(ObjectMaker.getDoubleArray(size));
		}
	}
}
