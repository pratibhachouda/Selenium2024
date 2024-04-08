package day26;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class RadioButtonExercise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/menu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//a[@href='https://jqueryui.com/controlgroup/']")).click();
		WebElement parentframe= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(parentframe);
		List<WebElement> radiobutt = driver.findElements(By.xpath("//input[@type='radio']"));
		int Totnum = radiobutt.size();
		System.out.println("Radio Button Size :" + "   "+Totnum);
		
				
			boolean radiobutton= driver.findElement(By.xpath("//input[@type='radio']")).isSelected();
			System.out.println("IsSelected:"+ "  " +radiobutton);

	}

}

