package AdactinStepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin_runnerclass.Adactin_Runner;
import com.baseclass.Baseclass;

import cucumber.api.java.en.*;

public class SearchLocationStepDefinition extends Baseclass{
	
public static WebDriver driver = Adactin_Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	
@When("^user select location of hotel$")
public void user_select_location_of_hotel() throws Throwable {
	
	dropDown(pom.getSl().getLocation(), "index", "1");
  
}

@When("^user select hotel name$")
public void user_select_hotel_name() throws Throwable {
	
	dropDown(pom.getSl().getHotels(), "text", "Hotel Sunshine");
  
}

@When("^user select room type$")
public void user_select_room_type() throws Throwable {
	
	dropDown(pom.getSl().getRoomType(), "text", "Double");
    
}

@When("^user select number of rooms$")
public void user_select_number_of_rooms() throws Throwable {
	
	
    dropDown(pom.getSl().getNumberofRoom(), "text", "3 - Three");
}

@When("^user enter check in date \"([^\"]*)\"$")
public void user_enter_check_in_date(String arg1) throws Throwable {
   
	dropDown(pom.getSl().getCheckindate(), "text", arg1);
}

@When("^user enter check out date \"([^\"]*)\"$")
public void user_enter_check_out_date(String arg1) throws Throwable {
	
	dropDown(pom.getSl().getCheckoudata(), "text", arg1);
 
}

@When("^user select adult per room$")
public void user_select_adult_per_room() throws Throwable {
    
	dropDown(pom.getSl().getAdultperoom(), "text", "2 - Two");
}

@When("^user select child per room$")
public void user_select_child_per_room() throws Throwable {
 
	dropDown(pom.getSl().getChilderperroom(), "text", "2 - Two");
	
}

@Then("^user click search button$")
public void user_click_search_button() throws Throwable {
	
   clickOnElement(pom.getSl().getSubmit());
}


}
