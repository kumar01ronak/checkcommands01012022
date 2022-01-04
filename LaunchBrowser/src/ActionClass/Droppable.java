package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
String Edge_path;
		
		Edge_path = System.getProperty("user.dir")+"//driver//msedgedriver.exe";
		
		System.setProperty("webdriver.edge.driver",Edge_path);
		driver = new EdgeDriver();
		
		//maximizing screen
		driver.manage().window().maximize();
		
		//Open URL
		driver.get("https://jqueryui.com/droppable/");
		
		//providing frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//Location of Draggable element by Xpath
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//Location of Droppable element by Xpath
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act= new Actions(driver);
		
		Thread.sleep(5000);
		
		act.dragAndDrop(src,target).build().perform();
		
		
		

	}

}
