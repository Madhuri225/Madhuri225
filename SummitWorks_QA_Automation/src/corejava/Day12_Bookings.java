package corejava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day12_Bookings {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.booking.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'ss']")).sendKeys("Hyd");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hyderabad']")).click();
		driver.findElement(By.xpath("(//span[text()='20'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='3'])[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"frm\"]/div[1]/div[4]/div[2]/button/span[1]")).click();
		
		
	}

}
