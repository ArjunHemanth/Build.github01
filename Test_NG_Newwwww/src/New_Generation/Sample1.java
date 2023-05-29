package New_Generation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1
{
	
	@Test(groups = {"sanity"})
	public void data1()
	{
		System.out.println("Hello World");
	}
	@Test(groups = {"sanity","Smoke"})
	public void data2()
	{
		System.out.println("Hello Asia");
	}
	
}
