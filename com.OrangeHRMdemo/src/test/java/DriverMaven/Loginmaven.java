package DriverMaven;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Loginmaven extends Launch_Browser {
	@Test
	public void Login() {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}
	@Test
	public void Forget_Password(){
		driver.findElement(By.linkText("Forgot your password?")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.navigate().back();
		
		
	}

}
