package SeleniumAssigments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class drivers {
	static WebDriver driver ;
	public static WebDriver browserSelection(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
				
			System.setProperty("webdriver.chrome.driver", "D://TestLeaf//Software//drivers//chromedriver.exe");
			driver = new ChromeDriver();

		
		}
		else if(browser.equalsIgnoreCase("FireFox"))  {
			System.setProperty("webdriver.gecko.driver", "D://TestLeaf//Software//drivers//geckodriver32.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
}
