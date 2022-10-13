package uITeatingWeb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First {
	WebDriver driver;

	@BeforeMethod

	public void testCaseBeforeMethod()

	{

		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://eroomrent.in/ownerlogin.php");

	}

	@Test(priority = 2)

	public void testCaseMethodFirst() // Test case method1

	{

		WebElement txtemail = driver.findElement(By.name("txtEmail"));

		txtemail.sendKeys("nitinjatav@gmail.com");

		WebElement txtpass = driver.findElement(By.name("txtPassword"));

		txtpass.sendKeys("123456789");

		WebElement btn = driver.findElement(By.name("btnsubmit"));

		btn.click();

		String s = driver.getCurrentUrl();

		if (s.equals("https://eroomrent.in/owner/dashboard.php"))

		{

			System.out.println("Login Successfully");

		}

		else

		{

			System.out.println("Invalid Password");

		}

	}

	@Test(priority = 1)

	public void testCaseMethodSecond() // Test case method2

	{

		WebElement txtemail = driver.findElement(By.name("txtEmail"));

		txtemail.sendKeys("nitinjatav@gmail.com");

		WebElement txtpass = driver.findElement(By.name("txtPassword"));

		txtpass.sendKeys("12345678");

		WebElement btn = driver.findElement(By.name("btnsubmit"));

		btn.click();

		String s = driver.getCurrentUrl();

		if (s.equals("https://eroomrent.in/owner/dashboard.php"))

		{

			System.out.println("Login Successfully");

			driver.findElement(By.linkText("Add Room")).click();

			Select loc = new Select(driver.findElement(By.name("ddllocation")));

			loc.selectByIndex(2);

			Select cat = new Select(driver.findElement(By.name("ddlcat")));

			cat.selectByIndex(2);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

			Select scat = new Select(driver.findElement(By.name("ddlsubcat")));

			scat.selectByIndex(2);

			driver.findElement(By.name("txtdesc")).sendKeys("description");

			driver.findElement(By.name("file")).sendKeys("d://screenshot.png");

			driver.findElement(By.name("txtamount")).sendKeys("1200");

			driver.findElement(By.name("txtfacility")).sendKeys("facility ");

			driver.findElement(By.name("btnsubmit")).click();

			driver.findElement(By.linkText("Logout")).click();

			// driver.close();

		}

		else

		{

			System.out.println("Problem in login");

		}

	}

	@AfterMethod

	public void testCaseAfterMethod()

	{

		driver.close();
	}
}
