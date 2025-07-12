package ui;

import org.testng.annotations.Test;

public class DataProviderDemoTest {

	@Test(dataProvider = "create", dataProviderClass = DataProviderDemo.class)
	public void test(String username, String password) {

		System.out.println(username + "=====" + password);

	}

	@Test(dataProvider = "create", dataProviderClass = DataProviderDemo.class)
	public void test1(String username, String password, String Test) {

		System.out.println(username + "=====" + password + "====" + Test);

	}

	@Test(dataProvider = "create", dataProviderClass = DataProviderDemo.class)
	public void test2(String username, String password, String Test, String test1) {

		System.out.println(username + "=====" + password + "====" + Test + "====" + test1);

	}

}
