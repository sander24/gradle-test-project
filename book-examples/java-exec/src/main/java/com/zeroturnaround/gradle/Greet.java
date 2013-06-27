package com.zeroturnaround.gradle;

public class Greet {

  public Greet() {}
  
  public String greet(String name) {
    if (name != null) {
      return String.format("Hello, %s!", name); 
    }
    return "Hello!";
  }

}
