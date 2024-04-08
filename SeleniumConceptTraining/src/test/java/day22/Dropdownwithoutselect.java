package day22;

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

public class Dropdownwithoutselect {

	private static final List<WebElement> WebElement = null;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//to maximize windows
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		//launching application
		driver.get("https://www.ajio.com/shop/sale");
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		//store all the web element in the list
		//locate the Dropdown
			WebElement sort = driver.findElement(By.id("sortBy"));
           sort.click();
        List<WebElement>options = driver.findElements(By.xpath("//div[@class='filter-dropdown']//descendant::option"));
       //findElement-if element not available will throw error
      //findElements-it will return the list of matching element,if Element is not Available it will return NULL value
	System.out.println(options.size());
	//select Rating from DropDown options
	//for(int i=0;i<options.size();i++) {
	//	System.out.println(options.get(i).getText());
	//	if (options.get(i).getText().contains("Ratings")) {
	//		options.get(i).click();
		//	break;
	//	}
//	}
	sort.click();
	String sortUsing = "Ratings";
	
	try {
		for (WebElement option : options) {
			System.out.println(option.getText());
			if (option.getText().contains(sortUsing)) {
				option.click();
			}
		}
		sort.click();
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(screenshotFile,new File( "./snaps/snap1.jpg"));
		
	} catch (Exception e) {
		// TODO: handle exception
	}
			//Take Screen shot
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          // FileUtils.copyFile(screenshotFile,new File( "C:\\Users\\Advik\\eclipse-workspace\\SeleniumConceptTraining\\Screenshot//snap.jpg"));
			
           FileUtils.copyFile(screenshotFile,new File( "./snaps/snapCatch.jpg"));
			}
}
