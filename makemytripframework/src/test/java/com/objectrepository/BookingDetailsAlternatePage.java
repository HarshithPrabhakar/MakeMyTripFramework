package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingDetailsAlternatePage {
	
	@FindBy(xpath = "//span[text()='I do not wish to secure my trip']/preceding-sibling::span")
	private WebElement dontSecure;
	
	@FindBy(xpath = "//b[text()='Yes, Secure my trip. ']/parent::span/preceding-sibling::span")
	private WebElement secure;
	
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
	
	
	
	public WebElement getSecure() {
		return secure;
	}

	public WebElement getDontSecure() {
		return dontSecure;
	}

	public WebElement getAddTraveller() {
		return addTraveller;
	}

	public WebElement getContinueBooking() {
		return continueBooking;
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

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getChooseSeats() {
		return chooseSeats;
	}

	public WebElement getProceedToPay() {
		return proceedToPay;
	}

	// Dynamic Elements
	private String selectSeat;
		
	public String getSelectSeat() {
			return selectSeat;
	}

	public void setSelectSeat(String seatNumber) {
			this.selectSeat = "//div[@class=\"seatLabel\" and text()="+"'"+ seatNumber +"'"+"]/ancestor::div[@class=\"seatRow\"]/descendant::div[@class=\"seatBlock pointer\"]";
	}
}
