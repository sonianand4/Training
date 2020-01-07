package Selenium;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestng {
@Test
public void testCase1()
{
	System.out.println("This is first testcase");
}

@BeforeSuite
public void beforeSuite()
{
	System.out.println("before suite");
}

@Test
public void testcase2()
{
	System.out.println("this is second testcase");
}
@BeforeClass
public void beforeClass()
{
	System.out.println("before class");
}

@BeforeTest
public void beforeTest()
{
	System.out.println("before test");
}
@BeforeMethod
public void beforeMethod()
{
	System.out.println("before method");
}

@AfterMethod
public void afterMethod()
{
	System.out.println("after method");
}
@AfterTest
public void afterTest()
{
	System.out.println("after test");
}
@AfterClass
public void afterClass()
{
	System.out.println("after class");
}
@AfterSuite
public void afterSuite()
{
	System.out.println("after Suite");
}
}
