package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
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
		driver.get("https://jqueryui.com/draggable/");
		Actions act= new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")),200,250).perform();
		act.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']"))).moveByOffset(197, 114).perform();
		Thread.sleep(5000);
		driver.close();


	}

}
