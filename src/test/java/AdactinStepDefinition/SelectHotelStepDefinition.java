package AdactinStepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin_runnerclass.Adactin_Runner;
import com.baseclass.Baseclass;

import cucumber.api.java.en.*;

public class SelectHotelStepDefinition extends Baseclass {

	public static WebDriver driver = Adactin_Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	

@When("^user select the hotel$")
public void user_select_the_hotel() throws Throwable {
	
	clickOnElement(pom.getSh().getSelecthotelradiobutton());
	
   
}

@Then("^click the continue button$")
public void click_the_continue_button() throws Throwable {
   
	clickOnElement(pom.getSh().getCountinue_button());
}
	
}
