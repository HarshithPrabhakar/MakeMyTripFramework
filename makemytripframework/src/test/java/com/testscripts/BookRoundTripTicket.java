package com.testscripts;

import java.util.Iterator;
import java.util.Set;
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
import com.objectrepository.BookingDetailsAlternatePage;
import com.objectrepository.BookingDetailsPage;
import com.objectrepository.FlightsListPage;
import com.objectrepository.HomePage;

public class BookRoundTripTicket extends BaseMMT {

	String fromCityName = "Mangalore";
	String toCityName = "Bangalore";
	String fromDate = "Mon Oct 04 2021";
	String toDate = "Wed Oct 06 2021";
	String travellerFirstName = "Harshith";
	String travellerLastName = "Prabhakar";
	String mobileNumber = "7019248211";
	String emailId = "abc@gmail.com";
	String seatNumber = "5";
	
	@Test()
	public void bookRoundTripTicket() throws InterruptedException {
		
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
	
	public void bookTicket(HomePage hp) throws InterruptedException
	{	
		hp.getLogin().click();
		hp.getRoundTrip().click();
		hp.getFromCity().click();
		hp.getFromCityName().sendKeys(fromCityName);
		Thread.sleep(3000);
		hp.setFromSuggestion(fromCityName);
		driver.findElement(By.xpath(hp.getFromSuggestion())).click();
		
		hp.getToCityName().sendKeys(toCityName);
		Thread.sleep(3000);
		hp.setFromSuggestion(toCityName);
		driver.findElement(By.xpath(hp.getFromSuggestion())).click();
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("window.scrollBy(0,1000)");
		 */
		
		hp.setSelectDate(fromDate);
		WebElement date = driver.findElement(By.xpath(hp.getSelectDate()));
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
		
		hp.setSelectDate(toDate);
		date = driver.findElement(By.xpath(hp.getSelectDate()));
		wait.until(ExpectedConditions.elementToBeClickable(date));
		date.click();
		hp.getSearch().click();
		
		FlightsListPage fp = PageFactory.initElements(driver, FlightsListPage.class);
		fp.getBookNow().click();
		fp.getContinueBook().click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String pid = it.next();
		String cid = it.next();
		driver.switchTo().window(cid);
		
		try {
			BookingDetailsPage bp = PageFactory.initElements(driver, BookingDetailsPage.class);
			bp.getDontSecure().click();
			detailsTemplate1(bp);
		}
		catch(NoSuchElementException e)
		{
			Reporter.log("Switching to Template 2");
			BookingDetailsAlternatePage bp = PageFactory.initElements(driver, BookingDetailsAlternatePage.class);
			detailsTemplate2(bp);
		}
		
	}
	
	public void detailsTemplate1(BookingDetailsPage bp) throws InterruptedException{
		//bp.getDontSecure().click();
		//Thread.sleep(5000);
		bp.getSecure().click();
		bp.getDontSecure().click();
		bp.getSecure().click();
		bp.getContinueBooking().click();
		bp.getFirstName().sendKeys(travellerFirstName);
		bp.getLastName().sendKeys(travellerLastName);
		bp.getMale().click();
		bp.getMobileNumber().sendKeys(mobileNumber);
		bp.getEmail().sendKeys(emailId);
		bp.getContinueBooking().click();
		bp.getConfirm().click();
		bp.setSelectSeat(seatNumber);
		driver.findElement(By.xpath(bp.getSelectSeat())).click();
		bp.getNext().click();
		bp.setSelectSeat(seatNumber);
		driver.findElement(By.xpath(bp.getSelectSeat())).click();
		bp.getNext().click();
	}
	
	public void detailsTemplate2(BookingDetailsAlternatePage bp) throws InterruptedException{
		Thread.sleep(5000);
		//bp.getDontSecure().click();
		bp.getSecure().click();
		bp.getAddTraveller().click();
		bp.getFirstName().sendKeys(travellerFirstName);
		bp.getLastName().sendKeys(travellerLastName);
		Thread.sleep(5000);
		bp.getMale().click();
		bp.getMobileNumber().sendKeys(mobileNumber);
		bp.getEmail().sendKeys(emailId);
		bp.getContinueBooking().click();
		bp.getConfirm().click();
		bp.getChooseSeats().click();
		seatNumber = "12";
		bp.setSelectSeat(seatNumber);
		driver.findElement(By.xpath(bp.getSelectSeat())).click();
		bp.getContinueBooking().click();
		bp.getChooseSeats().click();
		bp.setSelectSeat(seatNumber);
		driver.findElement(By.xpath(bp.getSelectSeat())).click();
		bp.getContinueBooking().click();
		bp.getProceedToPay().click();
	}
	
}
