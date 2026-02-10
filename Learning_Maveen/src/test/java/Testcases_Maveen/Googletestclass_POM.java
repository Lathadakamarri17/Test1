package Testcases_Maveen;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages_Maveen.googlesearchpage;

public class Googletestclass_POM {
	static WebDriver driver;
	public static void main(String[] args) {
		googlesearch();
		driver.quit();
	}
public static void googlesearch()
{
	driver =  new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	//Object googlesaerchpage;
	googlesearchpage.textbox_search(driver).sendKeys("India");
	googlesearchpage.textbox_search(driver).sendKeys(Keys.ENTER);
	}
}
