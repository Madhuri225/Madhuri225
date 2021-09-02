package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://stqatools.com/demo/Drag&Drop.php#");
		Actions act = new Actions(driver);
		WebElement fele = driver.findElement(By.xpath("//img[@id='dragA']"));
		WebElement tele = driver.findElement(By.xpath("//*[@id='dropBox']"));
		act.dragAndDrop(fele, tele).build().perform();
	}

}
