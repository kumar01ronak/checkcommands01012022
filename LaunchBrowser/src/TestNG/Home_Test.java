package TestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Home_Test extends Execute_Ng {
@Test
	public void Logout() throws InterruptedException {
		driver.findElement(By.partialLinkText("Welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);

	}

}
