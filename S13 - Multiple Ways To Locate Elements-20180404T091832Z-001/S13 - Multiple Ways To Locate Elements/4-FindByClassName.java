package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindByClassName {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "http://demostore.x-cart.com/";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.className("title")).click();
		
		driver.findElement(By.className("leaf")).click();
	}
}