package testcases;

import org.testng.annotations.Test;

public class PriorityByAlphabet {

	@Test (priority = 'z')
	public void a()
	{
		System.out.println("this is method a");
	}
	
	@Test (priority = 'a')
	public void b()
	{
		System.out.println("this is method b");
		
	}
	@Test (priority = 'f')
	public void c()
	{
		System.out.println("this is method c");
	}
	
}
