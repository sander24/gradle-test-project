package com.zeroturnaround.gradle;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class GreetTest {

  @Test
  public void testGreet() {
    Greet greet = new Greet();
    
     System.out.println("Test if pricePerMonth returns Euro...") ;
     Subscription S = new Subscription(200,2) ;
     assertTrue(S.pricePerMonth() == 1.0) ;
  }
}
