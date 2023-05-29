package New_Generation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert extends Generic_Script
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
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title, "Welcome");
		System.out.println("1");
		sa.assertAll();
	}
	
}
