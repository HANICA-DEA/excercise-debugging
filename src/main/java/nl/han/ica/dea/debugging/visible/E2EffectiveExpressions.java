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

import java.util.List;

import nl.han.ica.dea.debugging.hidden.ObjectMaker;

/**
 * Exercise 2: Using the Expression Window in the Debug perspective.
 *
 * @author Mark Hiner
 */
public class E2EffectiveExpressions {

	public static void main(final String... args) {
		// Let's make a list of 100000 objects
		final List<Object> myList = ObjectMaker.getList(100000);

		// Now let's process some objects from our list

		// Process first object
		processElementAtIndex(myList, 0);

		// Process middle object
		processElementAtIndex(myList, 100000 / 2);

		// Process last object
		processElementAtIndex(myList, 100000 - 1);
	}

	private static void processElementAtIndex(final List<Object> list,
		final int index)
	{
		// First let's check our method arguments to see if they're valid
		if (index < 0 || index >= list.size()) {
			// The fact that this method is already doing input validation makes
			// debugging very easy.
			// The next line of code will only be executed if a problem is detected,
			// so it's a great place to set a breakpoint.
			throw new IllegalArgumentException(
				"If you don't mind, I would prefer not to process your object...");
		}

		// OK now we can process the argument.
		// ... just kidding, I'm totally going to delete your precious objects.
		list.set(index, null);
	}
}
