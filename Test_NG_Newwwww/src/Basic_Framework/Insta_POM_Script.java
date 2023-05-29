package Basic_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Insta_POM_Script extends General_Generic
{
	@FindBy(name="username")
	private WebElement usname;
	
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement logBtn;
	
	@FindBy(xpath = "(//div[.='Not Now'])[2]")
	private WebElement not;
	
	@FindBy(xpath = "//button[.='Not Now']")
	private WebElement now;
	
	@FindBy(xpath = "(//div[.='Search'])[1]")
	private WebElement search;
	
	
	public Insta_POM_Script(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
		
	public void uname()
	{
		usname.sendKeys("www.hemuarhas@gmail.com");
	}
	public void pass()
	{
		pwd.sendKeys("HemanthS26Bangaru");
	}
	public void log()
	{
		logBtn.click();
	}
	public void notNow()
	{
		not.click();
	}
	public void nowu()
	{
		now.click();
	}
	public void searching()
	{
		search.click();
	}
	
}
