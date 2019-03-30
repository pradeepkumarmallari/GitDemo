package automationFlow;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;

public class SelAdvPrac {
  @Test
  public void f() {
	  SoftAssert softAssert=new SoftAssert();
	  softAssert.assertFalse("add"=="ad");
	  System.out.println("hjdkasfjhfkd");
	  softAssert.assertAll();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
