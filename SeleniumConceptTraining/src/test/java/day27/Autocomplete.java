package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autocomplete {



	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/AutoComplete.html");
		
	 driver.findElement(By.xpath("//input[@id='searchbox'and @class='ui-autocomplete-input']")).sendKeys("Ind");
	 List<WebElement> countrylist =driver.findElements(By.xpath("//li[@role='presentation']//a"));
	 System.out.println(countrylist.size());
	 System.out.println("country start with:Ind");
	 for (WebElement country : countrylist) {
		 System.out.println(country.getText());
		 if(country.getText().equals("India")) {
			 country.click();
		 }
		  }
    driver.findElement(By.xpath("//input[@id='searchbox'and @class='ui-autocomplete-input']")).sendKeys("Aust".trim());
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='searchbox'and @class='ui-autocomplete-input']")).sendKeys(Keys.BACK_SPACE);
    Thread.sleep(1000);
    List<WebElement> CountryList1 = driver.findElements(By.xpath("//a[@class='ui-corner-all']"));
 // List<WebElement> CountryList1 = driver.findElements(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
    System.out.println(CountryList1.size());
     System.out.println("country start with:Aust");
for (WebElement Country: CountryList1) {
	System.out.println(Country.getText());
	 Thread.sleep(1000);
if (Country.getText().equals("Australia")) {
Country.click();
}
}
	 
		
	}

}
