package New_Generation;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test_Script extends GenericScript 
{
	@Test
	public void Wrogn() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("wrogn watch");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Analog Watch  - For Men O-67365LMGB']")).click();
		Set<String> allwh = driver.getWindowHandles();
		
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
		}
		driver.findElement(By.xpath("//img[@class='_2r_T1I']")).click();
		
		
		
		
		
//		WebElement ele = driver.findElement(By.xpath("//span[.='Analog Watch  - For Men O-67365LMGB']/../../../div[2]/div[1]/div[1]/div[1]"));
//		Thread.sleep(2000);
//		String text = ele.getText();
//		System.out.println(text);
//		//Assert.fail();
	}
		@Test(dependsOnMethods = "Wrogn")
		public void cart() throws InterruptedException
		{
			driver.findElement(By.xpath("//button[.='✕']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("wrogn watch");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@class='_2r_T1I']")).click();
			Set<String> allwh = driver.getWindowHandles();
			
			for(String wh:allwh)
			{
				driver.switchTo().window(wh);
			}
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			
			}
		
		
}
