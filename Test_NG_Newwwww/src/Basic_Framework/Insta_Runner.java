package Basic_Framework;

import org.testng.annotations.Test;

public class Insta_Runner extends General_Generic
{
	@Test
	public void validLogin() throws InterruptedException
	{
		Insta_POM_Script p = new Insta_POM_Script(driver);
		p.uname();
		Thread.sleep(2000);
		
		p.pass();
		Thread.sleep(2000);
		
		p.log();
		Thread.sleep(5000);
		
		p.notNow();
		Thread.sleep(3000);
		
		p.nowu();
		Thread.sleep(3000);
		
		p.searching();
		Thread.sleep(3000);
		
		
		
		
		
	}
	
}
