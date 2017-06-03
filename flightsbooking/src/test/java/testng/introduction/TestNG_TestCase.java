package testng.introduction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG_TestCase {
	private WebDriver driver;
	private String baseUrl;
	private static final Logger log = LogManager.getLogger(TestNG_TestCase.class.getName());

	@BeforeMethod
	public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Rakib/Downloads/chromeDriver/chromedriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		SearchPage.navigateToFlightsTab(driver);
		SearchPage.fillOriginTextBox(driver, "Newark, NJ, United States (EWR-Liberty Intl.)");
		SearchPage.destinationTextBox(driver).sendKeys("Houston");
		SearchPage.departureDateTextBox(driver);
		SearchPage.returnDateTextBox(driver);
		SearchPage.searchButton(driver);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}

}

