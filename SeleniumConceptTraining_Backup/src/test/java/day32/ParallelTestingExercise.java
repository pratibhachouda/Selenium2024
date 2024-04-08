package day32;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestingExercise {
	WebDriver driver;

	//@BeforeMethod()
	//public void initialBrowser() {
		
	

	@Test
	public void Alert() throws InterruptedException {
		System.out.println("Test-1 Executing"+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Reporter.log("Application Successfully Launched");
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println("Test Execution Done1");
	}
    @Test()
	public void AlertConfirmation() throws InterruptedException {
    	System.out.println("Test-2 Executing "+Thread.currentThread().getId());
    	WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Reporter.log("Application Successfully Launched");
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
	    alert.dismiss();
	    String	ExpecterAlertMessage =(driver.findElement(By.id("demo")).getText());
	    Assert.assertEquals("You Pressed Cancel", ExpecterAlertMessage);
	    System.out.println(" Test Execution Done2");
	
	

	}

}



