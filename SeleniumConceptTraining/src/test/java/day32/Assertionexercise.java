package day32;



import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.testng.Assert;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionexercise {
	WebDriver driver;

	@BeforeMethod()
	public void initialBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Reporter.log("Application Successfully Launched");
	}

	@Test
	public void Alert() throws InterruptedException {

		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		Reporter.log("Clicked On first Alert");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Reporter.log("Clicked On Ok");
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Reporter.log("Get The Alert Message");
		alert.accept();
		
	}
    @Test()
	public void AlertConfirmation() throws InterruptedException {

		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
	    alert.dismiss();
	    String	ExpecterAlertMessage =(driver.findElement(By.id("demo")).getText());
	    Assert.assertEquals("You Pressed ok", ExpecterAlertMessage);
	    System.out.println(" Result Mismatch");
	
	}
  @Test(dependsOnMethods = {"Alert"})
	public void Alertaccepted() throws InterruptedException {

		driver.findElement(By.xpath("//a [contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Selenium Tester");
		alert.accept();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("demo1")).getText());
		
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
