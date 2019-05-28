package tutorialselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverMac {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/atomar/Documents/workspace_personal/selenium/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get(baseURL);

	}

}
