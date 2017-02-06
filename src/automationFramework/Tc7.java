package automationFramework;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.Loginpage;
import pageObjects.SymphonyListing;
import utility.ExcelRead;
import utility.Constant;


public class Tc7 {
	
	public WebDriver driver;
	 //Test-7
	  
	  @Test
	  public void f7() throws Exception {
		  Assert.assertTrue(Loginpage.ForgotPassword(driver).isDisplayed());
		  Assert.assertTrue(Loginpage.ForgotPassword(driver).isEnabled());
		  ExcelRead.setCellData("Pass",8 , 6);
	  }
  
  @BeforeTest
  public void beforeMethod() throws Exception {
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize(); 
	  driver.get("http://54.237.188.186/");
	  ExcelRead.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
  }

  @AfterTest
  public void afterMethod() throws Exception {
	  
	  
	  driver.quit();
  }

}
