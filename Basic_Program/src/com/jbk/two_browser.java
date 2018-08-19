package com.jbk;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class two_browser {
	
	void two_parameter(String browser, String url)
	{
		System.out.println("in method");
	if(browser=="chrome")
	{
	    System.out.println("in "+browser);
		System.setProperty("webdriver.chrome.driver", "G:\\mobile app testing\\---------------------excel property file\\Browser_drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
	}
	if(browser=="ie")
	{
		System.out.println("in "+browser);
		System.setProperty("webdriver.ie.driver", "G:\\mobile app testing\\---------------------excel property file\\Browser_drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get(url);
	}
	if(browser=="firefox")
	{
		System.out.println("in "+browser);
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
	}
	}
	public static void main(String[] args) {
		System.out.println("welcome");
		two_browser b=new two_browser();
		System.out.println("welcome back");
		b.two_parameter("firefox","file:///G:/mobile app testing/---------------------excel property file/offline website/pages/examples/logout.html");
		
	}
	
	
}


