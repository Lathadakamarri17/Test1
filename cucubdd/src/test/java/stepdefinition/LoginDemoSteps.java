package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemoSteps { 
	WebDriver driver;
	private CharSequence password;
	@Given("browser is open on google")
	public void browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Given("user is on  google search page with user")
	public void user_is_on_google_search_page_with_user() {
		driver.get("https://www.saucedemo.com/");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters standard_user and secret_sauce")
	public void user_enters_standard_user_and_secret_sauce(CharSequence username) throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login-button")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigate to home page")
	public void user_is_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enters locked_out_user and secret_sauce")
	public void user_enters_locked_out_user_and_secret_sauce() {
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	


	
	
	
}


