package Scs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eroomrent {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.driver.chrome","c:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shivaconceptsolution.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.navigate().refresh();
		driver.close();
	}

}
