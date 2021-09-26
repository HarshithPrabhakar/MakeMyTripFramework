package com.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.genericlib.BaseMMT;

public class BookRoundTripTicket extends BaseMMT {

	@Test
	public void bookRoundTripTicket() {
		
		// Navigate to Application
		System.out.println(flib.retreiveValue(pathProp, "url"));
		driver.get(flib.retreiveValue(pathProp, "url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		
		
	}
}
