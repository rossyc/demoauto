package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	
	@Test
	public void methodone()
	{
		System.out.println("this is method one inside the class");
	}

	@BeforeClass 
	public void methodclass()
	{
		System.out.println("this should run before the class");
	}
	
	@AfterClass
	public void methodb()
	{
		System.out.println("this should run after the class");
	}
	
}
