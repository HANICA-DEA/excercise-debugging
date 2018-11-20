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
public class ObjectAnalyzer {

	public static boolean processElementAtIndex(final Object[] myArray,
		final int i)
	{
		final Object o = myArray[i];

		if (o == null) {
			System.out.println("Something is wrong with the " + (i + 1) + suffix(i +
				1) + " object... :(\n\n");
			return false;
		}

		return true;
	}

	private static String suffix(int i) {
		i = i % 10;

		String suffix = "th";
		switch (i) {
			case 1:
				suffix = "rst";
				break;
			case 2:
				suffix = "nd";
				break;
			case 3:
				suffix = "rd";
				break;
		}
		return suffix;
	}

}
