package slenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {
   static WebDriver driver;
	public static void main(String[] args) {
		//Selenium 2 and 3
	//set the system properties to the path of webdriver executable,to inform selenium where to find the driver executable	
	System.setProperty("webdriver.chrome.driver","c://user//pratibha//onedrive//desktop//myfile");
	driver =new ChromeDriver();
	//Instantiate the Webdriver to specific browser type
    //Selenium  Version 4,webdriver manager came into picture,which manage all browser drivers
	//web drivermanager is a library that simplify the process of managing and initializing webdriver instance in selenium.
	//its also help us in downloading and setting up of Browser driver,which reduce the manual step.
	//selenium setup
	//browser should be 

	//instanstiate webdriver
	//webdriver =driver;
	//need to specify which brower we want to execute our code
	//for that we need to use webdriver manager
	
	//step2 setup the chromedriver using webdriver manager
	//webdriver
	}

}