package New_Generation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class POM_TestScript 
{
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver12.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		POM_Script p = new POM_Script(driver);
		p.unData("Hemanth Hemu");
		Thread.sleep(2000);
		
		p.pwdData("Arjun Hemu");
		Thread.sleep(2000);
		p.clickLogin();
		Thread.sleep(2000);
	}
	
}
