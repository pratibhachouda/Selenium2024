package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumday2 {

	public static void main(String[] args) {
		ChromeDriver  driver = new ChromeDriver();
	      WebDriverManager.chromedriver().setup();
		  driver.navigate().to("https://login.salesforce.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		  // Defining my Explicit wait for 5 second
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
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
	      driver.findElement(By.xpath("//a[normalize-space()='Object Manager']")).click();
	      System.out.println("Object Manager");
	      // driver.quit();
	}

}
