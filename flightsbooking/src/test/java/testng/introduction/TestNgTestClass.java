package testng.introduction;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNgTestClass {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("@BeforeSuite: Before test suite...before xml file");
	}
	/*@Test(dataProvider = "dp")
	public void f(Integer n, String s) {
		System.out.println("this from data provider");
	}*/
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("@BeforeMethod: Before each and every test method in the class test method");
	}
	@Test
    public void test(){
		System.out.println("form test");
    	
    }
	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod: After each and every test method in the class test method");
	}


	/*@DataProvider
	public Object[][] dp() {
		return new Object[][] {
			new Object[] { 1, "a" },
			new Object[] { 2, "b" },
		};
	}*/
	@BeforeClass
	public void beforeClass() {
		System.out.println("@BeforeClass: Before test method in the current class");
	}


	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass: After test method in the current class");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("@BeforeTest: Before each and every test method in the <test tag> xml");

	}

	@AfterTest
	public void afterTest() {
		System.out.println("@AfterTest: After each and every test method in the <test tag> xml");
	}



	@AfterSuite
	public void afterSuite() {
		System.out.println("@AfterSuite: After test suite...after xml file");
	}

}
