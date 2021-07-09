package com.adactin_runnerclass;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.baseclass.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin_feature\\adactin.feature" , glue = "AdactinStepDefinition")
public class Adactin_Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws IOException{
		
		
		String browserName = FileReaderManager.getfilereader().getCrInstance().getBrowserName();
		driver = Baseclass.browserLanch(browserName);
		driver.manage().window().maximize();
	
	}
	
	@AfterClass
	public static void tearDown(){
		
		driver.quit();
	}
	
}
