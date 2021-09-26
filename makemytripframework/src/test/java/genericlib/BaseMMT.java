package genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseMMT {

	
	public WebDriver driver = null;
	public static WebDriver driverListener = null;
	public FileLib flib = new FileLib();
	public WebDriverWait wait = null;
	public String pathProp = "./src/test/java/com/testdata/CommonData.properties";
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void configBC(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			driverListener = driver;
		}
		
		
		else if(browser.equals("firefox")) 
		{ 
			  driver = new FirefoxDriver(); driverListener = driver; 
		}
		 
		
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void configBM()
	{
		Reporter.log("Browser Launched",true);
	}
	
	@AfterMethod
	public void configAM()
	{
		Reporter.log("Logged Out",true);
	}
	
	@AfterClass
	public void configAC()
	{
		//driver.close();
	}
}
