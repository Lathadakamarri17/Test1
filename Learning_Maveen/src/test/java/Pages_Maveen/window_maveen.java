package Pages_Maveen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class window_maveen {
	public static void main(String[] args, String initialHandle) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http//www.google.com");
	String initialHandle1=driver.getWindowHandle();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("http//www.google.com/imghp?h1=en&ogb1");
	System.out.println(driver.getWindowHandles().size());
	driver.switchTo().window(initialHandle1);
	Thread.sleep(300);
	driver.close();
	System.out.println(driver.getWindowHandles().size());
	driver.quit();
	
		
	}
	

}
