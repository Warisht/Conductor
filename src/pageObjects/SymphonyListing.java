package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SymphonyListing {
	
	
	private static WebElement element = null;
	
	public static WebElement Heading(WebDriver driver)
	{
		element = driver.findElement(By.xpath(".//*[@id='right-content']/header/div/div/div/div[1]/div/h4"));
		
		return element;
	}

}
