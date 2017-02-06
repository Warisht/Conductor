package automationFramework;

import java.util.concurrent.TimeUnit;

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
import org.testng.Assert;



public class Tc2 {
	public WebDriver driver;
	public Boolean status;
	public Boolean status1;
	
	 @Test
	  public void f() throws Exception {
		  
		   Assert.assertTrue(Loginpage.Email(driver).isDisplayed());
		   Assert.assertTrue(Loginpage.Email(driver).isEnabled());
	       Assert.assertTrue(Loginpage.Password(driver).isDisplayed());
		   Assert.assertTrue(Loginpage.Password(driver).isEnabled());
		   ExcelRead.setCellData("Pass",3 , 6);
    
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
