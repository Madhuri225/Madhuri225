package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class StuErrorMsg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://collegeweeklive.com/go-signup/");
        Thread.sleep(3000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        String txt1 = driver.findElement(By.xpath("//*[@id=\"firstNameError\"]/span")).getText();
        System.out.println(txt1);
        String txt2 = driver.findElement(By.xpath("//*[@id=\"lastNameError\"]/span")).getText();
        System.out.println(txt2);
        String txt3 = driver.findElement(By.xpath("//*[@id=\"emailAddressError\"]/span")).getText();
        System.out.println(txt3);
        String txt4 = driver.findElement(By.xpath("//*[@id=\"phoneNumberError\"]/span")).getText();
        System.out.println(txt4);
        String txt5 = driver.findElement(By.xpath("//*[@id=\"passwordError\"]/span")).getText();
        System.out.println(txt5);
        String txt6 = driver.findElement(By.xpath("//*[@id=\"ConfirmPasswordError\"]/span")).getText();
        System.out.println(txt6);
        
        String txt7 = driver.findElement(By.xpath("//*[@id=\"nationalityError\"]/span")).getText();
        System.out.println(txt7);
        String txt8 = driver.findElement(By.xpath("//*[@id=\"attendeeTypeError\"]/span")).getText();
        System.out.println(txt8);
	}

}
