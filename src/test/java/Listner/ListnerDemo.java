package Listner;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class ListnerDemo {
	
	@Test(groups="sanity")
	public void test1()
	{
		System.out.println("test1");
		Assert.assertTrue(false);
	}
	
	@Test(groups="sanity")
	public void test2()
	{
		System.out.println("test2");
		Assert.assertTrue(true);
	}

}
