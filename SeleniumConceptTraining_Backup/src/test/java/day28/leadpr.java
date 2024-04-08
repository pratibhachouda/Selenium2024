package day28;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class leadpr {

	public static void main(String[] args) throws InterruptedException {

	// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			// options.addArguments("--headless");
			ChromeDriver driver = new ChromeDriver(options);

			// Windows Mangae

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			driver.get("https://login.salesforce.com/");
			
		      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pratibhachouda4085@gmail.com");		      driver.findElement(By.id("password")).clear();
		      driver.findElement(By.id("password")).sendKeys("pratibha@min2");
		      driver.findElement(By.id("Login")).click();
			
		      driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();	
			     Thread.sleep(10000);
		       driver.findElement(By.xpath("//p[@class='slds-truncate']//following::p[6]//preceding::p[5]")).click();	
			     System.out.println("Awesome");
			     Thread.sleep(10000);
			     driver.findElement(By.xpath("//div[@class='slds-grid slds-has-flexi-truncate navUL']//child::one-app-nav-bar-item-root[4]")).click();	
			     System.out.println("Leads");
			System.out.println(driver.getTitle());
			JavascriptExecutor js = (JavascriptExecutor) driver;
			Actions action =new Actions(driver);
			try {
				Thread.sleep(6000);
                driver.findElement(By.xpath("//div[@title='New']")).click();
				String titleNewLeads=driver.findElement(By.xpath("//h2[text()='New Lead']")).getText();
				System.out.println(titleNewLeads);
				driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pratibha");
				driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Chouda");
				driver.findElement(By.xpath("//label[text()='Company']/following::input[1]")).sendKeys("Salesforce");
				driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
				
				String msg =driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']")).getText();
				System.out.println(msg);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			finally {
				//driver.close();
			}

		}

	}
	

