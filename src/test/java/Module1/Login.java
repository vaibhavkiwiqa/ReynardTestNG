package Module1;

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

	@BeforeTest
	public void openBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://reynard-qa-m7xqu.ondigitalocean.app/authentication/sign-in");

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
