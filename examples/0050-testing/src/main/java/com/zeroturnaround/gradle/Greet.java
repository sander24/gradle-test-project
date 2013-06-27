package com.zeroturnaround.gradle;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Greet {

  private String name;
  
  public Greet(String _name) {
    this.name = _name;
  }
  
  public String greet() {
    if (name != null) {
      return String.format("Hello, %s!", name); 
    }
    return "Hello!";
  }

  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE)
        .append("name", name)
        .toString();
  }
  
}
