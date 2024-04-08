package day29;

import org.testng.annotations.Test;

public class TestPriority {
  @Test (priority = 1)
  public void first_method() {
	  System.out.println("Step-1");
  }
  @Test (priority = 2)
  public void Second_method() {
	  System.out.println("Step-2");
	   }
  @Test (priority = 0)
  public void Third_method() {
	 
	  System.out.println("Step-3");
  }
  @Test (priority = 2)
  public void Fourth_method() {
	  System.out.println("Step-4");
  }
  @Test (priority = 5)
  public void Fifth_method() {
	  System.out.println("Step-5");
  }
  @Test (priority = 8)
  public void Six_method() {
	  System.out.println("Step-6");
  }
  @Test (priority = -2)
  public void Seven_method() {
	  System.out.println("Step-7");
  }
 
}
