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
import org.scijava.command.Command;
import org.scijava.console.ConsoleService;
import org.scijava.console.DefaultConsoleService;
import org.scijava.plugin.Parameter;
import org.scijava.plugin.Plugin;

/**
 * Exercise 4: Remote debugging when a plugin behaves differently in new
 * environments.
 *
 * @author Mark Hiner
 */
@Plugin(type = Command.class,
	menuPath = "Plugins>Troubleshooting>E4 - Print ConsoleService")
public class E4RemoteResearch implements Command {

	@Parameter
	private ConsoleService consoleService;

	@Override
	public void run() {
		DefaultConsoleService dcs;

		try {
			// Print the class of our console service!
			// If something goes wrong.. this is a good place to set a breakpoint,
			// since we're performing a potentially risky conversion.
			dcs = (DefaultConsoleService) consoleService;
			System.out.println("I found our console service! Look: " + dcs
				.getClass());
		}
		catch (final Exception e) {
			throw new RuntimeException(
				"Oh noes! Our console service is full of lies and deceit! :(");
		}
	}

	/*
	 * Helper method to create a minimal context and test this command
	 */
	public static void main(final String... args) throws Exception {
		final Context c = new Context(DefaultConsoleService.class);
		final E4RemoteResearch cmd = new E4RemoteResearch();
		c.inject(cmd);

		cmd.run();
	}
}
