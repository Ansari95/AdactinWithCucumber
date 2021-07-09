package com.adactin.helper;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.BookAHotelPom;
import com.adactin.pom.Loginpage;
import com.adactin.pom.SearchHotelPom;
import com.adactin.pom.SearchLocation;


public class PageObjectManager {
	

	private static final SearchHotelPom SearchHotelPom = null;

	public static WebDriver driver;
 
	private Loginpage lp;
	private SearchLocation sl;
	private SearchHotelPom sh;
	private BookAHotelPom bh;
	

	public PageObjectManager(WebDriver driver2) {
		this.driver= driver2;
	}
	public BookAHotelPom getbh() {
		bh = new BookAHotelPom(driver);
		return bh;
	}
	
	public SearchHotelPom getSh(){
		
		sh = new SearchHotelPom(driver);
		return sh;
	}
	
	public Loginpage getLp() {
		lp = new Loginpage(driver);
		return lp;
	}
	
	
	public SearchLocation getSl() {
		sl = new SearchLocation(driver);
		return sl;
	}

	


}
