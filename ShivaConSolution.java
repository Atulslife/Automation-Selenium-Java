package Scs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ShivaConSolution {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.driver.chrome","c://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shivaconceptsolution.com/test.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("txt1")).sendKeys("Atul Mishra");
		driver.findElement(By.id("txt2")).sendKeys("Atul");
		driver.findElement(By.id("txt3")).sendKeys("atultest0@gmail.com");
		driver.findElement(By.cssSelector("input[type=date]")).sendKeys("28.05.2022");
		driver.findElement(By.id("txt4")).sendKeys("9178172253");
		driver.findElement(By.linkText("Click")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("shivaconcept")).click();
		driver.navigate().back();
		driver.findElement(By.className("abc")).sendKeys("class name locator");
		//driver.findElement(By.id("b")).sendKeys("locator");
		driver.findElement(By.xpath("//html/body/input[7]")).sendKeys("Xpath locator");
        driver.findElement(By.cssSelector("input[value=click]")).sendKeys("css selector");	
        driver.findElement(By.cssSelector("input.abc[value=hello]")).sendKeys("Tag name,class name,Attribute Name");
        driver.findElement(By.cssSelector("input.abc[value=hi]")).sendKeys("Tag name,class name,Attribute Name");
	    driver.findElement(By.cssSelector("input[value=FeMale]")).click();
	    driver.findElement(By.partialLinkText("Welcome in SCS")).click();
	    driver.navigate().back();
	    driver.findElement(By.name("chk1")).click();
	    driver.findElement(By.name("chk2")).click();
	    Select s=new Select(driver.findElement(By.id("c")));
	    s.selectByIndex(2);
	    Select s1=new Select(driver.findElement(By.name("c[]")));
	    s1.selectByIndex(1);
	    s1.selectByIndex(2);
	    s1.selectByIndex(3);
	    driver.findElement(By.xpath("//html/body/input[16]")).sendKeys("full xpath");
	    driver.findElement(By.xpath("//html/body/input[17]")).sendKeys("full xpath");
	    driver.findElement(By.xpath("//html/body/input[18]")).sendKeys("full xpath");
	    driver.close();
	    
	}
}