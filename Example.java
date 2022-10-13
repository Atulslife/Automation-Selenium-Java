package Scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shivaconceptsolution.com/test.html");
		driver.findElement(By.id("txt1")).sendKeys("amit");
		driver.findElement(By.name("txt2")).sendKeys("amit");
		driver.findElement(By.cssSelector("input[type=email]")).sendKeys("amit@gmail.com");
		driver.findElement(By.cssSelector("input[type=date]")).sendKeys("10.10.2010");
		driver.findElement(By.cssSelector("input[type=number]")).sendKeys("1234567890");
		driver.findElement(By.linkText("Click")).click();
		driver.navigate().back();
	}

}
