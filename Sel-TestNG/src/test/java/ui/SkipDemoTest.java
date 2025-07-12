package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

import common.CommonDataSetup;

public class SkipDemoTest extends CommonDataSetup {

	Boolean dataSetup = false;

	@Test(enabled = false)
	public void skipTest1() {
		System.out.println("Skipping this test as it is not complete.");
	}

	@Test
	public void skipTest2() {
		System.out.println("2 Skipping this test forcefully");
		throw new SkipException("Skipping this test");
	}

	@Test
	public void skipTest3() {

		System.out.println("3 Skipping this test based on condition.");
		if (dataSetup == true) {
			System.out.println("Execute the test.");

		} else {
			System.out.println("Skip the test.");
			throw new SkipException("Skipping this test on conditoon");

		}
	}

}
