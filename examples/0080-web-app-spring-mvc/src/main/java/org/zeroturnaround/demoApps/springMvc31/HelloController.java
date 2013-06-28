package org.zeroturnaround.demoApps.springMvc31;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.IOException;

@Controller
@RequestMapping("/test")
public class HelloController {
  
  // ==========================================
  // Copy method in/out to toggle between version0/version1

  @RequestMapping("/hello")
  public ModelAndView handleRequest() throws ServletException, IOException {
    String a = "agagagagasasgadagasgasgaa";
    System.out.println(" -- invoked Spring MVC controller action");
    return new ModelAndView("hello.jsp");
  }

  // just another one..
  
//  @RequestMapping("/hello2")
//  public ModelAndView handleRequest2() throws ServletException, IOException {
//    String a = "agagagaa";
//    return new ModelAndView("hello.jsp");
//  }
  
}
