package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JRI_create {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.justrechargeit.com/");
        driver.findElement(By.id("signup-link9")).click();
        driver.findElement(By.id("signup_name")).sendKeys("asdfghj");
        driver.findElement(By.id("signup_mobileno")).sendKeys("9999999999");
        driver.findElement(By.id("signup_email")).sendKeys("lll@gmail.com");
        driver.findElement(By.id("signup_password")).sendKeys("123456");
        driver.findElement(By.id("imgbtnSubmit")).click();
        
	}

}
