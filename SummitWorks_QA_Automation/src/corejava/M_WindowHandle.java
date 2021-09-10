package corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M_WindowHandle {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\udays\\Desktop\\QA_Docs");
	}

}
