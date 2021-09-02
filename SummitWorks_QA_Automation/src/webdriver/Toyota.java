package webdriver;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Toyota {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.toyota.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		//driver.findElement(By.xpath("//*[@id=\"ctaBar\"]/a[4]/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ctaBar\"]/a[4]/div/span")).click();
		Thread.sleep(10000);
		String pw = driver.getWindowHandle();
		Set<String> cw = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String a: cw) {
			if (!pw.equals(a)) {
				driver.switchTo().window(a);
				Select car = new Select(driver.findElement(By.xpath("//*[@id=\"codeweaversModels\"]")));
				car.selectByVisibleText("Hilux");
			}
					}
		

	}

}
