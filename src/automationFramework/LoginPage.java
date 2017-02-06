package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Loginpage;
import utility.Constant;
import utility.ExcelRead;

public class LoginPage {

	public WebDriver driver;

	/*
	 * Test-1
	 * 
	 * @Test public void f() throws Exception {
	 * driver.get("http://54.237.188.186/"); ExcelRead.setCellData("Pass", 1,
	 * 6); }
	 */

	// Test-2
	@Test
	public void f2() throws Exception {

		Assert.assertTrue(Loginpage.Email(driver).isDisplayed());
		Assert.assertTrue(Loginpage.Email(driver).isEnabled());
		Assert.assertTrue(Loginpage.Password(driver).isDisplayed());
		Assert.assertTrue(Loginpage.Password(driver).isEnabled());
		ExcelRead.setCellData("Pass", 3, 6);
	}

	// Test-3

	@Test
	public void f3() throws Exception {
		Assert.assertEquals("Email",
				(Loginpage.Email(driver).getAttribute("placeholder")));
		Assert.assertEquals("Password",
				(Loginpage.Password(driver).getAttribute("placeholder")));
		ExcelRead.setCellData("Pass", 4, 6);
	}

	// Test-4
	@Test
	public void f4() throws Exception {

		Assert.assertTrue(Loginpage.Submit(driver).isDisplayed());
		// Assert.assertTrue(Loginpage.Submit(driver).isEnabled());
		ExcelRead.setCellData("Pass", 5, 6);
	}

	// Test-5

	@Test
	public void f5() throws Exception {

		Assert.assertTrue(Loginpage.SignUP(driver).isDisplayed());
		Assert.assertTrue(Loginpage.SignUP(driver).isEnabled());
		ExcelRead.setCellData("Pass", 6, 6);
	}

	// Test-6

	@Test
	public void f6() throws Exception {
		Assert.assertTrue(Loginpage.Text(driver).isDisplayed());
		ExcelRead.setCellData("Pass", 7, 6);
	}

	// Test-7

	@Test
	public void f7() throws Exception {
		Assert.assertTrue(Loginpage.ForgotPassword(driver).isDisplayed());
		Assert.assertTrue(Loginpage.ForgotPassword(driver).isEnabled());
		ExcelRead.setCellData("Pass", 8, 6);
	}

	// Test-8

	@Test
	public void f8() throws Exception {
		Assert.assertTrue(Loginpage.Submit(driver).isDisplayed());
		Assert.assertFalse(Loginpage.Submit(driver).isEnabled());
		ExcelRead.setCellData("Pass", 9, 6);
	}

	// Test-9
	@Test
	public void f9() throws Exception {
		Assert.assertFalse(Loginpage.Submit(driver).isEnabled());

		Loginpage.Email(driver).sendKeys("jkrfrfrff");
		Loginpage.Password(driver).sendKeys("123456789");
		Assert.assertFalse(Loginpage.Submit(driver).isEnabled());
		Loginpage.Email(driver).clear();
		Loginpage.Password(driver).clear();

		// WebDriverWait wait = new WebDriverWait(driver, 10);

		// WebElement element =
		// wait.until(ExpectedConditions.elementToBeClickable(Loginpage.Submit(driver)));

	}

	// Test-10
	@Test
	public void f91() throws Exception {

		Loginpage.Email(driver).sendKeys("jj@j.com");

		Loginpage.Password(driver).sendKeys("12789");
		Assert.assertFalse(Loginpage.Submit(driver).isEnabled());
		Loginpage.Email(driver).clear();
		Loginpage.Password(driver).clear();

	}

	// Test-11
	@Test
	public void f912() throws Exception {

		Loginpage.Email(driver).sendKeys("jj@j.com");

		Loginpage.Password(driver).sendKeys("123456789");
		Assert.assertTrue(Loginpage.Submit(driver).isEnabled());
		ExcelRead.setCellData("Pass", 10, 6);
		ExcelRead.setCellData("Pass", 11, 6);
		ExcelRead.setCellData("Pass", 12, 6);

	}

	// Test-12

	@Test
	public void f10() throws Exception {
		Loginpage.Email(driver).click();
		Loginpage.Email(driver).sendKeys("jj@j.com");
		Loginpage.Password(driver).click();
		Loginpage.Password(driver).sendKeys("123456789");
		Loginpage.Submit(driver).click();
		Assert.assertNotEquals((driver.getCurrentUrl()), "54.237.188.186");
		ExcelRead.setCellData("Pass", 14, 6);
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		ExcelRead.setExcelFile(Constant.Path_TestData + Constant.File_TestData,
				"Sheet1");
		driver.get("http://conductortest-ui.link-labs.com/");
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod() throws Exception {
		;

		driver.quit();
	}

}
