package day26;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MouseHoverPractice {

	

		public static void main(String[] args) throws InterruptedException  {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/menu/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.switchTo().frame(0);
			
		driver.findElement(By.xpath("//div[text()='Electronics']")).click();
		Thread.sleep(3000);
		WebElement electronic = driver.findElement(By.xpath("//div[text()='Electronics']"));
		System.out.println("Click Electronics");
		Actions action = new Actions(driver);
		action.click(electronic).perform();	
		
		
		WebElement car = driver.findElement(By.xpath("//div[text()='Car Hifi']"));
		Thread.sleep(10000);
		action.moveToElement(car).perform();
		System.out.println("Car Hifi");
		}


	}


