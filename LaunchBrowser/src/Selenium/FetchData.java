package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//DATA DRIVEN FRAMEWORK
public class FetchData {
	WebDriver driver;
	public static String path,path1,uname,pass;
	public void launch() throws IOException, InterruptedException {
		path=System.getProperty("user.dir")+"//driver//msedgedriver.exe";
		System.setProperty("webdriver.edge.driver",path);
		path1=System.getProperty("user.dir")+"//Testdata//TestInput.xlsx";
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//To Read file from that location 
		FileInputStream fi = new FileInputStream(path1);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		//16th and 17th is to print no. rows 
		int row = sheet.getLastRowNum();
		System.out.println(row);
		for(int i=1;i<=row;i++)
		{
			uname=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(uname);
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys(uname);



			pass=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pass);
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys(pass);

			driver.findElement(By.name("Submit")).submit();
			
			FileOutputStream fos = new FileOutputStream(path1);
			String message = "Finally Data Imported ";
			
			sheet.getRow(i).createCell(2).setCellValue(message);
			wb.write(fos);
			
			
			
			
		}

	}


	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FetchData oo=new FetchData();
		oo.launch();

	}

}
