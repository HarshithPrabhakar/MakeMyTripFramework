package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//li[text()='Round Trip']")
	private WebElement roundTrip;
	
	@FindBy(xpath="//label[@for=\"fromCity\"]")
	private WebElement fromCity;
	
	@FindBy(xpath="//label[@for=\"toCity\"]")
	private WebElement toCity;
	
	@FindBy(xpath="//label[@for=\"departure\"]")
	private WebElement departureDate;
	
	@FindBy(xpath="//label[@for=\"return\"]")
	private WebElement returnDate;
	
	@FindBy(xpath="//input[@placeholder=\"From\"]")
	private WebElement fromCityName;
	
	@FindBy(xpath="//p[text()=\"Mangalore, India\"]")
	private WebElement fromSuggestion;
	
	@FindBy(xpath="//input[@placeholder=\"To\"]")
	private WebElement toCityName;
	
	@FindBy(xpath="//span[@class=\"langCardClose\"]")
	private WebElement closeAd;
	
	@FindBy(xpath = "//li[@data-cy=\"account\"]")
	private WebElement login;

	public WebElement getCloseAd() {
		return closeAd;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getRoundTrip() {
		return roundTrip;
	}

	public WebElement getFromCity() {
		return fromCity;
	}

	public WebElement getToCity() {
		return toCity;
	}

	public WebElement getDepartureDate() {
		return departureDate;
	}

	public WebElement getReturnDate() {
		return returnDate;
	}

	public WebElement getFromCityName() {
		return fromCityName;
	}

	public WebElement getFromSuggestion() {
		return fromSuggestion;
	}

	public WebElement getToCityName() {
		return toCityName;
	}
}
