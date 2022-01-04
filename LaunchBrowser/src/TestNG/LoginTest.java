package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends Execute_Ng{
	@Test(priority=1)
	public void Login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).submit();

	}
	@Test(priority=0)
	public void Forget_Password() throws InterruptedException {
		driver.findElement(By.partialLinkText("Forgot")).click();
		Thread.sleep(3000);
		driver.navigate().back();


	}

}
