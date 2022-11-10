package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	public static WebDriver driver;
	
	@Before
	public void initializeDriver() {
		System.setProperty("webdriver.chrome.driver",".//lib//chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Initialize the driver");
	}
	
	@After
	public void quitDriver() {
		driver.quit();
		System.out.println("Close the driver");
	}
}
