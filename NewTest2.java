package R01_Selenium_PAck;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class NewTest2 
{
  @Test
  public void f() 
  {
	 System.setProperty("webDriver.gecko.driver","/home/quastech/Downloads/geckodriver");
	  WebDriver d=new FirefoxDriver();
	  
	  d.get("https://www.amazon.in/");
  }

}
