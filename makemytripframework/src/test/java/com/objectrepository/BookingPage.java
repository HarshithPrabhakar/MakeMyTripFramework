package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Factory;

public class BookingPage {

	@FindBy(xpath = "//span[text()='No, I do not wish to secure my trip']/parent::label/input")
	private WebElement dontSecure;
	
	@FindBy(xpath = "//button[@class=\"addTravellerBtn\"]")
	private WebElement addTraveller;
	
	@FindBy(xpath = "//input[@placeholder=\"First & Middle Name\"]")
	private WebElement firstName;
	
	@FindBy(xpath = "//input[@placeholder=\"Last Name\"]")
	private WebElement lastName;
	
	@FindBy(xpath = "//span[text()='MALE']")
	private WebElement male;
	
	@FindBy(xpath = "//input[@placeholder=\"Mobile No\"]")
	private WebElement mobileNumber;
	
	@FindBy(xpath = "//input[@placeholder=\"Email\"]")
	private WebElement email;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueBooking;
	
	@FindBy(xpath = "//a[text()='CONFIRM']")
	private WebElement confirm;
	
	@FindBy(xpath = "//span[text()='No, Let Me Choose']")
	private WebElement chooseSeats;
	
	@FindBy(xpath = "//button[text()='Proceed to pay']")
	private WebElement proceedToPay;

	public WebElement getDontSecure() {
		return dontSecure;
	}


	public WebElement getAddTraveller() {
		return addTraveller;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getMale() {
		return male;
	}


	public WebElement getMobileNumber() {
		return mobileNumber;
	}


	public WebElement getEmail() {
		return email;
	}


	public WebElement getContinueBooking() {
		return continueBooking;
	}


	public WebElement getConfirm() {
		return confirm;
	}


	public WebElement getChooseSeats() {
		return chooseSeats;
	}
	
	// Dynamic Elements
	private String selectSeat;
	
	public String getSelectSeat() {
		return selectSeat;
	}

	public void setSelectSeat(String seatNumber) {
		this.selectSeat = " //div[@class=\"seat_label\" and text()="+"'" + seatNumber + "'"+"]/ancestor::div[@class=\"seat_row \"]/descendant::div[@class=\"seat_block cursor_pointer\"]";
	}
	
}
