package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseDemo.TestBase;

public class LoginPage extends TestBase  {
	//Factory Class or Object of current class
	@FindBy(xpath="//input[@id='txtUsername']")
	WebElement uname;

	@FindBy(id="txtPassword")
	WebElement pass;

	@FindBy(xpath="//input[@name='Submit']")
	WebElement btn;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgotpass;

	public LoginPage() {
		// Initializing Webelement with driver & this refers to above (unam,pass etc)objects
		PageFactory.initElements(driver, this);

	}
	
	public String VerifyTitle() {
		return driver.getTitle();	
	}
	
	public void Login() {
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		btn.click();
	}
	
	public void ClickForgotPage() {
		forgotpass.click();
		driver.navigate().back();
		
	}

}
