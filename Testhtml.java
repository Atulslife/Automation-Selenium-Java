package Scs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;

public class Testhtml {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.driver.chrome", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shivaconceptsolution.com/test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.findElement(By.id("txt1")).sendKeys("atul");
		driver.findElement(By.name("txt2")).sendKeys("atul123");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("atultest0@gmail.com");
		driver.findElement(By.name("txt3")).sendKeys("04-02-1987");
		driver.findElement(By.id("txt4")).sendKeys("9039817558");
		driver.findElement(By.xpath("/html/body/a[1]")).click();
		new WebDriverWait(driver, Duration.ofSeconds(5))
				.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("/html/body/a[1]")));
		driver.navigate().back();
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:\\abc.jpg"));

	}

}
