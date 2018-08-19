package com.jbk;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies_Example {
public static void main(String [] args)
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.buzzle.com");
	driver.manage().window().maximize();
	
	
	Set<Cookie> cookies=driver.manage().getCookies();
	for(Cookie cookie : cookies)
	{
		System.out.println(cookie.getName());
		System.out.println(cookie.getValue());
		System.out.println(cookie.getDomain());
		System.out.println(cookie.getExpiry());
		System.out.println(cookie.isSecure());
	}
	driver.close();
}
}
