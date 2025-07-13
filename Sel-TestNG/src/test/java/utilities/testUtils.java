package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import common.BaseTest;

public class testUtils extends BaseTest {

	public void getScreenshot() throws IOException {
		LocalDateTime currentDate = LocalDateTime.now();
		String screenshotFileName = currentDate.toString().replace(":", "-");
		
		File screenshotDir = new File(".//screenshot");
		if (!screenshotDir.exists()) {
			screenshotDir.mkdirs(); // Create directory if it doesn't exist
		}

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(screenshotDir, screenshotFileName + ".png"));
	}
}
