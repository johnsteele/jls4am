package org.jboss.tools.windup.am;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public static final String PLUGIN_ID = "org.jboss.tools.windup.am";
	private static Activator plugin;

	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	public static Activator getDefault() {
		return plugin;
	}
}
