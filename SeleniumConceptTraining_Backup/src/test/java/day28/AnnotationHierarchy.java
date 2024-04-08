package day28;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierarchy {
  
  @Test
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before Method"); 
  }
  @Test
  @AfterMethod
  public void afterMethod() {
	  System.out.println("after Method"); 
  }
  @Test
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before Class"); 
  }
  @Test
  @AfterClass
  public void afterClass() {
	  System.out.println("after Class"); 
  }
  @Test
  @BeforeTest
  public void beforeTest() {
	  System.out.println("before Test"); 
  }
  @Test
  @AfterTest
  public void afterTest() {
	  System.out.println("after Test"); 
  }
  @Test
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before Suit"); 
  }
  @Test
  @AfterSuite
  public void afterSuite() {
	  System.out.println("after Suit"); 
  }

}
