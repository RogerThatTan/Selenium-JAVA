package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {

	public void onTestStart(ITestResult result) {
		// Called when any test method is about to start
		System.out.println("Test case is starting");
	}

	public void onTestSuccess(ITestResult result) {
		// Called when a test method succeeds
	}

	public void onTestFailure(ITestResult result) {
		// Called when a test method fails
		System.out.println("Test failed - Screenshot captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void onTestSkipped(ITestResult result) {
		// Called when a test method is skipped
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Called when a test method fails, but is within success percentage
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// Called when a test method fails due to timeout
	}

	public void onStart(ITestContext context) {
		// Called before any test methods in the suite/class are run
	}

	public void onFinish(ITestContext context) {
		// Called after all the test methods in the suite/class have run
	}
}
