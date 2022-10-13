package Scs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://eroomrent.in");
		 System.out.print(driver.getPageSource());

	}

}
