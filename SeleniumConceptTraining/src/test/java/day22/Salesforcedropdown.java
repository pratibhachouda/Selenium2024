package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforcedropdown {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver  driver = new ChromeDriver();
    WebDriverManager.chromedriver().setup();
	  driver.navigate().to("https://login.salesforce.com/");
	  driver.manage().window().maximize();
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
    driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();	
    Thread.sleep(10000);
   
   driver.findElement(By.xpath("//p[@class='slds-truncate']//following::p[6]//preceding::p[5]")).click();	
   System.out.println("Awesome");
   Thread.sleep(10000);
   driver.findElement(By.xpath("//div[@class='slds-grid slds-has-flexi-truncate navUL']//child::one-app-nav-bar-item-root[4]")).click();	
   System.out.println("Leads");
   driver.findElement(By.xpath("//button[@id='combobox-button-527']")).click();
   Thread.sleep(2000);
  // driver.findElement(By.xpath("//button[@id='combobox-button-527']")).click();
	
   // driver.quit();
 
}

}



