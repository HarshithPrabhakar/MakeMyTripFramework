package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Factory;

public class BookingDetailsPage {

	@FindBy(xpath = "//span[text()='No, I do not wish to secure my trip']/parent::label/input")
	private WebElement dontSecure;
	
	public WebElement getSecure() {
		return secure;
	}

	@FindBy(xpath = "//input[@type=\"radio\" and @value=\"yes\"]")
	private WebElement secure;
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueBooking;
	
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
	
	
	@FindBy(xpath = "//a[text()='CONFIRM']")
	private WebElement confirm;
	
	@FindBy(xpath = "//a[text()='Next']")
	private WebElement next;
	
	
	public WebElement getNext() {
		return next;
	}


	public WebElement getProceedToPay() {
		return proceedToPay;
	}

	@FindBy(xpath = "//span[text()='No, Let Me Choose']")
	private WebElement chooseSeats;
	
	@FindBy(xpath = "//button[text()='Proceed to pay']")
	private WebElement proceedToPay;
	
	
	@FindBy(xpath = "//button[@class=\"addTravellerBtn\"]")
	private WebElement addTraveller;

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
