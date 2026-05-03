package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import utilities.WaitForElement;

public class LoginPage {
	
	private WebDriver driver;
	WaitForElement WFE;
	public LoginPage( WebDriver driver) {
		this.driver=driver;
	    WFE=new WaitForElement(driver);
	}
	
	public void lunchURL(String url)
	{
		driver.get(url);
	}
	
	public void titleValidation(String title) {
		
		System.out.println("assert the title!");
		Assert.assertEquals(driver.getTitle(), title);
	}
	
	public void homePageNavigation(By locator) {
		WebElement homeText= WFE.waitForVisible(locator);
		System.out.println(homeText.getText());
	}
	 

}
