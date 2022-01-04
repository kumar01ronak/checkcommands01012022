package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AdvanceXpath{
	String path;
	public void Implement() throws InterruptedException {
		path=System.getProperty("user.dir")+"//driver//msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", path);
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://money.rediff.com/gainers");
		
		String self=driver.findElement(By.xpath("//a[contains(text(),'Sarthak Metals')]/self::a")).getText();
		System.out.println("Self node is "+self);
		driver.close();
		
		
	}

	public static void main(String[] args) throws InterruptedException{

		AdvanceXpath xp= new AdvanceXpath();
		xp.Implement();

	}

}
