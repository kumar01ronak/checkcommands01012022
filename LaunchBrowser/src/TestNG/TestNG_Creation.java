package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Creation {
@BeforeSuite 
public void Driver()
{
	System.out.println("Before Suite");
}
@Test(priority=0)
public void Login()
{
	System.out.println("Test Case 1");
}
@Test(priority=1)
public void Logout()
{
	System.out.println("Test case 2");
}
@Test(priority=2)
public void Forgot_Password()
{
	System.out.println("Test case 3");
}

@AfterSuite
public void Close_Browser()
{
	System.out.println("After Suite");
}


}
