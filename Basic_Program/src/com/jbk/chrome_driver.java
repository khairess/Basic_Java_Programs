package com.jbk;

//import java.io.File;
//import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class chrome_driver {

	
		public static void main(String[] args)
	{
			//ClassLoader loader = ClassLoader.getSystemClassLoader();
	        //URL path = loader.getResource("chromedriver.exe");
	        System.setProperty("webdriver.chrome.driver", "G:\\mobile app testing\\---------------------excel property file\\Browser_drivers\\chromedriver.exe");
	        
	        //C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe
			//System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");
			
			System.out.println("1");
			WebDriver driver = new ChromeDriver();
			System.out.println("2");
			String baseUrl = "http://newtours.demoaut.com";
			System.out.println("3");
			driver.get(baseUrl);
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
	}
	
}
