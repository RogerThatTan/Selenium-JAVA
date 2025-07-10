package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static String browser = "edge"; // External Configuration - XLS,CSV
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (browser.equals("Firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing");
		
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.close();
		
	}

}
