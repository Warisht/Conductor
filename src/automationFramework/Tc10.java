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

public class Tc10 {
	public WebDriver driver;
	//Test-10
	  
	  @Test
	  public void f10() throws Exception {
		  Loginpage.Email(driver).click();
		  Loginpage.Email(driver).sendKeys("jj@j.com");
		  Loginpage.Password(driver).click();
		  Loginpage.Password(driver).sendKeys("123456789");
		  Loginpage.Submit(driver).click();
		  Assert.assertNotEquals((driver.getCurrentUrl()),"54.237.188.186");
		  ExcelRead.setCellData("Pass",14 , 6);
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
