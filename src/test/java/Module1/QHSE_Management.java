package Module1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class QHSE_Management extends Login {

	@Test
	public void QHSE_Management1() throws InterruptedException {
		Thread.sleep(3000);
		WebElement m = driver.findElement(By.xpath("//span[text()='QHSE Cards']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", m);

	}

}
