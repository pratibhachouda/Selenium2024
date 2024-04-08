package day28;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class CreatLeadusingTestNg {
	ChromeDriver driver;
	
	
	@Test
	public void initialSet() throws InterruptedException {
	
	// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeOptions options = new ChromeOptions();
		 // to avoid any kind of notifications
		 options.addArguments("--disable-notifications");
		 //the browser will not open if you useheadless mode
				//options.addArguments("--headless");
		 driver = new ChromeDriver(options);
		       // Windows Mangae
		  driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://login.salesforce.com/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pratibhachouda4085@gmail.com");		      
		driver.findElement(By.id("password")).sendKeys("pratibha@min2");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();	
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']//following::p[6]//preceding::p[5]")).click();	
		System.out.println("Sales");
		 Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='slds-grid slds-has-flexi-truncate navUL']//child::one-app-nav-bar-item-root[4]")).click();	
		System.out.println("Leads");
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions action =new Actions(driver);
		 try {
		Thread.sleep(6000);
		    driver.findElement(By.xpath("//div[@title='New']")).click();
			String titleNewLeads=driver.findElement(By.xpath("//h2[text()='New Lead']")).getText();
		    System.out.println(titleNewLeads);
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sakshi");
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sachdev");
			driver.findElement(By.xpath("//label[text()='Company']/following::input[1]")).sendKeys("Salesforce");
			driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
						
			String msg =driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
			System.out.println(msg);
			} catch (Exception e) {
				e.printStackTrace();
					}
				finally {
				//driver.close(); 

				}

	}
	 
  
    @Test
  public void f() { }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method");
  }
 @AfterMethod
  public void afterMethod() {
	  System.out.println("After method");
  }
 @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }
 @BeforeTest
  public void beforeTest() {
	
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }
   @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit");
	  }
 @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suit");
  }

}
