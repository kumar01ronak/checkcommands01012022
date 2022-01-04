package com.BaseDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
public TestBase()
{
	try {
		//1.Initialize the path of the data from config.properties
		FileInputStream fip=new FileInputStream("C:\\Users\\Ronak Kumar Singh\\eclipse-workspace\\com.OrangeHRM.POM.HR\\src\\test\\java\\com\\OrangeHRM\\POM\\configuration\\config.properties");
		
		//2.Initialize the properties class
		prop = new Properties();
		
		//3.Load properties class
		prop.load(fip);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void Launch_Driver() {
		WebDriverManager.edgedriver().setup();
		
		driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.get(prop.getProperty("url"));//new approach to get url in POM
	}

}
