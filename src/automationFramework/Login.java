package automationFramework;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.Loginpage;
import pageObjects.SymphonyListing;
import utility.ExcelRead;
import utility.Constant;

public class Login {
	

public WebDriver driver;
public String uname;
public String pass;


@Test
  public void main() throws Exception {
	     uname=ExcelRead.getCellData(1,0);
	     pass=ExcelRead.getCellData(1,1);
	    Loginpage.Email(driver).click();
		Loginpage.Email(driver).sendKeys(uname);
		Loginpage.Password(driver).sendKeys(pass);
		Loginpage.Submit(driver).click();
		String A= driver.getCurrentUrl();
		String B ="http://54.237.188.186/dashboard";
		if(A.equals(B))
		{
			ExcelRead.setCellData("Pass", 1, 2);
		}
		
		
		System.out.println("Login Successfull");
  }
  @BeforeMethod
  public void beforeMethod() throws Exception {
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		driver.get("http://54.237.188.186/");
		ExcelRead.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	    driver.quit();
	    
  }

}
