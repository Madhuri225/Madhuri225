package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jriday10 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.id("signup-link9")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if (driver.findElement(By.id("ancRegister9")).isDisplayed()) {
			System.out.println("We are in Create Account Page");
		
		}
		else {
			System.out.println("We are not in Create Account Page");
		}
		driver.findElement(By.id("imgbtnSubmit")).click();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		driver.close();
		}

}
