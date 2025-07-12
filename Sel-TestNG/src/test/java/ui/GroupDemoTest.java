package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import common.CommonDataSetup;

@Test(groups = "user-registration")
public class GroupDemoTest extends CommonDataSetup {

	@BeforeClass
	public void beforeClass() {
		System.out.println("Run this before class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Run this After class");
	}

	@BeforeGroups(value = "regression")
	public void beforeGroup() {
		System.out.println("Run this method before Regression");
	}

	@AfterGroups(value = "regression")
	public void afterGroup() {
		System.out.println("Run this method after Regression");
	}

	@Test(priority = 1, groups = "regression")
	public void aTest1() {
		System.out.println("test1");
	}

	@Test(priority = 2, groups = "regression")
	public void bTest2() {
		System.out.println("test2");
	}

	@Test(groups = { "regression", "bvt" })
	public void bTest3() {
		System.out.println("test3");
	}

	@Test(groups = "bvt")
	public void bTest4() {
		System.out.println("test4");
	}

}
