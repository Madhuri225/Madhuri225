package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StqaEdit {
public static void main(String[] args) {
	
			WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://stqatools.com/demo/WebTable.php");
			driver.findElement(By.xpath("(//button[@data-target=\"#edit\"])[2]")).click();
			//driver.findElement((By.xpath("(//button[@data-target=\"#edit\"])[2]")).cssSelector(null)
			driver.findElement(By.xpath("//input[@id=\"fn\"]")).sendKeys("aaa");
			driver.findElement(By.xpath("//input[@id=\"ln\"]")).sendKeys("bbb");
			driver.findElement(By.xpath("//input[@id=\"mn\"]")).sendKeys("ccc");
			
			driver.findElement(By.xpath("//button[text()=\"Update\"]")).click();
			
}

}
