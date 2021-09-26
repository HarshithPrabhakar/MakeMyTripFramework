package com.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.genericlib.BaseMMT;
import com.objectrepository.HomePage;

public class BookRoundTripTicket extends BaseMMT {

	@Test
	public void bookRoundTripTicket() {
		
		// Navigate to Application
		driver.get(flib.retreiveValue(pathProp, "url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		
		HomePage hp = PageFactory.initElements(driver, HomePage.class);
		wait.until(ExpectedConditions.elementToBeClickable(hp.getRoundTrip()));
		hp.getRoundTrip().click();
		
	}
}
