package uITeatingWeb;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstPage {
	WebDriver driver ; 
	  @BeforeTest
	  public void f1()
	  {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver= new ChromeDriver();
	     driver.manage().window().maximize();
	  }
	  @BeforeMethod
	  public void funDisplay()
	  {
	   driver.get("http://newtours.demoaut.com/");
	   System.out.print(driver.getTitle());
	  }
	  @Test
	  public void f() {
	   driver.get("http://newtours.demoaut.com/mercuryunderconst.php");
	   System.out.print(driver.getTitle());
	  }
	  @Test
	  public void f2() {
	   driver.get("http://newtours.demoaut.com/mercuryregister.php");
	   System.out.print(driver.getTitle());
	  }
	  @AfterMethod
	  public void funDisplay2()
	  {
	   driver.navigate().back();
	   driver.navigate().refresh();
	  }
	  @AfterTest
	  public void f3()
	  {
	 driver.close();  
	  }
}
