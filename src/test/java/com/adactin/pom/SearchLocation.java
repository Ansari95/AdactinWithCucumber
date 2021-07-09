package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchLocation {
	
public static WebDriver driver;
	

	public SearchLocation(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(sdriver, this);
	}
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(id = "hotels")
	private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomType;
	
	@FindBy(id = "room_nos")
	private WebElement numberofRoom;
	
	@FindBy(id = "datepick_in")
	private WebElement checkindate;
	
	@FindBy(id = "datepick_out")
	private WebElement checkoudata;
	
	@FindBy(id = "adult_room")
	private WebElement adultperoom;
	
	@FindBy(id = "child_room")
	private WebElement childerperroom;
	
	@FindBy(id = "Submit")
	private WebElement submit;


	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberofRoom() {
		return numberofRoom;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoudata() {
		return checkoudata;
	}

	public WebElement getAdultperoom() {
		return adultperoom;
	}

	public WebElement getChilderperroom() {
		return childerperroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	

}
