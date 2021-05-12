package stepDefinations;

import Cucumber.Automation.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@Before("@MobileTest")
	public void beforevalidation()
	{
		System.out.println("Before Mobile before Hook");
	}
	
	@After("@RegressionTest")
	public void Aftervalidation()
	{
		driver.close();
	}
	
	@After("@Test")
	public void Aftervalidations()
	{
		driver.close();
	}

}
