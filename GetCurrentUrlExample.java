package Scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlExample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eroomrent.in");
		driver.findElement(By.partialLinkText("Contact")).click();
		String contacturl = driver.getCurrentUrl();
		System.out.println("Contact page url is "+contacturl);
		driver.findElement(By.partialLinkText("FAQ")).click();
		String faqurl = driver.getCurrentUrl();
		System.out.println("FAQ page url is "+faqurl);
		driver.close();

	}

}
