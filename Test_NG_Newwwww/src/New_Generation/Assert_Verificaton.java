package New_Generation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Verificaton extends Generic_Script
{
	
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("Hemanth Hemu");
		driver.findElement(By.id("pass")).sendKeys("Arjun Hemu");
		driver.findElement(By.xpath("//button['@name=login']")).click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Log in to Facebook");
		System.out.println("1");
		
	}
	
}
