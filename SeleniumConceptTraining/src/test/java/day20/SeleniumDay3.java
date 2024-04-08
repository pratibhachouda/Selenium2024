package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDay3 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver  driver = new ChromeDriver();
	      WebDriverManager.chromedriver().setup();
		  driver.navigate().to("https://login.salesforce.com/");
		  driver.manage().window().maximize();
		  // Defining my Explicit wait for 5 second
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[@id='username']")).clear();
	      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pratibhachouda4085@gmail.com");
	      driver.findElement(By.id("password")).clear();
	      driver.findElement(By.id("password")).sendKeys("min2@pratibha");
	      driver.findElement(By.id("Login")).click();
	      String title =driver.getTitle();
	       wait.until(ExpectedConditions.titleIs(title));

	      System.out.println("PageTitle:"+title);
	      String postloginuri = driver.getCurrentUrl();
	      System.out.println("Current Uri:"+postloginuri);
	      // Storing WebElement
	     // WebElement servicesetupelement= driver.findElement(By.linkText("Service Setup Assistant"));
	      driver.findElement(By.xpath("//a[contains(text(),'Service Setup Assistant')]")).click();
	      //Applying my condition using Explicit Wait
	    //  wait.until(ExpectedConditions.visibilityOf(servicesetupelement));
	     // servicesetupelement.click(); 
	      System.out.println("Navigated to Service Setup");
	      driver.findElement(By.xpath("//a[starts-with(text(),'Setup Home')]")).click();
	     //driver.findElement(By.xpath("//a[normalize-space()='Object Manager']/child::span)")).click();
	      //driver.findElement(By.xpath("//a[normalize-space()='Object Manager']")).click();
	      //System.out.println("Object Manager");
	      Thread.sleep(10000);
	      driver.findElement(By.xpath("//input[@placeholder='Quick Find']//following::a[3]")).click();
	      Thread.sleep(10000);
	     driver.findElement(By.xpath("//div[@class='slds-icon-waffle']//following::ul[2]/li[2]/a[1]/span[1]")).click();
	     System.out.println("Object Manager");
	     driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();	
	     Thread.sleep(10000);
	     //driver.findElement(By.xpath("//input[@id='input-109']//following::div[4]")).click();	
	     driver.findElement(By.xpath("//p[@class='slds-truncate']//following::p[6]//preceding::p[5]")).click();	
	     System.out.println("Awesome");
	     Thread.sleep(10000);
	     driver.findElement(By.xpath("//div[@class='slds-grid slds-has-flexi-truncate navUL']//child::one-app-nav-bar-item-root[4]")).click();	
	     System.out.println("Leads");
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//div[@class='slds-grid slds-has-flexi-truncate navUL']//child::one-app-nav-bar-item-root[4]//following-sibling::one-app-nav-bar-item-root[1]")).click();
	     System.out.println("contact");
	 	
         // driver.quit();
	   
	}
	
}
