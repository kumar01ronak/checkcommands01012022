package DriverMaven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch_Browser {
	WebDriver driver; 
	@BeforeSuite
	public void Launch() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		                                                          
	}
	@AfterSuite
	public void Close_Browser() {
		driver.close();
	}

}
