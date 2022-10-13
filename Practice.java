package Scs;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	
	
	public static void main(String[] args) {
		System.setProperty("Webdriver.driver.chrome","c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); 
		driver.get("https://www.cornerstoneondemand.com/contact-us/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[placeholder='Enter your first name']")).sendKeys("atul");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[placeholder='Enter your last name']")));
		
	}

}
