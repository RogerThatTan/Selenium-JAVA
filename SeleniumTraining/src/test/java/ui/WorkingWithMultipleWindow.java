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

public class WorkingWithMultipleWindow {

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

		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"1682325589592_4ma\"]/div[1]/article/div[2]/div/pbc-button[1]/a"))
				.click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Iterator<String> iterator = windows.iterator();

		String parent = iterator.next();
		System.out.println(parent);
		String child = iterator.next();
		System.out.println(child);

		driver.switchTo().window(child);
		driver.findElement(By.name("UserFirstName")).sendKeys("Selenium");
		driver.findElement(By.name("UserLastName")).sendKeys("Testing");
		driver.switchTo().window(parent);

	}

}
