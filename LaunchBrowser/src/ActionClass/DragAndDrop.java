package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String Edge_path;
		
		//Dynamic path of driver
		Edge_path = System.getProperty("user.dir")+"//driver//msedgedriver.exe";
		System.setProperty("webdriver.edge.driver",Edge_path);
		driver = new EdgeDriver();
		//maximizing screen
		driver.manage().window().maximize();
		//Open URL
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		//Creating Action Class
		Actions act= new Actions(driver);
		//
		WebElement src=driver.findElement(By.xpath("//div[@id='div1']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='div2']"));
		
		
		//WebElement
		act.doubleClick( ).clickAndHold(src).moveToElement(target).release().build().perform();
		
		
		
		
		
		
		
		
		
		
		

	}

}
