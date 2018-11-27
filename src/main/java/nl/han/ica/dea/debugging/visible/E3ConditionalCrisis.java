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

import nl.han.ica.dea.debugging.hidden.ObjectAnalyzer;
import nl.han.ica.dea.debugging.hidden.ObjectMaker;

/**
 * Exercise 3: Using conditional breakpoints to avoid unnecessary debugging
 * steps.
 *
 * @author Mark Hiner
 */
public class E3ConditionalCrisis {

	public static void main(final String... args) {
		// In E2, getList didn't work so well. So let's try an array this time...
		final Object[] myArray = ObjectMaker.getArray(100);

		boolean everythingIsOK = true;
		int i = 0;
		while (i < myArray.length && everythingIsOK) {
			// This time we're using an external library to process objects.
			// If something goes wrong, this is the line where we'll want to set a
			// breakpoint.
			everythingIsOK = ObjectAnalyzer.processElementAtIndex(myArray, i);
			i++;
		}

		if (!everythingIsOK) {
			throw new RuntimeException(
				"Oh noes - analysis incomplete! See console for more information.");
		}
	}
}
