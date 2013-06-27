package com.zeroturnaround.gradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zeroturnaround.gradle.Greet;

public class Main {

  private static final Logger log = LoggerFactory.getLogger(Main.class);
  
  public static void main(String[] args) {
    
    // try to get the name from the arguments
    String name = null;
    if (args.length > 0) {
      name = args[0];
    }
    
    Greet greet = new Greet(name);
    
    log.info(greet.greet());
    log.info("The greet object : " + greet);
  }

}
