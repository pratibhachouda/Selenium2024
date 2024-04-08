package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
         driver.findElement(By.linkText("Draggable")).click();
         //found a frame ,switch using index
         driver.switchTo().frame(0);//using index
         WebElement Draggableele = driver.findElement(By.id("draggable"));
         System.out.println(Draggableele.getLocation());//return x y coordinator

	//	 Actions action = new Actions(driver);
		// action.dragAndDropBy(Draggableele, 100, 100).perform();
		// System.out.println("position after drop:"+Draggableele.getLocation());
         
         
         
	}

}
