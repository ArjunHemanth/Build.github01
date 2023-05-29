package Basic_Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class POM_Script extends Generic_Script
{
	@Test
	public void open() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (int i = 0; i <=5; i++) 
		{
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h4[.='KFC']")).click();
		Thread.sleep(5000);
		
		for (int i = 0; i <=5; i++) 
		{
			js.executeScript("window.scrollBy(0,100)");
			Thread.sleep(1000);
		}
		POM_POM  p = new POM_POM(driver);
		//p.okka();
//		driver.navigate().back();
//		Thread.sleep(2000);
		//p.inkokka();
		Thread.sleep(2000);
		p.neekenduku();
		Thread.sleep(2000);
		p.egg();
		
		
			
	}
}
