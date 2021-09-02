package webdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jrilogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx ");
		driver.findElement(By.name("txtUserName")).sendKeys("Testing");
		driver.findElement(By.id("txtPasswd")).sendKeys("asdfghj");
		
		    Scanner scan = new Scanner(System.in);
			String Captcha = scan.next();
			System.out.println("Please enter captcha value...");
			driver.findElement(By.id("txtCaptcha")).sendKeys(Captcha);
		
		driver.findElement(By.name("imgbtnSignin")).click();
	}

}
