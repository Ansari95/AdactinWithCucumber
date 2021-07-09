package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class BookAHotelPom {
	
	public static WebDriver driver;
	
	
	

	public BookAHotelPom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}



	@FindBy(id ="first_name")
	private WebElement FirstName;
	
	@FindBy(id = "last_name")
	private WebElement LastName;
	
	@FindBy(id ="address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cc_Number;
	
	@FindBy(id ="cc_type")
	private WebElement ccType;
	
	@FindBy(id ="cc_exp_month")
	private WebElement ccExpiry_date;
	
	@FindBy (id = "cc_exp_year")
	private WebElement ccExpiry_year;
	
	@FindBy(id ="cc_cvv")
	private WebElement ccvNumber;
	
	@FindBy(id ="book_now")
	private WebElement BookNow_button;

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_Number() {
		return cc_Number;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcExpiry_date() {
		return ccExpiry_date;
	}

	public WebElement getCcExpiry_year() {
		return ccExpiry_year;
	}

	public WebElement getCcvNumber() {
		return ccvNumber;
	}

	public WebElement getBookNow_button() {
		return BookNow_button;
	}
	
	
	
}
