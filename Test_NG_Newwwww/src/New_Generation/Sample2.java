package New_Generation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 
{
	@Test(groups = {"Functional"})
	
	public void data3()
	{
		System.out.println("Hello Sneha");
	}
	@Test(groups = {"Functional","Integral"})
	public void data4()
	{
		System.out.println("Hello Arjun");
		Reporter.log("1",true);
	}
}
