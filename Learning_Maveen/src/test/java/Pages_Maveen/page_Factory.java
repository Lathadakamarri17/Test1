package Pages_Maveen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page_Factory {
	private WebDriver driver;
	private final String url= "http://www.saucedemo.com/";
	@FindBy(id= "user-name")
	private WebElement usernameField;
	@FindBy(id= "password")
	private WebElement passwordField;
	@FindBy(id= "login-button")
	private WebElement loginButton;
	@FindBy(css= "h3[data-test= 'error']")
    private WebElement ErrorMessage;
	// constructor
	public page_Factory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	public void navigateTo() {
		if(!driver.getCurrentUrl().equals(url)) {
			driver.get(url);
		}
	
	
	}
	}
	
