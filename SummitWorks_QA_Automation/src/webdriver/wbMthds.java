package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbMthds {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String txt =driver.findElement(By.className("_8eso")).getText();
        System.out.println(txt);
        driver.get("https://www.google.com/");
        String txt1 = driver.findElement(By.name("btnI")).getAttribute("value");
        System.out.println(txt1);
        
	}

}
