package com.gent.azureus.plugins;

import org.gudy.azureus2.plugins.Plugin;
import org.gudy.azureus2.plugins.PluginException;
import org.gudy.azureus2.plugins.PluginInterface;

/**
 * Hello world!
 *
 */
public class TehconnectionPlugin implements Plugin
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public void initialize(PluginInterface pluginInterface) throws PluginException {
        Thread thread = new Thread(new TehconnectionRunnable(pluginInterface));
        thread.setDaemon(true);
        thread.start();
    }
}
