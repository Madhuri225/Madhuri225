package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Student {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		driver.findElement(By.name("firstName")).sendKeys("Testing");
		driver.findElement(By.id("lastName")).sendKeys("hhhhh");
		driver.findElement(By.id("emailAddress")).sendKeys("kkkk@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("8888888888");
		driver.findElement(By.id("password")).sendKeys("asdfghj");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("asdfghj");
		//Handling Country Drop down 
		
		Select country = new Select(driver.findElement(By.name("nationality")));
		country.selectByVisibleText("UNITED STATES");
		//Handling Attendee type drop down
		
		Select stu = new Select(driver.findElement(By.name("attendeeType")));
		stu.selectByVisibleText("Student Looking for Graduate Degree");
		//Handling Anticipated start term
		
		Select term = new Select(driver.findElement(By.name("questions[q_134]")));
		term.selectByVisibleText("Spring 2022");
		// Handling Dob 
		Select dobMonth = new Select(driver.findElement(By.id("questions_16_Month")));
		dobMonth.selectByVisibleText("January");
		Select dobDay = new Select(driver.findElement(By.id("questions_16_DayOfMonth")));
		dobDay.selectByVisibleText("12");
		Select dobYear = new Select(driver.findElement(By.id("questions_16_DOBYear")));
		dobYear.selectByVisibleText("2006");
		
	}

}
