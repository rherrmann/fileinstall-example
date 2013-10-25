package com.codeaffine.fileinstall.example;

import java.util.Dictionary;

import org.osgi.service.cm.ManagedService;


public class EchoService implements ManagedService {

  public void updated( Dictionary<String, ?> properties ) {
    if( properties != null ) {
      System.out.println( "port = " + properties.get( "port" ) );
    }
  }
  
}
