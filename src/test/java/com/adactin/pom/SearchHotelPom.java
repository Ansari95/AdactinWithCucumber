package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPom {
	
public static WebDriver driver;
	
	public SearchHotelPom(WebDriver sdriver) {
		
		this.driver = sdriver;
		PageFactory.initElements(sdriver, this);
	}



	@FindBy(id = "radiobutton_0")
	private WebElement selecthotelradiobutton;
	
	@FindBy(id = "continue")
	private WebElement countinue_button;
	
	public WebElement getSelecthotelradiobutton() {
		return selecthotelradiobutton;
	}

	public WebElement getCountinue_button() {
		return countinue_button;
	}
	
	
	

}
