package day29;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Opportunity {
	@Test
	  public void f() {
		  System.out.println("Test Executed from Opportunity class");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Before Method from Opportunity class");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("After Method from Opportunity class");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Before Class from Opportunity class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("After Class from Opportunity class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Before Test from Opportunity class");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("After Test from Opportunity class");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("before Suite from Opportunity class");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("After Suite from Opportunity class");
	  }

	}