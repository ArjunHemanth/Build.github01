package New_Generation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Script 
{
	
	@FindBy(name="email")
	private WebElement unTbox;
	
	@FindBy(name="pass")
	private WebElement pwdTbox;
	
	@FindBy(name="login")
	private WebElement loginBtn;
	
	//Initialization
	
	public POM_Script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void unData(String un)
	{
		unTbox.sendKeys(un);
	}
	public void pwdData(String pwd)
	{
		pwdTbox.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	
}
