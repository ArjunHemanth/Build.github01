package Basic_Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class General_Generic
{
	public WebDriver driver;
	@BeforeMethod
	public void OpenApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver12.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.titleContains("puma"));
		
		driver.get("https://www.instagram.com/");
		
		
	}
	@AfterMethod
	public void CloseApp()
	{
		driver.close();
	}
	
}