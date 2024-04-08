package day18;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.page.model.NavigatedWithinDocument;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class SelenniumDay1 {
	//step 0 Selenium setput
    //step1 webdriver initialization
              //WebDriver driver;//(webdriver Intialization is not Required
        public static void main(String[] args) {
		 
	      //setp2 setup BrowserDriver(ChromeDriver/GeckoDriver/EdgeDriver)using WebDriver Manager
		
	     
	      
	      //set2 launch Chrome Browser(Chrome Driver is a Class)
	      
	      ChromeDriver  driver = new ChromeDriver();
	      
	      //step3 launch the application/url
	      //using get
	 
	      //if we are using navigate method we can forward and backward
	      //refresh page
	      //implicit wait is global session/once applied it will be application to all test steps
	      //driver.get("https://login.salesforce.com/");
	      //get method cannot navigate back or forward.
	      //driver.close();
	      //refresh page
	      //driver.close();
	      //driver.navigate().refresh();
	      //driver.navigate().back();
	    //  //driver.navigate().forward();
	      WebDriverManager.chromedriver().setup();
	    //  ChromeDriver  driver = new ChromeDriver();
	      driver.navigate().to("https://login.salesforce.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	      driver.findElement(By.id("username")).clear();
	      driver.findElement(By.id("username")).sendKeys("pratibhachouda4085@gmail.com");
	     // driver.findElement(By.id("password")).clear();
	      driver.findElement(By.id("password")).sendKeys("min2@pratibha");
	      driver.findElement(By.id("Login")).click();
	      String title =driver.getTitle();
	      System.out.println("PageTitle:"+title);
	      String postloginuri = driver.getCurrentUrl();
	      System.out.println("Current Uri:"+postloginuri);
	     // driver.close();
	}

}