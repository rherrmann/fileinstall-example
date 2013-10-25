package com.codeaffine.fileinstall.example;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ManagedService;

public class Activator implements BundleActivator {

  private ServiceRegistration<?> serviceRegistration;

  public void start( BundleContext bundleContext ) {
    EchoService service = new EchoService();
    Dictionary<String,String> properties = new Hashtable<String,String>();
    properties.put( Constants.SERVICE_PID, "echoservice" );
    String[] classes = new String[] { EchoService.class.getName(), ManagedService.class.getName() };
    serviceRegistration = bundleContext.registerService( classes, service, properties );
  }

  public void stop( BundleContext bundleContext ) {
    serviceRegistration.unregister();
  }
  
}
