package corejava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class M_Alert {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		org.openqa.selenium.Alert alert =  driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		if (text.equals("Please enter a valid user name"))
		{
			System.out.println("pop msg is correct");
		}
		else{
		    System.out.println("pop msg is not correct");
		}
		driver.switchTo().alert().accept();
	}

}
