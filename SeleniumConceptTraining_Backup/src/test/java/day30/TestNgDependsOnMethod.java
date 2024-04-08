package day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgDependsOnMethod {
 
   WebDriver driver;
		@BeforeMethod()
		public void initialBrowser() {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get("https://demo.automationtesting.in/Alerts.html");
		}
	    @Test
	  public void Alert() throws InterruptedException {
		 
		 
			driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			Thread.sleep(1000);
			Alert alert =driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
	  }
	  @Test(dependsOnMethods = {"Alert"})
	  public void AlertConfirmation() throws InterruptedException {
		  
			 
		  
		   driver.findElement(By.linkText("Alert with OK & Cancel")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Thread.sleep(1000);
			Alert alert =driver.switchTo().alert();
			alert.dismiss();
			System.out.println(driver.findElement(By.id("demo")).getText());
	  }
	  @Test(dependsOnMethods = {"Alert"})
	  public void Alertaccepted() throws InterruptedException {
		  
	    
	     driver.findElement(By.xpath("//a [contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert =driver.switchTo().alert();
		alert.sendKeys("Selenium Tester");
	     alert.accept();
		System.out.println(driver.findElement(By.id("demo1")).getText());
		Thread.sleep(2000);
	}
	   
	  
		 @AfterMethod
		  public void teardown() {
			  driver.quit();
		  }
		
	}
	  

