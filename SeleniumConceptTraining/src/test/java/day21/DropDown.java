package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//to maximize windows
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//launching application
		driver.get("https://www.ajio.com/shop/sale");
		driver.findElement(By.name("searchVal")).sendKeys("Bags",Keys.ENTER);
		
		WebElement sort = driver.findElement(By.id("sortBy"));
		Select dropdown = new Select(sort);
		 //dropdown.selectByIndex(3);
		//dropdown.selectByValue("prce-asc");
		
		dropdown.selectByVisibleText("Discount");
		dropdown.getFirstSelectedOption();
		System.out.println(dropdown.getFirstSelectedOption().getText());
		//to get all options from drop down
		List<WebElement>dropdownoptions=dropdown.getOptions();
		
		for(WebElement value :dropdownoptions){
		System.out.println(value.getText());}
		
		//if we r using multi select dropdown
		System.out.println(dropdown.isMultiple());
		//System.out.println(dropdown.getAllSelectedOptions());
		//System.out.println(dropdown.deselectAll());
}
}