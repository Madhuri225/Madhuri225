package webdriver;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actionssample {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		// create action class reference
		Actions act = new Actions(driver);

		// double click on operations on webelement
		WebElement doubleClickEle = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(doubleClickEle).perform();

		WebDriverWait ww = new WebDriverWait(driver, 20);
		ww.until(ExpectedConditions.alertIsPresent());

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		// Right click on operations on webelement
		act.contextClick(ele).perform();

		driver.navigate().to("https://www.platformqedu.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// Move to element
		WebElement productEle = driver.findElement(By.xpath("//a[@title='Products']"));
		act.moveToElement(productEle).build().perform();
		
		
		//Drog and drop
		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		WebElement fromEle = driver.findElement(By.xpath("//*[text()=' BANK ']"));
		WebElement toEle = driver.findElement(By.xpath("//*[@id='bank']/li"));
		act.dragAndDrop(fromEle, toEle).build().perform();
		
		
		driver.navigate().to("http://google.com");
		WebElement editbox = driver.findElement(By.name("q"));
		act.moveToElement(editbox).keyDown(Keys.SHIFT).sendKeys("selenium").build().perform();

	}

}
