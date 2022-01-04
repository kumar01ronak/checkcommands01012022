package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Execute_Ng {
	public static WebDriver driver;
	public static String path;
@BeforeSuite
	public void Launch_Browser(){
		path=System.getProperty("user.dir")+"//driver//msedgedriver.exe";
		System.setProperty("webdriver.edge.driver",path);
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
@AfterSuite
	public void Close(){
		driver.close();

	}	

}

