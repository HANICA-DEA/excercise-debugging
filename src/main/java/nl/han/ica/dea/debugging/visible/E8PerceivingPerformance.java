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

import nl.han.ica.dea.debugging.hidden.StuffDoer;

/**
 * Exercise 8: Monitoring performance of methods in real time.
 *
 * @author Mark Hiner
 */
public class E8PerceivingPerformance {

	public static void main(final String... args) {
		final long time = System.currentTimeMillis();

		// Do stuff for a minute
		while (System.currentTimeMillis() - time < 120000) {
			// One of these methods takes longer than the other.
			// Without changing or looking at source code, how can we determine
			// which is slower?
			StuffDoer.doStuff();
			StuffDoer.doMoreStuff();
		}
	}
}
