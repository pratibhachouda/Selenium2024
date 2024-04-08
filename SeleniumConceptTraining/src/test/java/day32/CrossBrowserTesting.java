package day32;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	
	
//	public static void main(String[]args) {
		
		//ChromeDriver cd = new ChromeDriver();
	//	EdgeOptions ed = new EdgeOptions();
		//@Parameters("browser")
	//	@BeforeTest
		//public void InitializeBrowser(String browser){
			
	//	}
	//    @Test
	//    @Parameters({"browser"})
		public void LaunchBrowser(String browser) {
			System.out.println("Chrome Test Running");
	    	if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			
		}
	    	else if (browser.equals("Edge")){
	    		System.out.println("Edge Test Running");
	    		WebDriverManager.edgedriver().setup();
	    		EdgeOptions driver1 = new EdgeOptions();
			
	     ((WebDriver) driver1).get("https://login.salesforce.com/");
				
			
		}
	    }
		

	}
    	
	



