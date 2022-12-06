package TestNGDemo;

import org.testng.annotations.Test;

public class groups {

	
	
	@Test(priority = 1,groups = {"smoke"})
	public void tc1()
	{
		System.out.println("this is my first smoke testing");
	}
	@Test(priority = 1,groups = {"regression"})
	public void tc2()
	{
		System.out.println("this is my first regression testing");
	}
	@Test(priority = 2,groups = {"smoke"})
	public void tc3()
	{
		System.out.println("this is my second smoke testing");
	}
	@Test(priority = 2,groups = {"regression"})
	public void tc4()
	{
		System.out.println("this is my second regression testing");
	}
	}

