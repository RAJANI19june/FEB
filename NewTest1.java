package R01_Selenium_PAck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  
	  System.setProperty("webDriver.gecko.driver","/home/quastech/Downloads/geckodriver");
	  WebDriver d=new FirefoxDriver();
	  
	  d.get("kajhfghgdfgrt.com/");
	  
	  
	  
  }
}
