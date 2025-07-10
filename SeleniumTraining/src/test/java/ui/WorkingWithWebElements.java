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

public class WorkingWithWebElements {

	public static String browser = "Firefox"; // External Configuration - XLS,CSV
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

		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]")).click();
		driver.findElement(By.name("input_3.3")).sendKeys("Testing");
		driver.findElement(By.name("input_3.3")).clear();
		System.out.println(	driver.findElement(By.name("input_3.3")).getAttribute("id"));
		System.out.println(	driver.findElement(By.id("gform_submit_button_1")).getCssValue("text-transform"));
		System.out.println(	driver.findElement(By.id("gform_submit_button_1")).getSize());
		System.out.println(	driver.findElement(By.id("gform_submit_button_1")).getLocation());
		System.out.println(	driver.findElement(By.id("gform_submit_button_1")).getText());
		System.out.println(	driver.findElement(By.id("gform_submit_button_1")).getTagName());
		System.out.println(	driver.findElement(By.id("gform_submit_button_1")).isDisplayed());
		System.out.println(	driver.findElement(By.id("gform_submit_button_1")).isEnabled());
		System.out.println(	driver.findElement(By.id("gform_submit_button_1")).isSelected());
		
		driver.close();

	}

}
