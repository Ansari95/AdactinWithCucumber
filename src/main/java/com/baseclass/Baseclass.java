package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver browserLanch(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\firstProject\\driverfolder\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		
		return driver;
		
	}
	
	public static void getUrl(String urlName ) {
		
		driver.get(urlName);
	}
	
	
	public static void simplealert() {
			
			driver.switchTo().alert().accept();
		
	}
	
	public static void confirmAler(String Accpet_or_Dismiss) {
		
		if(Accpet_or_Dismiss.equalsIgnoreCase("accept")) {
			
			driver.switchTo().alert().accept();
		}
		if(Accpet_or_Dismiss.equalsIgnoreCase("Dismiss")) {
			
			driver.switchTo().alert().dismiss();
		}
	}
	
	public static void Promptalert(String senkeysValues, String accept_or_Dismiss) {
		
		driver.switchTo().alert().sendKeys(senkeysValues);
		
		if(accept_or_Dismiss.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
		}
		
		if(accept_or_Dismiss.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}
	
	public static void inputOnElement(WebElement element , String value) {
		
		element.sendKeys(value);
	}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();
	}
	
	public static void clearOnElement(WebElement element) {
		
		element.clear();
	}
	

	public static void dropDown (WebElement element, String option, String value) {
		try {
			Select sc = new Select(element);
			if(option.equalsIgnoreCase("index")) {
				int parseInt = Integer.parseInt(value);
				sc.selectByIndex(parseInt);
			}
			else if (option.equalsIgnoreCase("value")) {
				sc.selectByValue(value);
			}
			else if (option.equalsIgnoreCase("text")) {
				sc.selectByVisibleText(value);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		  }
		}
		
	
}
