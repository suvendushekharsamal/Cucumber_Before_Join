package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	private WebDriver driver;
	public LoginPage( WebDriver driver) {
		this.driver=driver;
	}
	
	public void lunchURL(String url)
	{
		driver.get(url);
	}
	
	public void titleValidation(String title) {
		
		System.out.println("assert the title!");
		Assert.assertEquals(driver.getTitle(), title);
	}
	 

}
