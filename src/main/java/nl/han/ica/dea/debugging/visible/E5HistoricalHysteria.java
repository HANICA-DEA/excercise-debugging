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

import nl.han.ica.dea.debugging.hidden.MathDoer;

/**
 * Exercise 5: Identifying problematic changes in a code's history, when
 * standard debugging techniques are insufficient.
 *
 * @author Mark Hiner
 */
public class E5HistoricalHysteria {

	public static void main(final String... args) {
		final int number = MathDoer.doMaths();

		if (number < 0) throw new IllegalArgumentException(
			"Something terrible has happened!");

		System.out.println("You are awesome at mathings.");
	}
}
