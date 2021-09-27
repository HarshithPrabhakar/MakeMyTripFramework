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
	
	@FindBy(xpath="//input[@placeholder=\"To\"]")
	private WebElement toCityName;
	
	@FindBy(xpath="//span[@class=\"langCardClose\"]")
	private WebElement closeAd;
	
	@FindBy(xpath = "//li[@data-cy=\"account\"]")
	private WebElement login;
	
	@FindBy(xpath = "//a[text()='Search']")
	private WebElement search;
	

	public WebElement getSearch() {
		return search;
	}

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

	public WebElement getToCityName() {
		return toCityName;
	}
	
	// Dynamic Elements
	private String fromSuggestion;
	
	public String getFromSuggestion() {
		return fromSuggestion;
	}

	public void setFromSuggestion(String cityName) {
		this.fromSuggestion = "//li[@data-suggestion-index=\"0\"]/descendant::p[contains(text(),"+ cityName +")]";
	}
	
	
	private String selectDate;

	public String getSelectDate() {
		return selectDate;
	}

	public void setSelectDate(String selectDate) {
		this.selectDate = "//div[@aria-label="+"'"+ selectDate +"'"+ "]";
	}
}
