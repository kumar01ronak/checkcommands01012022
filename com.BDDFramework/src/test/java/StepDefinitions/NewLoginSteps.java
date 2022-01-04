package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;




public class NewLoginSteps {
	WebDriver driver;
	@Given("launch login page")
	public void launch_login_page() 
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Then("enters the {string} and enters {string}")
	public void enters_the_username_and_enters_password (String uname, String pass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	}
	@Then("click on the login button")
	public void click_on_the_login_button()
	{
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
	}
}
