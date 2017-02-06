
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


public class Tc9 {
	public WebDriver driver;
	//Test-9
	  @Test
	  public void f9() throws Exception {
		  Assert.assertFalse(Loginpage.Submit(driver).isEnabled());
		  
		  Loginpage.Email(driver).click();
		  Loginpage.Email(driver).sendKeys("jkrfrfrff");
		  Loginpage.Password(driver).click();
		  Loginpage.Password(driver).sendKeys("123456789");
		  Assert.assertFalse(Loginpage.Submit(driver).isEnabled());
		  Loginpage.Email(driver).clear();
		  Loginpage.Password(driver).clear();
		  
		  Loginpage.Email(driver).click();
		  Loginpage.Email(driver).sendKeys("jj@j.com");
		  Loginpage.Password(driver).click();
		  Loginpage.Password(driver).sendKeys("12789");
		  Assert.assertFalse(Loginpage.Submit(driver).isEnabled());
		  Loginpage.Email(driver).clear();
		  Loginpage.Password(driver).clear();
		  
		  Loginpage.Email(driver).click();
		  Loginpage.Email(driver).sendKeys("jj@j.com");
		  Loginpage.Password(driver).click();
		  Loginpage.Password(driver).sendKeys("123456789");
		  Assert.assertTrue(Loginpage.Submit(driver).isEnabled());
		  ExcelRead.setCellData("Pass",10 , 6);
		  ExcelRead.setCellData("Pass",11 , 6);
		  ExcelRead.setCellData("Pass",12 , 6);
		  
		  
		  
		  
		  
		  
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
