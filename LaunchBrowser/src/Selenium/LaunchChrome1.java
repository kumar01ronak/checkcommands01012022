package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChrome1 {
	WebDriver driver;

	public void Launch1() throws InterruptedException {
		// TODO Auto-generated constructor stub
		//Step -1 Set Property of WebDriver
		System.setProperty("webdriver.edge.driver", "G:\\Selenium\\edge\\msedgedriver.exe");

		//Step -2 Initialize the WebDriver 
		driver=new EdgeDriver();

		//Step to maximize Browser Window
		driver.manage().window().maximize();

		//Step - 3 Launch an application in browser Window
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		//				driver.navigate().refresh();



	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated me
		LaunchChrome1 lc=new LaunchChrome1();
		lc.Launch1();	
	}


}

