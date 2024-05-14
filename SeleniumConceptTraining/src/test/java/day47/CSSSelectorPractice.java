package day47;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorPractice {
	

	public static void main (String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//to maximize windows
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//launching application
		driver.get("https://dev211885.service-now.com");
		driver.findElement(By.cssSelector("#user_name")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='user_password'][id='user_password']")).sendKeys("O@cP0kFs6qV=");
		driver.findElement(By.cssSelector("#sysverb_login")).click();
}
}