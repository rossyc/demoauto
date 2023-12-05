package testcases;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAfterMethodAnnotation {

     @org.testng.annotations.Test
	public void methodone() 
	{
	
		System.out.println("This is implementation of method one");
		System.out.println(" ");
	}
	
     @org.testng.annotations.Test
	public void methodtwo()
	{
		
		System.out.println("This is implementation of method two");
		System.out.println(" ");
	}
	
	@BeforeMethod	
	
	public void bmethod()
	{
		System.out.println("This should run before all the methods");
	}
	
	@AfterMethod
	
	public void amethod()
	{
	
		System.out.println("This should run after all the methods");
	}
	
		
	
	
}
