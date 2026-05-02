package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverFactory;

public class Login {

	WebDriver driver;
	LoginPage page;
	
@Before
public void setDriver() {
	 driver = DriverFactory.getDriver();
}

@Given("user should lunch the login url")
public void user_should_lunch_the_login_url() {

	
	 page= new LoginPage(driver);
     page.lunchURL("https://rahulshettyacademy.com/client/#/auth/login");

}

@Given("validate the title of login page")
public void validate_the_title_of_login_page() {

	page.titleValidation("Let's Shop");
}

@When("User enter the username and password")
public void user_enter_the_username_and_password() {

driver.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("suvendusamal338@gmail.com");
driver.findElement(By.xpath("//*[@id=\"userPassword\"]")).sendKeys("Rahul@123");

	
}

@When("click on login button")
public void click_on_login_button() {

driver.findElement(By.id("login")).click();
	
}

@Then("page will navigate to home page")
public void page_will_navigate_to_home_page() throws InterruptedException {
	Thread.sleep(5000);
   WebElement text = driver.findElement(By.xpath("/html/body/app-root/app-dashboard/app-sidebar/nav/label[1]/div/a/div/h3"));
   System.out.println(text.getText());
}

@Then("validate you are in home page")
public void validate_you_are_in_home_page() {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
	System.out.println("All steps are completed");
}



	
}
