package automationFlow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserSelect {
	public static WebDriver driver;
	
	@Parameters({"browser","driverPath"})
	@Test
	public void browserSelect(String browser,String driverPath) {
		if(browser.equals("ie")) {
			
			System.setProperty("webdriver.ie.driver", driverPath);
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	
}
