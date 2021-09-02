package webdriver;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PetStore {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://petstore.octoperf.com/actions/Account.action");
        driver.findElement(By.linkText("Register Now!")).click();
        driver.findElement(By.name("username")).sendKeys("aaa");
        driver.findElement(By.name("password")).sendKeys("Awe1234!");
        driver.findElement(By.name("repeatedPassword")).sendKeys("Awe1234!");
        driver.findElement(By.name("account.firstName")).sendKeys("mmm");
        driver.findElement(By.name("account.lastName")).sendKeys("aaa");
        driver.findElement(By.name("account.email")).sendKeys("aaa@gmail.com");
        driver.findElement(By.name("account.phone")).sendKeys("9999999999");
        driver.findElement(By.name("account.address1")).sendKeys("bbbbb");
        driver.findElement(By.name("account.address2")).sendKeys("ccc");
        driver.findElement(By.name("account.city")).sendKeys("dddd");
        driver.findElement(By.name("account.state")).sendKeys("fff");
        driver.findElement(By.name("account.zip")).sendKeys("9999");
        driver.findElement(By.name("account.country")).sendKeys("gg");
        Select lan = new Select(driver.findElement(By.name("account.languagePreference")));
        lan.selectByVisibleText("english");
        Select pet = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
        pet.selectByVisibleText("FISH");
        driver.findElement(By.name("account.listOption")).click();

        driver.findElement(By.name("newAccount")).click();
	}

}
