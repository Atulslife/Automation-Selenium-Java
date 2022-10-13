package Scs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckRadioButtonAligment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://shivaconceptsolution.com/test.html");
		WebElement ele = driver.findElement(By.cssSelector("input[value=FeMale]"));
		String rblocation2 = ele.getLocation().toString();
		System.out.println(rblocation2);
		WebElement ele1 = driver.findElement(By.cssSelector("input[value=Male]"));
		String rblocation1 = ele1.getLocation().toString();
		System.out.println(rblocation1);
		int x1 = ele1.getLocation().x;
		int x2 = ele.getLocation().x;
		if (x1 == x2) {
			System.out.println("Radio button is aligned");
		} else {
			System.out.println("Radio button is not aligned");
		}
		driver.close();
	}
}
