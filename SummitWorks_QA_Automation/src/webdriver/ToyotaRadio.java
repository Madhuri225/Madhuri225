package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToyotaRadio {

	public static void main(String[] args) throws InterruptedException {
		// *[@id="delivery_method"]/div/ul/li[2]/a/div
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toyota.co.uk/order-a-brochure");
		//driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//WebElement dn = driver.findElement(By.xpath("(//*[contains(text(),'Download')])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement dn = driver.findElement(By.xpath("//div[text()='Download']"));
		wait.until(ExpectedConditions.elementToBeSelected(dn));
		// WebElement dn = driver.findElement(By.xpath("//div[text()='Download']"));
		//WebElement dn = driver.findElement(By.linkText("Download"));
		//WebElement dn = driver.findElement(By.partialLinkText("Download"));
		dn.click();
		// driver.findElement(By.xpath("//*[@id=\"delivery_method\"]/div/ul/li[2]/a/div]")).click();
	}

}
