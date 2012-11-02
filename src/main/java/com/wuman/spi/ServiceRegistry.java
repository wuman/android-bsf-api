package com.wuman.spi;

import java.util.Iterator;

import sun.misc.Service;

public class ServiceRegistry {

    // The following two methods expose functionality from
    // sun.misc.Service. If that class is made public, they may be
    // removed.
    //
    // The sun.misc.ServiceConfigurationError class may also be
    // exposed, in which case the references to 'an
    // <code>Error</code>' below should be changed to 'a
    // <code>ServiceConfigurationError</code>'.

    /**
     * Searches for implementations of a particular service class using the
     * given class loader.
     * 
     * <p>
     * This method transforms the name of the given service class into a
     * provider-configuration filename as described in the class comment and
     * then uses the <code>getResources</code> method of the given class loader
     * to find all available files with that name. These files are then read and
     * parsed to produce a list of provider-class names. The iterator that is
     * returned uses the given class loader to look up and then instantiate each
     * element of the list.
     * 
     * <p>
     * Because it is possible for extensions to be installed into a running Java
     * virtual machine, this method may return different results each time it is
     * invoked.
     * 
     * @param providerClass
     *            a <code>Class</code>object indicating the class or interface
     *            of the service providers being detected.
     * 
     * @param loader
     *            the class loader to be used to load provider-configuration
     *            files and instantiate provider classes, or <code>null</code>
     *            if the system class loader (or, failing that the bootstrap
     *            class loader) is to be used.
     * 
     * @return An <code>Iterator</code> that yields provider objects for the
     *         given service, in some arbitrary order. The iterator will throw
     *         an <code>Error</code> if a provider-configuration file violates
     *         the specified format or if a provider class cannot be found and
     *         instantiated.
     * 
     * @exception IllegalArgumentException
     *                if <code>providerClass</code> is <code>null</code>.
     */
    public static <T> Iterator<T> lookupProviders(Class<T> providerClass,
            ClassLoader loader) {
        if (providerClass == null) {
            throw new IllegalArgumentException("providerClass == null!");
        }
        return Service.providers(providerClass, loader);
    }

    /**
     * Locates and incrementally instantiates the available providers of a given
     * service using the context class loader. This convenience method is
     * equivalent to:
     * 
     * <pre>
     * ClassLoader cl = Thread.currentThread().getContextClassLoader();
     * return Service.providers(service, cl);
     * </pre>
     * 
     * @param providerClass
     *            a <code>Class</code>object indicating the class or interface
     *            of the service providers being detected.
     * 
     * @return An <code>Iterator</code> that yields provider objects for the
     *         given service, in some arbitrary order. The iterator will throw
     *         an <code>Error</code> if a provider-configuration file violates
     *         the specified format or if a provider class cannot be found and
     *         instantiated.
     * 
     * @exception IllegalArgumentException
     *                if <code>providerClass</code> is <code>null</code>.
     */
    public static <T> Iterator<T> lookupProviders(Class<T> providerClass) {
        if (providerClass == null) {
            throw new IllegalArgumentException("providerClass == null!");
        }
        return Service.providers(providerClass);
    }

}
