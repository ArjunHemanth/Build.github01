package New_Generation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript1 extends GenericScript
{
	@Test
	public void validLogin() throws InterruptedException 
	{
		driver.findElement(By.id("email")).sendKeys("Hemanth Hemu");
		driver.findElement(By.id("pass")).sendKeys("ArjunHemanth");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
	}
}
