package New_Generation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Facebook_Runnerclass extends GenericScript
{
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("9591605637");
		driver.findElement(By.id("pass")).sendKeys("@MyMemory97");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	
}
