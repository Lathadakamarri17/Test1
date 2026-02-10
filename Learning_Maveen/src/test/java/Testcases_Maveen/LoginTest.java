package Testcases_Maveen;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages_Maveen.Loginpage;

public class LoginTest {
	public static void main(String args[]) {
		WebDriver driver;
		Loginpage  loginpage;
		driver= new ChromeDriver();
		loginpage = new Loginpage (driver);
		loginpage.navigateTo();
		loginpage.login("standard_user", "secret_sauce");
		loginpage.navigateTo();
		loginpage.login("Invalid_user", "Wrong_password");
		driver.quit();
		
		
	}
	

}
