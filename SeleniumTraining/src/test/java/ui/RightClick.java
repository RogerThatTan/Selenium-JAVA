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

public class RightClick {

	public static String browser = "chrome"; // External Configuration - XLS,CSV
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		if (browser.equals("chrome")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame);

		WebElement sliderGreen = driver.findElement(By.xpath("//*[@id=\"green\"]"));

		Actions action = new Actions(driver);
		action.dragAndDropBy(sliderGreen, -106, 125).perform();
		Thread.sleep(2000);

	}

}
