package webdriver;

import java.awt.Window;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.flipkart.com/");
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		// String pw = driver.getWindowHandle();
		// System.out.println(pw);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[2]/a/div[1]/div/img")).click();
		// Set<String> cw = driver.getWindowHandles();
		// System.out.println(cw);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement pin = driver.findElement(By.xpath("//input[@name='pincode']"));
		pin.sendKeys("500009");
		WebElement enter = driver.findElement(By.name("pincode"));
		enter.sendKeys(Keys.RETURN);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//img[@alt='Snacks & Beverages']"))).perform();
		WebElement snacks = driver.findElement(By.xpath("//*[text()='Biscuits']"));
		snacks.click();
		// *[@id="container"]/div/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/div/div/div[2]/div[1]/a/div/div/img
		WebElement biscuits = driver
				.findElement(By.xpath("//img[@alt='BRITANNIA Little Hearts Classic Sweet & Salty']"));
		biscuits.click();
		System.out.println(driver.getTitle());
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// WebElement ele = driver.findElement(By.linkText("ADD TO BASKET"));
		// js.executeScript("arguments[0]", ele);
		// ele.click();
		Set<String> wn = driver.getWindowHandles();
		System.out.println(wn);
	
		for (String a : wn) {
			if (!a.equals(pw)) {
				System.out.println(a);
				driver.switchTo().window(a);
				//WebDriverWait ww = new WebDriverWait(driver, 25);
				//ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//button[text()='ADD TO BASKET']")));
				WebElement ele = driver.findElement(By.xpath("//button[text()='ADD TO BASKET']"));
				// ele.click();
				//js.executeScript("win)
				
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
				((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
			}
		}
		//WebDriverWait ww = new WebDriverWait(driver, 25);
		//ww.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//*[text()='ADD TO BASKET']")));

		//WebElement ele = driver.findElement(By.xpath("//*[text()='ADD TO BASKET']"));
		// ele.click();

	//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	//	((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
	}

}
