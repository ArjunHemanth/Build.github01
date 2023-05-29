package Basic_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_POM 
{
	@FindBy(xpath = "//h4[.='KFC']")
	private WebElement kfc;
	
//	@FindBy(xpath = "//img[@src='https://b.zmtcdn.com/data/pictures/2/50672/ca8c5ab2353898503f5a528ab4ede275_o2_featured_v2.jpg']")
//	private WebElement mac;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement cheepora;
	
	@FindBy(xpath="//input[@class='sc-1o2pknd-1 bMqzoN']")
	private WebElement egg;
	
	public POM_POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void okka()
	{
		kfc.click();
	}
//	public void inkokka()
//	{
//		mac.click();
//	}
	
	public void neekenduku()
	{
		cheepora.click();
	}
	
	public void egg()
	{
		egg.click();
	}
	public void roti()
	{
		
	}
	
}
