package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		String pw = driver.getWindowHandle();
		driver.findElement(By.linkText("Click to open new Tab")).click();
		Thread.sleep(2000);
		//System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getWindowHandles());
		Set<String> cw = driver.getWindowHandles();
		Thread.sleep(2000);
		for (String a : cw) {
			if (!pw.equals(a)) {
				driver.switchTo().window(a);
				driver.close();
			}
		}
		driver.switchTo().window(pw);
		driver.findElement(By.xpath("//*[text()=' New Message Window ']")).click();
	}

}
