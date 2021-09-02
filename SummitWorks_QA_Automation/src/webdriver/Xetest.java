package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;

import corejava.SysDate;

public class Xetest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.xe.com/");
	Thread.sleep(5000);
	String cur = driver.findElement(By.id("amount")).getAttribute("value");
	System.out.println(cur);
	Thread.sleep(2000);
	String txt = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[3]/section/div[1]/h2")).getText();
	System.out.println(txt);
	
	}

}
