package pages_sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/path/to/chromedriver");
		WebDriver driver=new ChromeDriver();
		WebElement usernameField=driver.findElement(By.name("//example.com/login"));
		WebElement usernameField1=driver.findElement(By.name("username"));
		WebElement passwordField=driver.findElement(By.name("password"));
		WebElement loginButton=driver.findElement(By.name("login"));
		usernameField1.sendKeys("your_username");
		passwordField.sendKeys("your_password");
		loginButton.click();
		String dashboardTitle=driver.getTitle();
		if (dashboardTitle.contains("//Validate login success (example: check for dashboard title"));
			String dashboardTitle1=driver.getTitle();
		if(dashboardTitle1.contains("Dashboard")) {
			System.out.println("Login successful!");
		}
		else {
			System.out.println("Login failed!");
		}
		driver.quit();
		
			
		
				
		
	
	}
	
}
	