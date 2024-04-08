package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTablePracticeTrain {

	public static void main(String[] args) {
	
		     WebDriverManager.chromedriver().setup();
		       // Launch Chrome browser
		         
		    WebDriver driver = new ChromeDriver();
		      // manage the application 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    // Navigate to erail.in
		driver.get("https://erail.in/");
        driver.findElement(By.xpath("//input[@id='txtStationFrom']")).click();
		      System.out.println("From:New Delhi");
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("BhopalJn");
		driver.findElement(By.xpath("//div[@title='BhopalJn']")).click();
		      System.out.println("To:BhopalJn");
	    driver.findElement(By.id("chkSelectDateOnly")).click();
	    System.out.println("date");
		WebElement quota = driver.findElement(By.xpath("//select[@title='Select seat reservation quota']"));
		Select Quota = new Select(quota);
		Quota.selectByVisibleText("Foreign");
		System.out.println("Foreign");
		WebElement clas = driver.findElement(By.xpath("//select[@id='selectClassFilter']"));
		Select classname = new Select(clas);
		classname.selectByIndex(1);
		//driver.findElement(By.xpath("//input[@value='Get Trains']")).click();
        //driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		     //finding all train list
		WebElement table = driver.findElement(By.id("divMainWrapper"));
	
	     List<WebElement> rows = table.findElements(By.tagName("tr"));
    for (WebElement row : rows) {
        List<WebElement> cells = row.findElements(By.tagName("td"));
        if (cells.size() >= 2) {
            String TrainNo = cells.get(0).getText();
            String TrainName = cells.get(1).getText();
             System.out.println("Train Number: " + TrainNo + ", Train Name: " + TrainName );
            
		
            }

       }
    }
	}   

	


