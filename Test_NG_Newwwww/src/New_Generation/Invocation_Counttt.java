package New_Generation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_Counttt 
{
	@Test(invocationCount = 3,priority = 1)
	public void data1()
	{
		Reporter.log("1",true);
	}
	@Test
	public void data2()
	{
		Reporter.log("2",true);
	}
}
