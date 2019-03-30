package automationUtilities;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import automationFlow.BrowserSelect;

public class AutomationFunctions {
	
	
	//This method is used to perform click operation
	public static void clickOperation(WebElement element) {
		try {
			
			element.click();
			Logging.infoMessage("Element " + element.getText() + " is Clicked");
		}
		catch(Exception e){
			Logging.errorMessage("Class-AutomationFunctions|Method-clickOperation|Error message: "+e.getMessage()+" Element not found "+element.getText());
		}
	}
	
	public static void sendData(WebElement element,String data) {
		
		try {
			element.sendKeys(data);
			Logging.infoMessage( data + " is entered");
		}
		catch(Exception e) {
			Logging.errorMessage("Class-AutomationFunctions|Method-sendData|Error message: "+e.getMessage()+" Element not found "+element.getText());
		}
	}
	
	public static void SelectFromDropdown(WebElement element,String data) {
		try {
			Select dropdown=new Select(element);
			dropdown.deselectByVisibleText(data);
			
		}
		catch(Exception e) {
			
		}
		
	}
	
	public static void windowHandles() {
		try {
			Set<String> windows=BrowserSelect.getDriver().getWindowHandles();
			String parent=BrowserSelect.getDriver().getWindowHandle();
			for(String window:windows) {
				if(!parent.equals(window)) {
					BrowserSelect.getDriver().switchTo().window(window);
				
				}
			}
		}
		catch(Exception e) {
			
		}
		
	}
	
	public static void explicitWait(WebElement element) {
		WebDriverWait wait=new WebDriverWait(BrowserSelect.getDriver(),10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	
	
	

}
