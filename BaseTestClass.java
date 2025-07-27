package openCartAbstracta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

// Base test class for initializing WebDriver and Page Object instances
public class BaseTestClass {
	WebDriver driver;

	// Page objects for Home and Account pages
	HomePageClass openCartAbstractaHomePage;
	HomePageClassAccount accountHomePage;
	TestData loginCartTest;

	// This method runs before all tests
	// Initializes the ChromeDriver and Page Object Model classes
	@BeforeTest
	public void initalilzation() {
		// Launch Chrome browser
		driver = new ChromeDriver();
		// Maximize browser window
		driver.manage().window().maximize();

		// Initialize Home page object
		openCartAbstractaHomePage = new HomePageClass(driver);
		// Initialize Account page object
		accountHomePage = new HomePageClassAccount(driver);
		// Initalize TestData
		loginCartTest = new TestData();
	}

	// This method runs after all tests
	// Quits the WebDriver and closes the browser
	@AfterTest
	public void closeDriver() {
		// Close browser and stop WebDriver session
		driver.quit();
	}
}
