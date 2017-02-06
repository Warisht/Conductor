package automationFramework;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.Loginpage;
import pageObjects.SymphonyListing;
import utility.ExcelRead;
import utility.Constant;

import utility.Constant;
import utility.ExcelRead;

public class Tc5 {
	public WebDriver driver;
	//Test-5
	  
	  
	  @Test
	  public void f5() throws Exception {
		  
		  
		  Assert.assertTrue(Loginpage.SignUP(driver).isDisplayed());
		  Assert.assertTrue(Loginpage.SignUP(driver).isEnabled());
		  ExcelRead.setCellData("Pass",6 , 6);
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
	  ExcelRead.setCellData("Pass",6 , 6);
	  driver.quit();
  }

}
