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

import org.scijava.Context;
import org.scijava.thread.ThreadService;

/**
 * Exercise 4: Multithreaded environments where the act of debugging itself
 * introduces errors.
 *
 * @author Mark Hiner
 */
public class E4MultithreadedMadness {

	public static void main(final String... args) {

		final Context c = new Context();

		final boolean[] toggle = new boolean[1];

		final ThreadService ts = c.getService(ThreadService.class);
		ts.queue(new EvenLonelyRunnable(toggle));
		ts.run(new OddLonelyRunnable(toggle));

		c.dispose();
	}

	private static class EvenLonelyRunnable extends AbstractLonelyRunnable {

		public EvenLonelyRunnable(final boolean[] toggle) {
			super(toggle, false);
		}

		@Override
		protected String getName() {
			return "even";
		}

	}

	private static class OddLonelyRunnable extends AbstractLonelyRunnable {

		public OddLonelyRunnable(final boolean[] toggle) {
			super(toggle, true);
		}

		@Override
		protected String getName() {
			return "odd";
		}

	}

	private static abstract class AbstractLonelyRunnable implements Runnable {

		private final boolean[] toggle;
		private final boolean myValue;

		public AbstractLonelyRunnable(final boolean[] toggle,
			final boolean myValue)
		{
			this.toggle = toggle;
			this.myValue = myValue;
		}

		public void run() {
			int i = myValue ? 1 : 0;
			int misses = 0;

			long time = System.currentTimeMillis();
			while (i < 11) {
				// every second, poll the toggle to see if it's our turn
				if (System.currentTimeMillis() - time > 1000) {
					time = System.currentTimeMillis();
					if (toggle[0] == myValue) {
						System.out.println(i + " - " + getName());
						i += 2;
						misses = 0;
						toggle[0] = !toggle[0];
					}
					else {
						misses++;
						// If we have missed our partner 3 times, cry
						if (misses >= 3) {
							throw new RuntimeException(
								"I'm lonely! What happened to my friend? :'(");
						}
					}
				}
			}

		}

		protected abstract String getName();

	}
}
