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

public class WorkingWithIFrame {

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

		//driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.id("iframeResult"));

		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("/html/body/button")).click();
//		String alertText = driver.switchTo().alert().getText();
//		System.out.println(alertText);
//		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		Alert alertonpage = driver.switchTo().alert();
		alertonpage.sendKeys("KOLA KOLA");
		alertonpage.accept();
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
