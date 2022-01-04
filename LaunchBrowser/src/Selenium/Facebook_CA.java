package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook_CA {
	String path;
	public void Create() throws InterruptedException{
		path=System.getProperty("user.dir")+"//driver//msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		//to click by link
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("abc");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("lastname")).sendKeys("Kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("kumar.ronak.1997@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("qwerty123");
		
		
		







	}

	public static void main(String[] args) throws InterruptedException {
		Facebook_CA fb= new Facebook_CA();
		fb.Create();


	}

}
