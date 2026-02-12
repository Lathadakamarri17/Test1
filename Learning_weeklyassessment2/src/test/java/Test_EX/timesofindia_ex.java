package Test_EX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class timesofindia_ex {
	WebDriver driver;
	@Given("I Navigate to https:\\/\\/timesofindia.indiatimes.com\\/")
	public void i_navigate_to_https_timesofindia_indiatimes_com() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://timesofindia.indiatimes.com/");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I Select Hindi  from Language dropdown")
	public void i_select_hindi_from_language_dropdown() {
		driver.findElement(
				By.xpath("//a[contains(@href,'navbharat')]")
				).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the page should be loaded Successfully")
	public void the_page_should_be_loaded_successfully() {
		String url=driver.getCurrentUrl();
		System.out.println("Current URL: "+url);
		
		
		if(url.contains("navbharat")) {
			System.out.println("Hindi page displayed successfully");
		}
		else {
			System.out.println("Hindi page not displayed");
		}
	   	}
	}
