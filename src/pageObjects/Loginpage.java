package pageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class Loginpage {
	 
	private static WebElement element = null;

	public static WebElement Email(WebDriver driver)
	{
		element = driver.findElement(By.id("loginEmail"));
		
		return element;
	}
	
	public static WebElement Password(WebDriver driver)
	{
		element = driver.findElement(By.id("loginPassword"));
		
		return element;
    
	}
	
	public static WebElement Submit(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@class='container']/div/div[2]/form/div[5]/div/button"));
		
		return element;
	}
	
	public static WebElement ForgotPassword(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@class='container']/div/div[2]/form/div[3]/a"));
		
		return element;
		
		
	}	
		public static WebElement SignUP(WebDriver driver)
		{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[2]/div[2]/div/div/span/a"));
			
			return element;
			
		}
		
		public static WebElement Text(WebDriver driver)
		{
			element = driver.findElement(By.xpath(".//*[@id='app']/div/div/div/div[2]/div[2]/div/div/span"));
			
			return element;
		}

}
