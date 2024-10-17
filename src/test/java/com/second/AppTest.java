package com.second;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.first.App;

public class AppTest {
	
	@Test
	public void testlogin1()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("usha","usha2024"));
	}
	
	@Test
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("usha","usha@2024"));
	}

}



 