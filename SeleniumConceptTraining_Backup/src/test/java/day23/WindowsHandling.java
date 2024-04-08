package day23;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




import java.util.ArrayList;

import java.util.Set;




import org.openqa.selenium.support.ui.Select;



public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
    
	//to maximize windows
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	//launching application
	driver.get("https://www.ajio.com/shop/sale");
	driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
	//store all the web element in the list
	WebElement sort = driver.findElement(By.id("sortBy"));
		Select dropdown = new Select(sort);
		 dropdown.selectByVisibleText("What's New");
		 Thread.sleep(3000);
		 //window handling
		String ParentWindow = driver.getWindowHandle();
		System.out.println(ParentWindow);
		 Thread.sleep(5000);
		//driver.findElement(By.xpath("(//label[normalize-space()='Women (21,697)'])[1]")).click();
		driver.findElement(By.xpath("(//div[@role='button'])[17]")).click();
		driver.findElement(By.name("minPrice")).sendKeys("1000");
		driver.findElement(By.name("maxPrice")).sendKeys("5000",Keys.ENTER);
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='five-grid']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[1]/div/div[1]/div/a/div/div[2]/div[1]/strong")).click();
		String  MainWindow = driver.getWindowHandle();
		System.out.println("Parent:"+MainWindow);
		//Switch to window
		Set<String> Winset= driver.getWindowHandles();
		System.out.println("Both Windows:"+Winset);
		System.out.println("Total no of Winodows:"+Winset.size()); 
		List<String> lstWinods = new ArrayList<String>(Winset);
		String childWindow = lstWinods.get(1);
		System.out.println("Child Window:"+childWindow );
		driver.switchTo().window(childWindow);
	     System.out.println(driver.getTitle());
		String Price = driver.findElement(By.xpath("//div[@class='prod-sp']")).getText();
		System.out.println(Price);
		
		 driver.findElement(By.xpath(" //span[contains (text(),'Enter Pin-code')]")).click();
		 driver.findElement(By.xpath(" //input[@name='pincode']")).sendKeys("400040",Keys.ENTER);
	String Deliverdate	 = driver.findElement(By.xpath(" //span[@class='edd-message-success-details-highlighted']")).getText();
		 System.out.println("Expectated Delivery Date:"+Deliverdate);
		//driver.quit();
		 driver.findElement(By.xpath(" //span[contains (text(),'ADD TO BAG')]")).click();
		 System.out.println("Bag Added");
	}
	
}
