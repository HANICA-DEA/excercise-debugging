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

package nl.han.ica.dea.debugging.hidden;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * STOP LOOKING AT THIS CLASS!! IT'S OFF LIMITS!
 *
 * @author Mark Hiner
 */
public class ObjectMaker {

	final static Set<Object> cache = new HashSet();

	public static List<Object> getList(final int size) {
		final List<Object> list = new ArrayList();

		for (int i = 0; i < size - 1; i++) {
			list.add((Math.random() * 100000));
		}

		return list;
	}

	public static Object[] getArray(final int size) {
		final Object[] array = new Object[size];

		for (int i = 0; i < size - 1; i++) {
			array[i] = new Double(Math.random() * 100000);
		}

		array[(int) (Math.random() * (size - 1))] = null;

		return array;
	}

	public static Double[] getDoubleArray(final int size) {
		final Double[] array = new Double[size];

		return array;
	}

	public static Float[] getFloatArray(final int size) {
		final Float[] array = new Float[size];

		cache.add(array);

		return array;
	}

	public static Long[] getLongArray(final int size) {
		final Long[] array = new Long[size];

		return array;
	}
}
