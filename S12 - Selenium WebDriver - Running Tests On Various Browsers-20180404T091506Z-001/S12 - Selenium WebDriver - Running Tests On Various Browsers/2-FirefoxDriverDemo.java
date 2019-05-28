package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "/Users/atomar/Documents/workspace_personal/selenium/geckodriver");
		driver = new FirefoxDriver();
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
	}
}