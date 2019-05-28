package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new SafariDriver();
		String baseURL = "http://www.google.com";
		
		driver.get(baseURL);
		Thread.sleep(3000);
		
		driver.quit();
	}
}