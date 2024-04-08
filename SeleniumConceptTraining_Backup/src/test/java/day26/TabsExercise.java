package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabsExercise {
           public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/tabs/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@id='content']")).click();
			WebElement frame = driver.findElement(By.xpath("//div[@id='content']"));
		    driver.switchTo().frame(0);
		   
		    List<WebElement> Tabs = driver.findElements(By.xpath("//li[@role='tab']"));
		    List<WebElement> contents = driver.findElements(By.xpath("//div[@role='tabpanel']"));
		    int Tottab = Tabs.size();
			System.out.println("Total Tab :" + "   "+Tottab);
	        boolean tabs= driver.findElement(By.xpath("//li[@role='tab']")).isDisplayed();
			System.out.println("Displayed:"+"    "+tabs   );
		      for(WebElement tab:Tabs) {
			tab.click();
			System.out.println("Tabs:"+ "   "+tab.getText());
				int tabIndex=Tabs.indexOf(tab);
				 WebElement contentMessage= contents.get(tabIndex);
		       System.out.println("content:"+ "   "+contentMessage.getText());
			System.out.println("*****************************************************");
				
				}
			}
			
	}


