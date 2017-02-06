package automationFramework;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.Loginpage;
import utility.ExcelRead;
import utility.Constant;

public class Setup {
 public static String uname ,pass;
	
	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize(); 
		ExcelRead.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
		
		driver.get("http://54.237.188.186/");
		String s=Loginpage.Email(driver).getText();
		   System.out.printf("jhjhjh0",s);
	} 

}
