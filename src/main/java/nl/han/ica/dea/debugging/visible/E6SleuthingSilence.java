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

import org.scijava.command.Command;
import org.scijava.plugin.Plugin;

import nl.han.ica.dea.debugging.hidden.NotALoop;

/**
 * Exercise 6: Identifying the location of problematic code when applications
 * quit unexpectedly and/or silently.
 *
 * @author Mark Hiner
 */
@Plugin(type = Command.class,
	menuPath = "Plugins>Troubleshooting>E6 - Start Looping")
public class E6SleuthingSilence implements Command {

	public void run() {
		// Lets do some looping.. or not?

		NotALoop.dontLoopTwice();

		NotALoop.dontLoopThrice();

		NotALoop.dontLoopForever();

		NotALoop.loopForever();
	}

}
