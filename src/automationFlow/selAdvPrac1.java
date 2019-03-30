package automationFlow;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class selAdvPrac1 {
	WebDriver driver;
  @Test
  public void f() {
	  //assertFalse("add"=="ad");
	  //System.out.println("hjdkasfjhfkd");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }
  
  public void xpathG(String book) {
	driver.findElement(By.xpath("//*[@id=\"”BankList”\"]/"));  
  }

}
