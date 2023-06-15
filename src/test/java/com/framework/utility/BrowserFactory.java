package com.framework.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	public static WebDriver startApplycation(WebDriver driver, String browserName, String appURL) {

		if (browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
			driver=new ChromeDriver();

		} else if (browserName.equals("Firefox")) {

		}

		else if (browserName.equals("IE")) {

		}
		else {
			System.out.println("Do not support this browser");
		}
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;
	}

}
