package com.zeroturnaround.gradle;

import org.junit.Assert;
import org.junit.Test;

import com.zeroturnaround.gradle.Greet;

public class GreetTest {

  @Test
  public void testGreet() {
    Greet greet = new Greet();
    String answer = greet.greet();
    Assert.assertEquals(answer, "Hello!");
  }

}
