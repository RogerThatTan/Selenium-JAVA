package ui;

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

public class WorkingWithRadioButton {

	public static String browser = "Firefox"; // External Configuration - XLS,CSV
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
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

		driver.get("https://www.singaporeair.com/en_UK/bd/home#/checkin");
		driver.manage().window().maximize();
		// driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		
		WebElement radio1 = driver.findElement(By.id("eticketNumberRadioCheckIn"));
		radio1.click();
		radio1.isSelected();
		Thread.sleep(2000);
		if(radio1.isSelected()) {
			driver.findElement(By.id("sqMiBookingRadio")).click();
		}

		System.out.println(driver.findElements(By.xpath("//*[@name=\"sq-mi-book-ref-flight-radio\"]")).size());
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
