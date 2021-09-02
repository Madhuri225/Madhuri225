package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wwww.facebook.com/");
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("email")).sendKeys("KKK@gmail.com");
	    driver.navigate().refresh();
	    driver.findElement(By.linkText("Forgot Password?")).click();
	    driver.navigate().back();
	    driver.navigate().forward();
	    driver.close();
	}

}
