package Module1;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {

	static WebDriver driver;
	public static Logger logs;

	@BeforeTest
	public void openBrowser() {
        logs = Logger.getLogger("devpinoyLogger");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reynard-qa-m7xqu.ondigitalocean.app/authentication/sign-in");
        logs.info("Browser Open");
	}

	@Test
	@Parameters({ "username", "password" })
	public void login(String username, String password) throws InterruptedException {

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(3000);

	}
}
