package BaseLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary {
	
		public void launchBrowser() {
			 WebDriverManager.chromedriver().setup();	
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.testingbaba.com/old/");
				
			}
	}
	
	
	

