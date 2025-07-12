package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {

	@Test
	public void titleTest() {

		String expectedTitle = "Electronics, Cars, KolaFashion, Collectibles & More | eBay";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.close();
		

	}

}
