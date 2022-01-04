package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class classs {

	public static void main(String[] args) {
		String Edge_path;
		WebDriver driver;

		//Dynamic path of driver
		Edge_path = System.getProperty("user.dir")+"//driver//msedgedriver.exe";
		System.setProperty("webdriver.edge.driver",Edge_path);
		driver = new EdgeDriver();
		//maximizing screen
		driver.manage().window().maximize();
		//Open URL
		driver.get("https://jqueryui.com/droppable/");
		Actions act= new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		
		WebElement ele=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Point point=ele.getLocation();
		int x=point.getX();
		System.out.println(x);
		

		
	}

}
