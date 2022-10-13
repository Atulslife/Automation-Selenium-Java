package Scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeCheck {
	public static void main(String arg[]) {
		System.setProperty("webdriver.driver.chrome", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://eroomrent.in");
		WebElement ele = driver.findElement(By.className("img-fluid"));
		String s = ele.getAttribute("src");
		String alt = ele.getAttribute("alt");
		System.out.println("Path of image is "+s);
		System.out.println("Alternate text of image is "+alt);
		System.out.println(s);
		driver.close();
	}
}
