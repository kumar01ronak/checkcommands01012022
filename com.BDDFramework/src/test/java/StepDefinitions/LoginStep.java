package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;

@Given("User is on the Login page")
public void user_is_on_the_Login_page()
{
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
}

@Then("User enters the {string} in username textfield")
public void user_enters_the_in_username_textfield(String uname)
{
	driver.findElement(By.id("txtUsername")).sendKeys(uname);
}
@Then("User enters the {string} in password textfield")
public void user_enters_the_in_password_textfield(String pass)
{
	driver.findElement(By.id("txtPassword")).sendKeys(pass);
}
@Then("User clicks in the Login button")
public void user_clicks_in_the_Login_button() throws InterruptedException
{
	driver.findElement(By.id("btnLogin")).click();
	Thread.sleep(5000);
}
@And("User is on the Home page")
public void user_is_on_the_Home_page()
{
	Assert.assertEquals("OrangeHRM", driver.getTitle());
	driver.close();
}
}
