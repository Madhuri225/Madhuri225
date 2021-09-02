package webdriver;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ttd {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://ttdsevaonline.com/#/registration");
Thread.sleep(3000);
driver.findElement(By.name("fName")).sendKeys("nnn");
driver.findElement(By.name("lName")).sendKeys("aaaa");
driver.findElement(By.name("mobNo")).sendKeys("8888888888");
driver.findElement(By.name("address1")).sendKeys("xx,dd,ll");
driver.findElement(By.name("address2")).sendKeys("mmm-88");
driver.findElement(By.name("cityS")).sendKeys("mmm");
Select country = new Select(driver.findElement(By.name("countryS")));
country.selectByVisibleText("Afghanistan");
driver.findElement(By.name("statesS")).sendKeys("llll");
driver.findElement(By.name("zipCode")).sendKeys("888888");
Thread.sleep(1000);
Select proof = new Select(driver.findElement(By.name("proofS")));
proof.selectByVisibleText("Aadhaar Card");
driver.findElement(By.name("proofId")).sendKeys("111");
driver.findElement(By.name("emailId")).sendKeys("mmm@gmail.com");
driver.findElement(By.name("password")).sendKeys("Awe1234!");
driver.findElement(By.name("repassword")).sendKeys("Awe1234!");
Scanner scan = new Scanner(System.in);
String Cap = scan.next();
System.out.println("Please enter captcha value...");
driver.findElement(By.id("txtInput")).sendKeys(Cap);
driver.findElement(By.id("regi_continue")).click();
	} 
}
