package webdriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Blazedemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Select fromcity = new Select(driver.findElement(By.name("fromPort")));
		fromcity.selectByVisibleText("Paris");
		Select tocity = new Select(driver.findElement(By.name("toPort")));
		tocity.selectByVisibleText("Rome");	
        driver.findElement(By.xpath("//input[@type = 'submit']")).click();
        driver.findElement(By.xpath("(//input[@type='submit'])[5]")).click();
        driver.findElement(By.id("inputName")).sendKeys("aaa");
        driver.findElement(By.id("address")).sendKeys("bbbaa");
        driver.findElement(By.id("city")).sendKeys("nnnn");
        driver.findElement(By.id("state")).sendKeys("mmmm");
        driver.findElement(By.id("zipCode")).sendKeys("999999");
        Select cardt = new Select(driver.findElement(By.id("cardType")));
        cardt.selectByVisibleText("American Express");
        Thread.sleep(2000);
	    driver.findElement(By.id("creditCardNumber")).sendKeys("12345678");
	    driver.findElement(By.id("creditCardMonth")).sendKeys("12");
	    driver.findElement(By.id("creditCardYear")).sendKeys("14");
	    driver.findElement(By.id("nameOnCard")).sendKeys("AAAA"); 
	    driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	    Thread.sleep(2000);
	    System.out.println(driver.findElement(By.xpath("//h1[text() = 'Thank you for your purchase today!']")).getText());
	   
	    }
}
