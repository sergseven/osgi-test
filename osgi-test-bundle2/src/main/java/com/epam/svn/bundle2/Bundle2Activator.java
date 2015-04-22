package com.epam.svn.bundle2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * Created by Sergii_Nesprava on 22.04.2015.
 */
public class Bundle2Activator implements BundleActivator {
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println("Bundle2Activator.start");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {

    }
}