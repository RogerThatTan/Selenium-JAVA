package ui;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import java.time.Duration;

import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {

	public static String browser = "firefox"; // External Configuration - XLS,CSV
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://extendsclass.com/text-compare.html#google_vignette");
		driver.manage().window().maximize();

		WebElement sourceText = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/div[8]/pre/span"));

		Actions action = new Actions(driver);
		Thread.sleep(2000);

		action.keyDown(sourceText, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();

		WebElement destination = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[8]/pre/span"));
		Thread.sleep(2000);
		action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}

}
