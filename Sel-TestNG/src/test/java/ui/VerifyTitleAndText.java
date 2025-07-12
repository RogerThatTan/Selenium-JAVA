package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleAndText {

	@Test
	public void titleTest() {

		SoftAssert softassert = new SoftAssert();
		String expectedTitle = "Electronics, errCars, Fashion, Collectibles & More | eBay";
		String expectedText = "Search";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualTitle = driver.getTitle();

		System.out.println("Verifying Title");
		softassert.assertEquals(actualTitle, expectedTitle, "Title Verification Failed");
		String actualText = driver.findElement(By.xpath("//*[@id=\"gh-search-btn\"]")).getAttribute("value");
		System.out.println("Verifying Text");
		softassert.assertEquals(actualText, expectedText, "Text Verification Failed");
		System.out.println("Closing Browser");

		driver.close();
		softassert.assertAll();

	}

}
