package ui;

import org.testng.annotations.DataProvider;
import java.lang.reflect.Method;

public class DataProviderDemo {
	// Another Way of using DataProvider
	@DataProvider(name = "create")
	public Object[][] dataset1(Method m) {

		Object[][] testData = null;

		if (m.getName().equals("test")) {
			testData = new Object[][] { { "username", "password" }, { "username1", "password1" },
					{ "username2", "password2" } };
		} else if (m.getName().equals("test1")) {
			testData = new Object[][] { { "username", "password", "test" }, { "username1", "password1", "test1" },
					{ "username2", "password2", "test2" } };
		} else if (m.getName().equals("test2")) {
			testData = new Object[][] { { "username", "password", "test", "kola" },
					{ "username1", "password1", "test1", "kola1" }, { "username2", "password2", "test2", "kola2" } };
		}

		return testData;
	}
}