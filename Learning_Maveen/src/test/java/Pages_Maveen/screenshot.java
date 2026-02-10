package Pages_Maveen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

		public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		File src= ((screenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\screenshot\\Appsscreenshot.png"));
		driver.quit();

	}

		private File getScreenshotAs(OutputType<File> file) {
			// TODO Auto-generated method stub
			return null;
		}

}
