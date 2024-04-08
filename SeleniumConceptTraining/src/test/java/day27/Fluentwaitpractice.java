package day27;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluentwaitpractice {

@SuppressWarnings("unchecked")
public static <WebDriver> void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
			driver.get("https://www.ajio.com/shop/sale");
			//Declare and initialize a fluentWait.
			@SuppressWarnings("rawtypes")
			FluentWait wait = new FluentWait(driver);
			//specify amount of wait
			wait.withTimeout(Duration.ofSeconds(10));
			//specify polling time
			wait.pollingEvery(Duration.ofSeconds(1));
			//specify what exception to ignore
		//	wait.ignoring(NoSuchElementException.class);
			wait.ignoring(NoSuchElementException.class, ElementNotInteractableException.class);
			//we need to specify the condition
		//	wait.until(ExpectedConditions.elementToBeClickable(null));
	}

}
