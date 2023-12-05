package testcases;

import org.testng.annotations.Test;

public class Priority {
	
	@Test (priority = 1)
	public void b() 
	{
		System.out.println("Method one");
		
	}
	
	@Test (priority = 2)
	public void a() 
	{
		
		System.out.println("Method two");
	}

}
