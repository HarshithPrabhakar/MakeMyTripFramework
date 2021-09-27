package com.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.genericlib.BaseMMT;
import com.objectrepository.HomePage;

public class BookRoundTripTicket extends BaseMMT {

	String fromCityName = "Mangalore";
	String toCityName = "Bangalore";
	String fromDate = "Tue Sep 28 2021";
	String toDate = "Wed Sep 29 2021";
	
	@Test()
	public void bookRoundTripTicket() {
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		
		// Navigate to Application
		driver.get(flib.retreiveValue(pathProp, "url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		
		try {
			hp.getCloseAd().click();
			bookTicket(hp);
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("Ad missing");
			bookTicket(hp);
		}
	}
	
	public void bookTicket(HomePage hp)
	{	
		hp.getLogin().click();
		hp.getRoundTrip().click();
		hp.getFromCity().click();
		hp.getFromCityName().sendKeys(fromCityName);
		hp.setFromSuggestion(fromCityName);
		driver.findElement(By.xpath(hp.getFromSuggestion())).click();
		
		hp.getToCityName().sendKeys("Bangalore");
		hp.setFromSuggestion(toCityName);
		driver.findElement(By.xpath(hp.getFromSuggestion())).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		hp.setSelectDate(fromDate);
		WebElement date = driver.findElement(By.xpath(hp.getSelectDate()));
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
		
		hp.setSelectDate(toDate);
		date = driver.findElement(By.xpath(hp.getSelectDate()));
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
	}
}
