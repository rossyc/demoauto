package testcases;

import org.testng.annotations.Test;

public class DependsOnMethod {

	
	
	@Test (dependsOnMethods = {"Zlaunch"})
	public void product() 
	{
	System.out.println("Launch method is executed.");	
	}
	
	@Test
	public void Zlaunch() 
	{
		System.out.println("This is launch method implentation");
	}
	
	
	
	
	
}
