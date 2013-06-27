package com.zeroturnaround.gradle;

import org.junit.Assert;
import org.junit.Test;

public class GreetTest {

  @Test
  public void testGreet() {
    Greet greet = new Greet("Joe");
    String greetMessage = greet.greet();
    
    System.out.println("uuuu-haa uuuu-haaa im the junit test") ;
    Assert.assertEquals(greetMessage, "Hello, Joe!");
  }
}
