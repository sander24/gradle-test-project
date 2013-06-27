package com.zeroturnaround.gradle;

import com.zeroturnaround.gradle.Greet;

public class Main {
  
  public static void main(String[] args) {
    
    // try to get the name from the arguments
    String name = null;
    if (args.length > 0) {
      name = args[0];
    }
    
    Greet greet = new Greet(name);
    
    System.out.println(greet.greet());
  }

}
