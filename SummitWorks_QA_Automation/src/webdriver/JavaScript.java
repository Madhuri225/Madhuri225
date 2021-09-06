package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shearcircle.com/");

		WebElement ele = driver.findElement(By.xpath("//span[text()='Home']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='6px groove green'", ele);
		Thread.sleep(6000);
		// Scroll to bottom of the element using Javascript
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", ele);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='6px groove green'", ele);
		// click using Javascript
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
	}

}
