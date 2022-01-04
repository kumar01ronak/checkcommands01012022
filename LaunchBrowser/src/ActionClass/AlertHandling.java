package ActionClass;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AlertHandling {
	String path;
	WebDriver driver;
	@Test
	public void Launch() throws InterruptedException
	{
		path=System.getProperty("user.dir")+"//driver//msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		//WebDriverWait wait=new WebDriverWait(driver, 5);
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");

		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("proceed")).click();

		//Alert Handling
		Alert alt=driver.switchTo().alert();
		//wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(5000);
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();



	}

}

