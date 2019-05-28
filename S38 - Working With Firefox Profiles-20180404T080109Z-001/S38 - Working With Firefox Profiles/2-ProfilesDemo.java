package tutorialselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class ProfilesDemo {

	public static void main(String[] args) {
		String baseURL = "http://www.google.com";
		WebDriver driver;
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile fxProfile = profile.getProfile("seleniumtest");
		
		driver = new FirefoxDriver(fxProfile);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
}