package day26;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JavaSriptExecutoreExe {

    public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.ajio.com/");
		//Creat javascript Executor Instance
		JavascriptExecutor js =(JavascriptExecutor)driver;
	   String title=(String)js.executeScript("return document.title;");
            System.out.println(title);
            Thread.sleep(5000);
            WebElement text=driver.findElement(By.name("searchVal"));
    		js.executeScript("arguments[0].value='Lipstics';",text);
    		System.out.println("Lipstick");
		//scroll  down by 500 pixel vertically
		//if element in bottom of page we can interact through JSE
    		WebElement women=driver.findElement(By.xpath("//a[@title='WOMEN']"));
    		js.executeScript("arguments[0].click();",women);
    		Thread.sleep(2000);
    		WebElement search=driver.findElement(By.xpath("//input[@name='searchVal']"));
    		js.executeScript("arguments[0].value='Bags';",search);


        js.executeScript("window.scrollBy(0,15000)");
       
	      Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@title='Track Your Order']")).click();
        System.out.println("Clicked-Track Your Order");

	}

}
