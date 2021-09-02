package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToyotaWebele {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		driver.findElement(By.id("tgbgdpr-overlay-agree")).click();
		List<WebElement> Hyp = driver.findElements(By.tagName("a"));
		int hypcnt = Hyp.size();
		System.out.println(hypcnt);
		List<WebElement> editbox = driver.findElements(By.xpath("//input[@type = 'text']"));
		int editboxcnt = editbox.size();
		System.out.println(editboxcnt);
		List<WebElement> radiob = driver.findElements(By.xpath("//input[@type = 'radio']"));
		int radiobcnt = editbox.size();
		System.out.println(radiobcnt);
		Thread.sleep(2000);
		List<WebElement> drop = driver.findElements(By.xpath("//select"));
		int dropcnt = drop.size();
		System.out.println(dropcnt);
		Thread.sleep(2000);
		List<WebElement> check = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		int checkcnt = check.size();
		System.out.println(checkcnt);
		Thread.sleep(2000);
		List<WebElement> img = driver.findElements(By.xpath("//images"));
		int imgcnt = img.size();
		System.out.println(imgcnt);
		List<WebElement> button = driver.findElements(By.xpath("//button"));
		int buttoncnt = button.size();
		System.out.println(buttoncnt);

	}

}
