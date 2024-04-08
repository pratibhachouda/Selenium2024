package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import dev.failsafe.internal.util.Durations;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesandActionDragDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 Thread.sleep(5000);
         driver.findElement(By.linkText("Droppable")).click();
     
      
          WebElement frame =driver.findElement(By.className("demo-frame"));
		//i found a frame,i want to switch to it
		driver.switchTo().frame(frame);
		//interact with element for that first we need to locate element.
		WebElement Draggableele = driver.findElement(By.id("draggable"));
		WebElement Droppableele =driver.findElement(By.id("droppable"));
		System.out.println("position of draggable;"+Draggableele.getLocation());
		 System.out.println("Drag color;"+Draggableele.getCssValue("Background"));
        // step1 creat reference for actions class
		
		
		Actions action =new Actions(driver);
		//call the method in action class always end with perform method.
		//it has two method 1.dragAndDrop 2.dragAndDropby(in this we provide position)
		action.dragAndDrop(Draggableele, Droppableele).build().perform();
		
		//we need to verify
		
		 System.out.println("Drop postition:"+Draggableele.getLocation());
		 System.out.println("drop color;"+Droppableele.getCssValue("Background"));
		 driver.switchTo().defaultContent();
		 driver.findElement(By.linkText("Demos")).click();
		 
		 
		
	}
}
