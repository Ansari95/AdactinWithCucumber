package AdactinStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin_runnerclass.Adactin_Runner;
import com.baseclass.Baseclass;

import cucumber.api.java.en.*;

public class Book_A_hotel_stepDefinition extends Baseclass {
	
	public static WebDriver driver = Adactin_Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@When("^user enter \"([^\"]*)\" as firstname$")
	public void user_enter_as_firstname(String arg1) throws Throwable {
		
		inputOnElement(pom.getbh().getFirstName(), arg1);
	   
	}

	@When("^user enter \"([^\"]*)\" as lastname$")
	public void user_enter_as_lastname(String arg1) throws Throwable {
		
	    inputOnElement(pom.getbh().getLastName(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as building address$")
	public void user_enter_as_building_address(String arg1) throws Throwable {
	  
		inputOnElement(pom.getbh().getAddress(), arg1);
	}

	@When("^enter \"([^\"]*)\" as card number$")
	public void enter_as_card_number(String arg1) throws Throwable {
	   inputOnElement(pom.getbh().getCc_Number(), arg1);
	}

	@When("^user select card type$")
	public void user_select_card_type() throws Throwable {
	    dropDown(pom.getbh().getCcType(), "text", "VISA");
	}

	@When("^user select expiry date$")
	public void user_select_expiry_date() throws Throwable {
		
	    dropDown(pom.getbh().getCcExpiry_date(),"text","February");
	    dropDown(pom.getbh().getCcExpiry_year(), "text", "2022");
	}

	@When("^user enter \"([^\"]*)\" as cvv number$")
	public void user_enter_as_cvv_number(String arg1) throws Throwable {
		inputOnElement(pom.getbh().getCcvNumber(), arg1);
		
	}

	@Then("^user click book now button$")
	public void user_click_book_now_button() throws Throwable {
		
	    clickOnElement(pom.getbh().getBookNow_button());
	    
	}



}
