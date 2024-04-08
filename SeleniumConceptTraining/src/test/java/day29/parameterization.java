package day29;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class parameterization {
	@Parameters({"MyName","Myaddress"})
  @Test
  public void parametertest(String Name,String Address){
		System.out.println("Good Morning,"+Name +" "+ Address);
  }
	
	  
	 
}
