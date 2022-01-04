package ActionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {
	public static WebDriver driver;

	public static void main(String[] args) {
		String Edge_path;

		Edge_path = System.getProperty("user.dir")+"//driver//msedgedriver.exe";

		System.setProperty("webdriver.edge.driver",Edge_path);
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://snippet.dhtmlx.com/5pfybpmz?mode=wide&text=tree");
		Actions Move= new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div[2]/div/div[1]/div[2]/div/div[2]/iframe")));
		Move.dragAndDropBy(driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[1]/div/div/div[3]")),-140,-45).perform();

	}

}
