package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;
import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicWebdriverMethods {

	public static String browser = "edge"; // External Configuration - XLS,CSV
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.get("https://www.saucedemo.com/v1/");

		driver.manage().window().maximize();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String getTitle = driver.getTitle();
		System.out.println(getTitle);

		String pageSource = driver.getPageSource();
		System.out.println(pageSource);

		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		List<WebElement> webelelments = driver.findElements(By.xpath("//div[@class='inventory_list']/div"));
		System.out.println(webelelments);

		driver.navigate().to("https://www.sugarcrm.com/au");

		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement blogLink = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
		    "#main > div.content-bg.home-content-wrapper > div > div.block.blockV2.block-cta-grid > div > div > div:nth-child(1) > div.text > a")));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", blogLink);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", blogLink);

//		driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[12]/div/div/div[1]/div[1]/a")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

		// driver.quit();

	}

}
