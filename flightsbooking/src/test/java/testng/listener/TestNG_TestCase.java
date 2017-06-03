package testng.listener;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testng.introduction.SearchPage;



//@Listeners(utilities.SeleniumListeners.class)
public class TestNG_TestCase {
	private WebDriver driver;
	
	public WebDriver getDriver() {
        return driver;
	}
        
	private String baseUrl;
	static Logger log = LogManager.getLogger(TestNG_TestCase.class.getName());

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void beforeMethod() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() throws Exception {
		driver.get(baseUrl);
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "Newark, NJ, United States (EWR-Liberty Intl.)");
		SearchPage.destinationTextBox(driver).sendKeys("Houston");
	}
	
	@Test
	public void testMethod1() throws Exception {
		SearchPage.departureDateTextBox(driver);
		
		SearchPage.returnDateTextBox(driver);
	}

	@AfterMethod
	public void afterMethod() {
	}

}
