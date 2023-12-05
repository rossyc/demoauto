package testcases;

import org.testng.annotations.Test;

public class EnabledAnnotation {

	@Test (enabled = true)
	public void a()
	{
		System.out.println("This is method a");
	}
	
	@Test
	public void b()
	{
		System.out.println("This is method b");
	}
	
}
