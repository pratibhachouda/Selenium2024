package day26;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxExercise{
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/menu/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//a[@href='https://jqueryui.com/controlgroup/']")).click();
			WebElement Frame= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			driver.switchTo().frame(0);
			List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
			int Totalnum = chkbox.size();
			System.out.println("Total Checkbox :"+Totalnum);
			
					
				boolean checkbox= driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
			
				
				System.out.println("Check Box Is selected:"+ "" +checkbox);
				

			}
		}

