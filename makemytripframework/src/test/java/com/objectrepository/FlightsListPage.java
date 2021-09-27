package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsListPage {

	@FindBy(xpath = "//button[text()='Book Now']")
	private WebElement bookNow;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueBook;

	public WebElement getContinueBook() {
		return continueBook;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	
}
