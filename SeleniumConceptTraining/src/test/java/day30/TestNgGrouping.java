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
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgGrouping {
	WebDriver driver;
	@BeforeTest
    @Test(groups= {"Alert","Sanity","Regression"})
  public void Alert() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
  }
  @Test(groups= {"Alert","Smoke","Sanity"})
  public void AlertConfirmation() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://demo.automationtesting.in/Alerts.html");
	   driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(1000);
		Alert alert =driver.switchTo().alert();
		alert.dismiss();
		System.out.println(driver.findElement(By.id("demo")).getText());
  }
  @Test(groups= {"Alert","Smoke"})
  public void Alertaccepted() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demo.automationtesting.in/Alerts.html");
     driver.findElement(By.xpath("//a [contains(text(),'Alert with Textbox ')]")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Alert alert =driver.switchTo().alert();
	alert.sendKeys("Selenium Tester");
     alert.accept();
	System.out.println(driver.findElement(By.id("demo1")).getText());
	Thread.sleep(2000);
}
  @Test(groups= {"DragAndDown","Sanity"})
	   public void DragAndDown() {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://jqueryui.com/");
	        driver.findElement(By.linkText("Draggable")).click();
	         //found a frame ,switch using index
	         driver.switchTo().frame(0);//using index
	         WebElement Draggableele = driver.findElement(By.id("draggable"));
	         System.out.println(Draggableele.getLocation());//return x y coordinator

	          }
  @Test(groups= {"DragAndDown","Smoke","Regression"})
	 public void FramesActionDragandDrop () throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://jqueryui.com/");
		 Thread.sleep(5000);
         driver.findElement(By.linkText("Droppable")).click();
     
      
          WebElement frame =driver.findElement(By.className("demo-frame"));
		//i found a frame,i want to switch to it
		driver.switchTo().frame(frame);
		//interact with element for that first we need to locate element.
		WebElement Draggableele = driver.findElement(By.id("draggable"));
		WebElement Droppableele =driver.findElement(By.id("droppable"));
		System.out.println("position of draggable;"+Draggableele.getLocation());
		 System.out.println("Drag color;"+Draggableele.getCssValue("Background"));
        // step1 creat reference for actions class
		
		
		Actions action =new Actions(driver);
		//call the method in action class always end with perform method.
		//it has two method 1.dragAndDrop 2.dragAndDropby(in this we provide position)
		action.dragAndDrop(Draggableele, Droppableele).build().perform();
		
		//we need to verify
		
		 System.out.println("Drop postition:"+Draggableele.getLocation());
		 System.out.println("drop color;"+Droppableele.getCssValue("Background"));
		 driver.switchTo().defaultContent();
		 driver.findElement(By.linkText("Demos")).click();
		 
	 }
  
	 @AfterMethod
	  public void teardown() {
		  driver.quit();
	  }
	
}
  

