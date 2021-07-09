package AdactinStepDefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin_runnerclass.Adactin_Runner;
import com.baseclass.Baseclass;

import cucumber.api.java.en.*;

public class LoginstepDefinition  extends Baseclass{
	

public static WebDriver driver =Adactin_Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user enter url of adactin application$")
	public void user_enter_url_of_adactin_application() throws Throwable {
		String url = FileReaderManager.getfilereader().getCrInstance().getUrl();
		getUrl(url);
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		
	    inputOnElement(pom.getLp().getUsername(), arg1);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    
		inputOnElement(pom.getLp().getPassword(), arg1);
	}

	@When("^user click the login button$")
	public void user_click_the_login_button() throws Throwable {
		
		clickOnElement(pom.getLp().getLogin());
	}

	@Then("^user validate login button$")
	public void user_validate_login_button() throws Throwable {

	}


	
}

	

