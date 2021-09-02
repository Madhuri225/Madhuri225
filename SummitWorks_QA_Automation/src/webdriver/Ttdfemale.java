package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ttdfemale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='radio'])[4]")).click();

	}

}
