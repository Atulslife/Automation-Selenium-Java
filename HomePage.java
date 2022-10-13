package uITeatingWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chrome","c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("http://www.uitestpractice.com");
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		//new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("http://www.uitestpractice.com")));
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		WebElement ele=driver.findElement(By.name("dblClick"));
		action.doubleClick(ele).build().perform();
		driver.switchTo().alert().accept();
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//*[@id=\'name\']")).sendKeys("atul");
		WebElement ele1=driver.findElement(By.xpath("//html/body/div[2]/div[1]/div[3]/p/a"));
		ele1.click();
		//new WebDriverWait(driver,Duration.ofSeconds(3)).until(ExpectedConditions.visibilityOfAllElements(ele1));
		
		//driver.navigate().back();
		
		
	}

}
