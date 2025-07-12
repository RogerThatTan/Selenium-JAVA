package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login to Application");

	}

	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout From Application");

	}

	@BeforeMethod
	public void connectToDB() {
		System.out.println("BM DB Connected");

	}

	@AfterMethod
	public void disconnectFromDB() {
		System.out.println("AM Disconnect DB cONNECTION");

	}

	@Test(priority = 1, description = "This is a login test!", groups = "regression")
	public void loginTest() {
		System.out.println("Login is sucessful");
	}

	@Test(priority = 2, description = "This is a logout test!")
	public void logoutTest() {
		System.out.println("Log Out is sucessful");
	}

}
