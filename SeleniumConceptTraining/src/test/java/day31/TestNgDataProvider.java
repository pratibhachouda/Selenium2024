package day31;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestNgDataProvider {
  @Test(dataProvider = "First")
  public void f(String n, String s) {
	  System.out.println(n+","+s);
  }

  @DataProvider(name= "First")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Saurabh", "Pratibha" },
      new Object[] {"10", "5" },
      new Object[] {"Advik", "5" },
      new Object[] {"10", "Geoprgia" },
    };
  }
  @DataProvider (name= "Second")
  public Object[][] dp1(){
		   return new Object[][] {
	      new Object[] {"Sh", "Pratibha" },
	      new Object[] {"10", "15" },
	      new Object[] {"Advik", "5" },
	      new Object[] {"10", "Ahaan" },
	    };
	  }
}
		  